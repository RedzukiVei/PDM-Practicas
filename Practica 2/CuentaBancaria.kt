class CuentaBancaria(private var saldo: Double, private var limiteRetiro: Double) {
    
    fun getSaldo(): Double = saldo              //Obtenemos el saldo de tipo double

    fun setSaldo(NuevoSaldo : Double) {         //Obtenemos el nuevo saldo basandonos en el saldo anteriormente obtenido 
        if(NuevoSaldo >= 0) {
            saldo = NuevoSaldo
        }
        else {
            println("El saldo no puede estar en números rojos, mi estimado")
        }
    }

    fun retirar(cantidad: Double) {              //Creamos la funcion retira
        if (cantidad > limiteRetiro) {          //if en caso de que nos pasemos del limite
            println("Usted esta excediendo la cantidad de retiro que tiene.")
        } else if (cantidad > saldo) {           //if en caso de que la cantidad en retirar sea superior al saldo
            println("No cuenta con el saldo suficiente.")
        } else {
            saldo -= cantidad                   //Si se cumple el retiro, se restara al saldo, la cantidad retirada
            println("Has logrado retirar con exito. Su saldo actual es: $$saldo")
        }
    }
}

fun main() {
    val cuenta = CuentaBancaria(1000.0, 500.0)
    var continuar = true

    while (continuar) {
        println("Opciones:")
        println("1. Retirar dinero")
        println("2. Depositar dinero")
        println("3. Ver saldo")
        println("4. Salir")

        print("Ingrese una opción: ")
        val opcion = readLine()!!.trim()

        when (opcion) {
            "1" -> {
                print("Ingrese la cantidad a retirar: ")
                val cantidad = readLine()!!.trim().toDouble()
                cuenta.retirar(cantidad)
            }
            "2" -> {
                print("Ingrese la cantidad a depositar: ")
                val cantidad = readLine()!!.trim().toDouble()
                cuenta.setSaldo(cuenta.getSaldo() + cantidad)
            }
            "3" -> {
                println("Su saldo actual es: $${cuenta.getSaldo()}")
            }
            "4" -> {
                println("Saliendo...")
                continuar = false
            }
            else -> {
                println("Opción inválida. Intente nuevamente.")
            }
        }
    }
}