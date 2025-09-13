/*
    Descripción: Programa que simula el juego de Piedra, Papel o Tijera contra la computadora.
                 La computadora elige una opción aleatoria y se compara con la del usuario.
    Autor: Melvin Yabar Carazas
    Fecha de creación: 25/08/2025
    Última modificación: 25/08/2025
*/

import kotlin.random.Random
//Importa la librería Random de Kotlin para generar números aleatorios

fun main() {
    println("=== Juego: Piedra, Papel o Tijera ===")
    println("Opciones: 1. Piedra | 2. Papel | 3. Tijera")

    // Lee la opción del usuario y maneja valores nulos o inválidos
    print("Elige una opción (1-3): ")
    val opcionUsuario = readln().toIntOrNull()
    // Valida el rango
    if (opcionUsuario !in 1..3) {
        println(" Opción inválida. Intenta de nuevo.")
        return
    }
    // Random.nextInt(1, 4) genera un número entero aleatorio desde 1 hasta 4 sin incluir al 4
    val opcionComputadora = Random.nextInt(1, 4)

    // Convierte los numeros a las opciones Piedra, Papel o Tijera
    val jugadaUsuario = convertirOpcion(opcionUsuario!!)
    val jugadaComputadora = convertirOpcion(opcionComputadora)

    // Muestra los resultados
    println("\nTú elegiste: $jugadaUsuario")
    println("La computadora eligió: $jugadaComputadora")

    val resultado = resultadoJuego(opcionUsuario, opcionComputadora)
    println("Resultado: $resultado")
}

// Convierte número a texto (1=Piedra, 2=Papel, 3=Tijera)
fun convertirOpcion(opcion: Int): String {
    return when (opcion) {
        1 -> "Piedra"
        2 -> "Papel"
        3 -> "Tijera"
        else -> "Desconocido"
    }
}

// Determina el resultado del juego
fun resultadoJuego(usuario: Int, computadora: Int): String {
    return if (usuario == computadora) {
        "Empate "
    } else if ((usuario == 1 && computadora == 3) ||
        (usuario == 2 && computadora == 1) ||
        (usuario == 3 && computadora == 2)) {
        "¡Ganaste! "
    } else {
        "Perdiste "
    }
}
