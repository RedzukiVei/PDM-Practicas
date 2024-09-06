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

    }