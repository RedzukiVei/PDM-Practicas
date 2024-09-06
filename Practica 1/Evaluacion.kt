fun evaluarEmpleado(puntuacion: Double, salario: Double): Pair<String, Double> {        //utilizo la funcion Pair, para retornar la puntuacion y el salario del empleado.
    val nivelRendimiento = when (puntuacion) {                  //Analizamos el nivel del rendimiento a partir de la puntuacion
        in 0.0..3.0 -> "Inaceptable"
        in 4.0..6.0 -> "Aceptable"
        in 7.0..10.0 -> "Meritorio"
        else -> "Usted es tan bueno o malo, que excede nuestros niveles de rendimiento, aunque igual su puntuación no es válida"
    }
    val dinero = if (puntuacion in 0.0..10.0) salario * (puntuacion / 10) else 0.0      //Sacamos el salario del empleado a partir de su puntuacion
    return Pair(nivelRendimiento, dinero)               //Se retorna el rendimiento y salario del empleado
}

