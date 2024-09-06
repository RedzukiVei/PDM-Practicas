import kotlin.random.Random

fun jugarjankenpo(Opcion: String): String {
    val opciones = arrayOf("piedra", "papel", "tijera")             //Creamos las opciones de siempre en jankenpo
    val seleccionComputadora = opciones[Random.nextInt(3)]          //Hacemos un randomizador para la eleccion del CPU

    return when {                                                   //Realizamos las respuestas de empate, victoria y derrota
        Opcion == seleccionComputadora -> "Realmente lo hicieron, !EMPATARON!"
        (Opcion == "piedra" && seleccionComputadora == "tijera") || 
        (Opcion == "papel" && seleccionComputadora == "piedra") ||
        (Opcion == "tijera" && seleccionComputadora == "papel") -> "Felicidades, realmente le ganaste al 33%, sientete orgulloso"
        
        else -> "Lastima bro, pero recuerda, hasta los mejores pierden"
     }
}

fun main (){
    println("Elige pibe:")                                          //Menú principal de eleccion
    println("piedra")
    println("papel")
    println("tijera")
    
    val Opcion = readLine()                                         //Lee la opcion que elegimos
    
    val resultado = Opcion?.let{ jugarjankenpo(it) }                //Evitamos que regrese un null mediante Opcion?.let y leemos jugarjankenpo

    if (resultado != null) {                                        //Un if en caso de que no encuentre una opción válida
        println(resultado)
    } else {
        println("No se proporcionó una opción válida")
    }
}