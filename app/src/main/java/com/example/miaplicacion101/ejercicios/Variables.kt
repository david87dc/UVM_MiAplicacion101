package com.example.miaplicacion101.ejercicios
fun main() {

    var nombreVariable =    "mi Variable"
    var edad: Int = 37
    var snEstudiante: Boolean = true

    println("Mi nombre es: $nombreVariable y mi edad es: $edad")

    /**
     *  Estructura de control For
     *  Con un rango de 0 a 10
     */

    for (i in 0 ..10) {   //Loop de 0 a 10
        print(" $i")
    }

    var miArreglo = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes")

        for (item in miArreglo) {
            println(item)

        }
    imprmeResultado(9.0)
    imprmeResultado(7.5)
    imprmeResultado(5.6)
    imprmeResultado(3.9)

    var nombre: String? =null
    var edad2: Int? = null

    println("Mi nombre es: ${nombre?.length} y mi edad es: $edad2")
}
fun imprmeResultado(prom: Double){
    when {
        prom >=9.0 -> println("Excelente")
        prom >=7.0 -> println("Muy Bien")
        prom >=5.0 -> println("Bien")
        else -> println("Reprobado")
    }

}