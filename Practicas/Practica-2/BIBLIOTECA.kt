FIGURAS

/*
Clases de figuras geométricas con métodos para obtener área y perímetro.
Autor: Yabar Carazas Melvin Jarred
Fecha de creación: 02/09/2025
Última actualización: 02/09/2025
*/

// Clase abstracta base para cualquier figura
abstract class Figura {
    abstract fun area(): Double
    abstract fun perimetro(): Double

    // Método común para mostrar datos
    fun mostrarInfo() {
        println("Área = ${area()}, Perímetro = ${perimetro()}")
    }
}

// Implementación de un cuadrado
class Cuadrado(private val lado: Double) : Figura() {
    override fun area() = lado * lado
    override fun perimetro() = 4 * lado
}

// Implementación de un rectángulo
class Rectangulo(private val ancho: Double, private val alto: Double) : Figura() {
    override fun area() = ancho * alto
    override fun perimetro() = 2 * (ancho + alto)
}

// Implementación de un círculo
class Circulo(private val radio: Double) : Figura() {
    override fun area() = Math.PI * radio * radio
    override fun perimetro() = 2 * Math.PI * radio
}

// Programa principal
fun main() {
    val f1: Figura = Cuadrado(6.0)
    val f2: Figura = Rectangulo(8.0, 4.0)
    val f3: Figura = Circulo(3.0)

    println("Datos del cuadrado:")
    f1.mostrarInfo()

    println("Datos del rectángulo:")
    f2.mostrarInfo()

    println("Datos del círculo:")
    f3.mostrarInfo()
}
