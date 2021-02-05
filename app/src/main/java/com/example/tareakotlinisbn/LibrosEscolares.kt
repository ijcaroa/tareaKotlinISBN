package com.example.tareakotlinisbn

import android.net.IpPrefix
import kotlin.math.E

data class LibrosEscolares(val nombre: String, val ISBN: Long, var Año: Int, var paginas: Int, var Precio: Int, var Autor: String, var Formato: Char) {


}
fun main() {

    var libros = LibrosEscolares("Tom Sawyer", 1234567891, 1854,
            235, 4990, "Mark Twain", 'I')

    var libros2 = LibrosEscolares("Hijo de Ladrón", 1236325734,
            1957, 198, 3990,"Manuel Rojas", 'I'  )

    precioFormateado(libros.Precio)
    imprimirLista(libros)
}

fun precioFormateado(precio: Int, prefix: Char = '$'){
    println("Precio = $prefix$precio")
}
fun imprimirLista(libros: LibrosEscolares){
    println(libros)
}



