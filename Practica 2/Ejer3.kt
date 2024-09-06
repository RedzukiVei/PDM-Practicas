abstract class Shape {
    abstract fun CalcularArea(): Double
    abstract fun CalcularPerimetro(): Double

    fun ImprimirResultados(){
        println("La Área es: ${CalcularArea()}")
        println("El Perimetro es: ${CalcularPerimetro()}")
    }
}

class Cuadrado(private val lado: Double) : Shape() {

    override fun calcularArea(): Double = lado * lado

    override fun calcularPerimetro(): Double = 4 * lado
}

class Circulo(private val radio: Double) : Shape() {

    override fun calcularArea(): Double = Math.PI * radio * radio           //Se utilzia Math.PI para llamar al poderoso PI osea 3.14

    override fun calcularPerimetro(): Double = 2 * Math.PI * radio
}

class Rectangulo(private val largo: Double, private val ancho: Double) : Shape() {

    override fun calcularArea(): Double = largo * ancho

    override fun calcularPerimetro(): Double = 2 * (largo + ancho)
}

fun main() {
    var continuar = true

    while (continuar) {
        println("Elige una figura:")
        println("1. Cuadrado")
        println("2. Círculo")
        println("3. Rectángulo")
        println("4. Salir")
    }
}