package Ejercicios

fun main(){

    Persona("Jose",10,"Ladrón")
    val articulos = arrayListOf<Articulo>(Articulo(5,10), Articulo(4,40), Articulo(6,30), Articulo(4,50))
    val mochila = arrayListOf<Articulo>()

    articulos.forEach {

    }


}

class Persona {
    var nombre : String
    var mochila : Int
    var perfil : String

    constructor(nombre: String, mochila: Int, perfil: String) {
        this.nombre = nombre
        this.mochila = mochila
        this.perfil = perfil
    }
}

class Articulo {
    var wi : Int
    var vi : Int

    constructor(wi: Int, vi: Int) {
        this.wi = wi
        this.vi = vi
    }
}