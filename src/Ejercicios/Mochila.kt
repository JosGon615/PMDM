package Ejercicios

fun main(){

    Persona("Jose",10,"Ladrón")
    val articulos = arrayListOf<Articulo>(Articulo(5,10), Articulo(4,40), Articulo(6,30), Articulo(4,50))
    val mochila = arrayListOf<Articulo>()
    var peso = 0
    var bo = true
    val listRatio = mutableListOf<Int>()
    var i :Int = 0
    var pos = 0
        articulos.forEach(){
            var ratio = it.vi/it.wi
            listRatio.add(ratio)
        }
        var max = listRatio[0]

        listRatio.forEach(){
            i++
            if (it > max){
                pos = i-1
            }
        }
        mochila.add(articulos[pos])

        listRatio.removeAt(pos)
        articulos.removeAt(pos)

        do {

            peso = 0
            max = listRatio[0]
            pos = 0
            i = 0
            listRatio.forEach(){
                i++
                if (it > max || it == max){
                    pos = i-1
                }
            }
            mochila.forEach(){
                peso = peso + it.wi
            }
            if (peso + articulos[pos].wi <= 10){
                mochila.add(articulos[pos])
                listRatio.removeAt(pos)
                articulos.removeAt(pos)
            }
            else
                bo=false
        }while (bo)

        println("Robado:" + mochila)
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

    override fun toString(): String {
        return "Articulo(wi=$wi, vi=$vi)"
    }


}