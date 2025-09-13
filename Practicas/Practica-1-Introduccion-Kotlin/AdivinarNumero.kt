/*
    Descripción: Juego de adivinar un número entre 1 y 30. El usuario tiene 5 intentos para acertar.
                 Se da una pista en cada intento indicando si el número buscado es mayor o menor.
    Autor: Melvin Yabar Carazas
    Fecha de creación: 25/08/2025
    Última modificación: 25/08/2025
*/

import kotlin.random.Random
//Importa la librería Random de Kotlin para generar números aleatorios

fun main() {
    println("=== Juego: Adivina el Número ===")
    val numeroSecreto = Random.nextInt(1, 31) // número entre 1 hasta 31 ó 1 <= n < 31
    var intentos = 0
    val maxIntentos = 5
    var adivinado = false

    // Bucle principal: se ejecuta mientras queden intentos y no se haya adivinado
    while (intentos < maxIntentos && !adivinado) {
        // Muestra el número de intento actual y el máximo
        print("Intento ${intentos + 1}/$maxIntentos - Ingresa un número (1-30): ")
        val intentoUsuario = readln().toIntOrNull()
        // Valida si la entrada es inválida (null o fuera del rango 1-30)
        if (intentoUsuario == null || intentoUsuario !in 1..30) {
            println("Entrada inválida. Debes ingresar un número entre 1 y 30.")
            continue
        }

        intentos++

        adivinado = comprobarNumero(intentos, intentoUsuario, numeroSecreto)
    }
    if (!adivinado) {
        println("Game Over. El número secreto era: $numeroSecreto")
    }
}

// Función que compara el intento del usuario con el número secreto
fun comprobarNumero(intentos: Int, intentoUsuario: Int, numero: Int): Boolean{
    if (intentoUsuario == numero) {
        println("¡Felicidades! Has adivinado el número en $intentos intentos.")
        return true
    } else if (intentoUsuario < numero) {
        println("El número secreto es MAYOR.")
    } else {
        println("El número secreto es MENOR.")
    }
    return false  // Retorna falso indicando que no se adivinó aún
}