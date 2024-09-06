fun suma(a: Double, b: Double) = a + b
fun resta(a: Double, b: Double) = a - b
fun multiplicacion(a: Double, b: Double) = a * b
fun division(a: Double, b: Double) = if (b != 0.0) a / b else Double.NaN

fun main() {
    var opcion: Int
    do {
        println("==== Menú ====")
        println("1. Suma")
        println("2. Resta")
        println("3. Multiplicacion")
        println("4. Division")
        println("Elige pibe, que operación matemática deseas realizar (solo elige el número): ")
        opcion = readLine()!!.toInt()
    
    if (opcion in 1..4) {
        print("Ingrese el primer número: ")
        val num1 = readLine()!!.toDouble()
        print("Ingrese el segundo número: ")
        val num2 = readLine()!!.toDouble()
    }
}