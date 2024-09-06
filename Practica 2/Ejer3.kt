abstract class Shape {
    abstract fun calcularArea(): Double
    abstract fun calcularPerimetro(): Double

    fun imprimirResultados() {
        println("Área: ${calcularArea()}")
        println("Perímetro: ${calcularPerimetro()}")
    }
}

class Cuadrado(private val lado: Double) : Shape() {
    override fun calcularArea(): Double = lado * lado
    override fun calcularPerimetro(): Double = 4 * lado
}

class Circulo(private val radio: Double) : Shape() {
    override fun calcularArea(): Double = Math.PI * radio * radio               //Se utilzia Math.PI para llamar al poderoso PI osea 3.14
    override fun calcularPerimetro(): Double = 2 * Math.PI * radio
}

class Rectangulo(private val largo: Double, private val ancho: Double) : Shape() {
    override fun calcularArea(): Double = largo * ancho
    override fun calcularPerimetro(): Double = 2 * (largo + ancho)
}

fun main() {
    val cuadrado = Cuadrado(4.0)
    
    val circulo = Circulo(3.0)
    
    val rectangulo = Rectangulo(5.0, 2.0)

    cuadrado.imprimirResultados()
    circulo.imprimirResultados()
    rectangulo.imprimirResultados()
}