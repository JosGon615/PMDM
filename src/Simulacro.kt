fun main (){
    val art = arrayListOf<Articulo>()
    val persona = Personaje("Jose",10,"Ladrón")
    var dado = Dado(1,10)







}

//Crear clase Vivienda que contenga lista de habitaciones

class Vivienda {
    var habitaciones =  ListOf<Habitaciones>()

    fun addHabitacion(habitacion: Habitaciones){
        habitaciones.add(habitacion)
    }

    override fun toString(): String {
        return "Vivienda(habitaciones=$habitaciones)"
    }

}


class Habitaciones{
    var articulos = arrayListOf<Articulo>()
    var personajes = arrayListOf<Personaje>()
    var ventana = false
    var puerta = false


    constructor(articulos: ArrayList<Articulo>, personajes: ArrayList<Personaje>, ventana: Boolean, puerta: Boolean) {
        this.articulos = articulos
        this.personajes = personajes
        this.ventana = ventana
        this.puerta = puerta
    }

    fun art (art : ArrayList<Articulo>, dado : Dado){
        for (i in 0..10){
            art.add(Articulo(dado.tiradaUnica(),dado.tiradaUnica()))
        }
    }

    fun pers (pers : ArrayList<Personaje>, dado : Dado){
        for (i in 0..10){
            pers.add(Personaje("Jose",dado.tiradaUnica(),"Ladrón"))
        }
    }






}

class Articulo(){
    var peso : Int = 0
    var valor : Int = 0

    constructor(peso: Int, valor: Int) : this() {
        this.peso = peso
        this.valor = valor
    }

    override fun toString(): String {
        return "Articulo(peso=$peso, valor=$valor)"
    }

}

class Personaje {
    var nombre : String = ""
    var mochila : Int = 0
    var clase : String = ""

    constructor(nombre: String, mochila: Int, perfil: String) {
        this.nombre = nombre
        this.mochila = mochila
        this.clase = perfil
    }

    override fun toString(): String {
        return "Personaje(nombre='$nombre', mochila=$mochila, perfil='$clase')"
    }
}

class Dado{
    var min : Int = 0
    var max : Int = 0

    constructor(min: Int, max: Int) {
        this.min = min
        this.max = max
    }

    fun tiradaUnica() : Int{
        return (min..max).random()
    }
}