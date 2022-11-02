package Ejercicios

fun main(){

    val razas = arrayListOf<String>("Elfo","Enano","Humano","Goblin")
    val clases = arrayListOf<String>("Mago","Ladron","Guerrero","Berserker")
    val edad = arrayListOf<String>("Anciano","Adulto","Joven")
    var pers = Personaje(razas.random(),clases.random(),edad.random())
    println(pers.toString())
    var q1 = ""

        when(pers.edad){
        "Joven" -> {
            q1 = readln()
            if (q1.equals("¿Cómo estás?")){
                println("De lujo")}
                else if(q1.){

                }
        }
    }




class Personaje{
    var raza : String
    var clase : String
    var edad : String

    constructor(raza: String, clase: String, eVital: String) {
        this.raza = raza
        this.clase = clase
        this.edad = eVital
    }

    override fun toString(): String {
        return "Personaje(raza='$raza', clase='$clase', edad='$edad')"
    }


}


