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
        println("5. Salir")
        println("Elige pibe, que operación matemática deseas realizar (solo elige el número): ")
        opcion = readLine()!!.toInt()
    
    if (opcion in 1..4) {
        print("Ingrese el primer número: ")
        val num1 = readLine()!!.toDouble()
        print("Ingrese el segundo número: ")
        val num2 = readLine()!!.toDouble()

        val resultado = when (opcion) {
            1 -> suma(num1, num2)
            2 -> resta(num1, num2)
            3 -> multiplicacion(num1, num2)
            4 -> division(num1, num2)
            else -> 0.0
        }
        println ("El resultado de la operación matemática que solicito es: $resultado")
        }
    }while (opcion!=5)
}