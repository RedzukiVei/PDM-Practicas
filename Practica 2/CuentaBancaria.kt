class CuentaBancaria(private var saldo: Double, private var limiteRetiro: Double) {
    
    fun getSaldo(): Double = saldo              //Obtenemos el saldo de tipo double

    fun setSaldo(NuevoSaldo : Double) {         //Obtenemos el nuevo saldo basandonos en el saldo anteriormente obtenido 
        if(NuevoSaldo >= 0) {
            saldo = NuevoSaldo
        }
        else {
            println("El saldo no puede estar en números rojos, mi estimado)
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