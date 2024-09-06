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
    }