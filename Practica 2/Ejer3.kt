abstract class Shape {
    abstract fun CalcularArea(): Double
    abstract fun CalcularPerimetro(): Double

    fun ImprimirResultados(){
        println("La Área es: ${CalcularArea()}")
        println("El Perimetro es: ${CalcularPerimetro()}")
    }
}