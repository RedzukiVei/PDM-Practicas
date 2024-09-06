fun suma(a: Double, b: Double) = a + b
fun resta(a: Double, b: Double) = a - b
fun multiplicacion(a: Double, b: Double) = a * b
fun division(a: Double, b: Double) = if (b != 0.0) a / b else Double.NaN        //En caso de que b sea 0, lo tomará como un valor inexistente
fun potenciacion(a: Double, b: Double) = Math.pow(a, b)                         //Math.pow es la misma potenciacion
fun radicacion(a: Double, b: Double) = Math.pow(a, 1.0 / b)            


fun main() {
    var opcion: Int
    do {
        println("==== Menú ====")                           //Menú con las elecciones
        println("1. Suma")
        println("2. Resta")
        println("3. Multiplicacion")
        println("4. Division")
        println("5. Potenciacion")                          //num1 sería la base y num2 el exponente
        println("6.Radicacion")                             //num1 sería el radicando y num2 el indice
        println("7. Salir")
        println("Elige pibe, que operación matemática deseas realizar (solo elige el número): ")
        opcion = readLine()!!.toInt()
    
    if (opcion in 1..4) {
        print("Ingrese el primer número: ")                 //Ingreso de los números
        val num1 = readLine()!!.toDouble()
        print("Ingrese el segundo número: ")
        val num2 = readLine()!!.toDouble()

        val resultado = when (opcion) {                     //lectura de eleccion para efectuar la funcion asignada
            1 -> suma(num1, num2)
            2 -> resta(num1, num2)
            3 -> multiplicacion(num1, num2)
            4 -> division(num1, num2)
            5 -> potenciacion(num1, num2)
            6 -> radicacion(num1, num2)
            else -> 0.0
        }
        println ("El resultado de la operación matemática que solicito es: $resultado")
        }
    }while (opcion!=7)                                      //Practicamente, repetir el proceso, hasta seleccionar 7. salir
}