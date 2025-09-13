/*
    Descripción: Programa que evalúa el rendimiento de un empleado según su puntuación
                 y clasifica el nivel de rendimiento y la cantidad de dinero a recibir.
    Autor: Melvin Yabar Carazas
    Fecha de creación: 25/08/2025
    Última modificación: 25/08/2025
*/

fun main() {
    println("=== Evaluación de Empleados ===")

    //Entrada de datos
    print("Ingrese su salario mensual: ")
    val salario = readln().toDouble()

    print("Ingrese su puntuación (0 - 10): ")
    val puntuacion = readln().toInt()

    //Llamadas a funciones auxiliares
    val nivel = calcularNivel(puntuacion)
    val dinero = calcularDinero(salario, puntuacion)

    //Resultados
    println("\nResultado:")
    println("Nivel de rendimiento: $nivel")
    println("Cantidad de dinero recibido: $dinero")
}

// Función que retorna el nivel de rendimiento según la puntuación
fun calcularNivel(puntuacion: Int): String {
    val nivel : String
    nivel = when (puntuacion) {
        in 0..3 -> "Inaceptable"
        in 4..6 -> "Aceptable"
        in 7..10 -> "Meritorio"
        else -> "Puntuación inválida" //Valores fuera de rango
    }
    return nivel
}

// Función que calcula el dinero recibido según el salario y puntuación
fun calcularDinero(salario: Double, puntuacion: Int): Double {
    return if (puntuacion in 0..10) salario * (puntuacion.toDouble() / 10) else 0.0
    // Expresión valida que puntuacion sea un valor dentro del rango que luego calcula la cantidad de dinero a recibir
}
