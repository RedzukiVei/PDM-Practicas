import kotlin.random.Random

fun adivinalatinka() {
    val numeroAdivinar = Random.nextInt(1, 31)          //limitamos los números desde el 1 al 30, 31 cuenta como limite superior asi que solo toma en cuenta hasta el 30
    var intentos = 5                                    //5 intentos

    while (intentos > 0) {
        print("Adivina el número (entre 1 y 30): ")
        val intento = readLine()!!.toInt()          //Lee la opcion que tomamos

        when {
            intento < numeroAdivinar -> println("El número es mayor, venga se puede mi estimad@") //Muestra si es mayor
            intento > numeroAdivinar -> println("El número es menor, venga se puede mi estimad@") //Muestra si es menor
            else -> {
                println("Felicidades, lograste adivinar el número ganador de la Tinka, es broma, pero hey, lo hiciste bien.")
                return
            }
        }
        intentos--                              //disminuye la cantidad de intentos
        println("No te ridas, te quedan $intentos intentos.")
    }

    println("Fin del juego, hey, lo diste todo pero no siempre se puede ganar, en fin, el número era: $numeroAdivinar")
}

fun main() {
    adivinalatinka()            //Empezamos a jugar o iniciador
}