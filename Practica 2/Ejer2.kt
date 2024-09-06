class Producto(private var precio: Double, private var descuento: Double) {
    
    fun getPrecio(): Double = precio

    fun setPrecio(nuevoPrecio: Double) {
        if (nuevoPrecio >= 0 ){
            precio = nuevoPrecio
        } 
        else{
            println("El precio no puede estar en números rojos o de un valor negativo.")
        }
    }

    fun getDescuento(): Double = descuento

    fun setDescuento(nuevoDescuento: Double) {
        if (nuevoDescuento in 0.0..100.0) {
            descuento = nuevoDescuento
        } else {
            println("El descuento debe estar entre 0 y 100.")
        }
    }

        fun calcularPrecioFinal(): Double {
            return precio - (precio * (descuento / 100))
        }
    }
    
    fun main() {

    print("Ingrese el precio del producto: ")

    val precio = readLine()!!.trim().toDouble()

    print("Ingrese el descuento del producto (0-100): ")
    
    val descuento = readLine()!!.trim().toDouble()

    val producto = Producto(precio, descuento)

    println("Precio final: ${producto.calcularPrecioFinal()}")
}