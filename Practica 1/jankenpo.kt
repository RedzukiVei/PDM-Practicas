import kotlin.random.Random

fun jugarjankenpo(Opcion: String): String {
    val opciones = arrayOf("piedra", "papel", "tijera")
    val seleccionComputadora = opciones[Random.nextInt(3)]

    return when {
        Opcion == seleccionComputadora -> "Realmente lo hicieron, !EMPATARON!"
        (Opcion == "piedra" && seleccionComputadora == "tijera") || 
        (Opcion == "papel" && seleccionComputadora == "piedra") ||
        (Opcion == "tijera" && seleccionComputadora == "papel") -> "Felicidades, realmente le ganaste al 33%, sientete orgulloso"
        
        else -> "Lastima bro, pero recuerda, hasta los mejores pierden"
     }
}

fun main (){

}