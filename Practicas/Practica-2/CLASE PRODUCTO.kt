CLASE PRODUCTO

/*
Clase que representa un producto con validación de precio y descuento.
Autor: Yabar Carazas Melvin Jarred
Fecha de creación: 02/09/2025
Última actualización: 02/09/2025
*/

class Producto(private var precioBase: Double, private var porcentajeDescuento: Double) {

    var precio: Double
        get() = precioBase
        set(nuevoPrecio) {
            if (nuevoPrecio >= 0) {
                precioBase = nuevoPrecio
            } else {
                println("Error: no se admite precio negativo.")
            }
        }

    var descuento: Double
        get() = porcentajeDescuento
        set(nuevoDesc) {
            if (nuevoDesc in 0.0..100.0) {
                porcentajeDescuento = nuevoDesc
            } else {
                println("Error: el descuento debe estar en el rango 0 - 100%.")
            }
        }

    // Calcula el precio final aplicando el descuento
    fun obtenerPrecioFinal(): Double {
        val rebaja = precioBase * (porcentajeDescuento / 100)
        return precioBase - rebaja
    }
}

fun main() {
    // Crear producto inicial
    val laptop = Producto(2500.0, 10.0)

    println("Precio con descuento aplicado: ${laptop.obtenerPrecioFinal()}")

    // Intento con valores inválidos
    laptop.precio = -120.0     // Precio inválido
    laptop.descuento = 120.0   // Descuento inválido

    // Nuevos valores válidos
    laptop.precio = 1800.0
    laptop.descuento = 20.0
    println("Precio actualizado: ${laptop.obtenerPrecioFinal()}")
}