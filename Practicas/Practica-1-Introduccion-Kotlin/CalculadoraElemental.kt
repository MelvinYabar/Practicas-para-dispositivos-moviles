/*
    Descripción: Programa que implementa una calculadora básica (suma, resta, multiplicación, división)
                 con un menú interactivo y validación de opciones.
    Autor: Melvin Yabar Carazas
    Fecha de creación: 25/08/2025
    Última modificación: 25/08/2025
*/

fun main() {
    var opcion: Int

    do {
        mostrarMenu()
        print("Elige una opción (1-5): ")

        // Leer opción
        opcion = readln().toInt()
        // Expresion para realizar la operacion
        if (opcion in 1..4) realizarOperacion(opcion) else println("Ingrese una opción válida")

        println()
    } while (opcion != 5)
    println("Saliendo del programa...")
}

// -------- Funciones --------
// Función que muestra el menú de opciones de la calculadora
fun mostrarMenu() {
    println("==== MENÚ ====")
    println("1. Suma (+)")
    println("2. Resta (-)")
    println("3. Multiplicación (*)")
    println("4. División (/)")
    println("5. Salir")
    println("================")
}

fun realizarOperacion(operacion: Int) {
    // Solicita los dos numeros para la operacion seleccionada
    print("Ingresa el primer número: ")
    val num1 = readln().toDoubleOrNull()
    print("Ingresa el segundo número: ")
    val num2 = readln().toDoubleOrNull()
    // Valida que sean numeros no nulos
    if (num1 == null || num2 == null) {
        println("Error: Debes ingresar números válidos.")
        return
    }
    // Operaciones
    when (operacion) {
        1 -> println("Resultado: ${num1 + num2}") // Suma
        2 -> println("Resultado: ${num1 - num2}") // Resta
        3 -> println("Resultado: ${num1 * num2}") // Multiplicacion
        4 -> { // Division
            if (num2 == 0.0) {
                println("Error: No se puede dividir entre cero.")
            } else {
                println("Resultado: ${num1 / num2}")
            }
        }
    }
}