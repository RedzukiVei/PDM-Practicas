abstract class Material(val titulo: String, val autor: String, val anoPublicacion: Int) {
    abstract fun mostrarDetalles()
}

class Libro(titulo: String, autor: String, anoPublicacion: Int, val genero: String, val numeroPaginas: Int) : Material(titulo, autor, anoPublicacion) {
    override fun mostrarDetalles() {
        println("Libro: $titulo, Autor: $autor, Año: $anoPublicacion, Género: $genero, Páginas: $numeroPaginas")
    }
}

class Revista(titulo: String, autor: String, anoPublicacion: Int, val issn: String, val volumen: Int, val numero: Int, val editorial: String) : Material(titulo, autor, anoPublicacion) {
    override fun mostrarDetalles() {
        println("Revista: $titulo, Autor: $autor, Año: $anoPublicacion, ISSN: $issn, Volumen: $volumen, Número: $numero, Editorial: $editorial")
    }
}

data class Usuario(val nombre: String, val apellido: String, val edad: Int)

interface IBiblioteca {
    fun registrarMaterial(material: Material)
    fun registrarUsuario(usuario: Usuario)
    fun prestarMaterial(usuario: Usuario, material: Material)
    fun devolverMaterial(usuario: Usuario, material: Material)
    fun mostrarMaterialesDisponibles()
    fun mostrarMaterialesPrestadosPorUsuario(usuario: Usuario)
}

class Biblioteca : IBiblioteca {
    private val materialesDisponibles = mutableListOf<Material>()
    private val usuarios = mutableMapOf<Usuario, MutableList<Material>>()

    override fun registrarMaterial(material: Material) {
        materialesDisponibles.add(material)
        println("${material.titulo} registrado.")
    }

    override fun registrarUsuario(usuario: Usuario) {
        usuarios[usuario] = mutableListOf()
        println("Usuario ${usuario.nombre} registrado.")
    }

    override fun prestarMaterial(usuario: Usuario, material: Material) {
        if (materialesDisponibles.contains(material)) {
            materialesDisponibles.remove(material)
            usuarios[usuario]?.add(material)
            println("${material.titulo} prestado a ${usuario.nombre}.")
        } else {
            println("Material no disponible.")
        }
    }

    override fun devolverMaterial(usuario: Usuario, material: Material) {
        if (usuarios[usuario]?.contains(material) == true) {
            usuarios[usuario]?.remove(material)
            materialesDisponibles.add(material)
            println("${material.titulo} devuelto por ${usuario.nombre}.")
        } else {
            println("El material no fue prestado a este usuario.")
        }
    }

    override fun mostrarMaterialesDisponibles() {
        println("Materiales disponibles:")
        materialesDisponibles.forEach { it.mostrarDetalles() }
    }

    override fun mostrarMaterialesPrestadosPorUsuario(usuario: Usuario) {
        println("Materiales prestados por ${usuario.nombre}:")
        usuarios[usuario]?.forEach { it.mostrarDetalles() }
    }
}

fun main() {
    val biblioteca = Biblioteca()
    
    val libro = Libro("Kotlin Programming", "John Doe", 2020, "Educación", 300)
    val revista = Revista("Tech Today", "Jane Smith", 2021, "1234-5678", 5, 10, "TechPress")

    val usuario = Usuario("Carlos", "Pérez", 25)
    
    biblioteca.registrarMaterial(libro)
    biblioteca.registrarMaterial(revista)
    biblioteca.registrarUsuario(usuario)
    
    biblioteca.prestarMaterial(usuario, libro)
    biblioteca.mostrarMaterialesPrestadosPorUsuario(usuario)
    biblioteca.devolverMaterial(usuario, libro)
    biblioteca.mostrarMaterialesDisponibles()
}