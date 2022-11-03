package Ejercicios

import Acertijos.cifrado

fun main(){

    val razas = arrayListOf<String>("Elfo","Enano","Humano","Goblin")
    val clases = arrayListOf<String>("Mago","Ladron","Guerrero","Berserker")
    val edad = arrayListOf<String>("Anciano","Adulto","Joven")
    var pers = Personaje(razas.random(),clases.random(),edad.random())
    println(pers.toString())

    conver(pers)
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
        return "Nombre: Jack \n" +
                "Raza: $raza \n" +
                "Clase: $clase \n" +
                "Estado Vital: $edad"
    }
}

fun conver(pers : Personaje){
    var q1 = ""
    var cont = 0
    var resp = ""
    do {
        cont = 0
        q1 = readln()
        q1.forEach {
            if(it.isUpperCase()){
                cont += 1
            }
        }
        var tam = q1.length-2
        when(pers.raza){
            "Elfo" -> {
                when(pers.edad){
                    "Joven" -> {
                        if (q1.equals("¿Cómo estás?")){
                            resp="De lujo"
                            cifrado(resp)
                        }
                        else if(q1.contains('¿') && q1.contains('?') && cont==tam){
                            resp="Tranqui se lo que hago"
                            cifrado(resp)
                        }
                        else if (cont==q1.length){
                            resp="Eh relájate"
                            cifrado(resp)
                        }
                        else if (q1.equals("Jack")){
                            resp="Qué pasa?"
                            cifrado(resp)
                        }
                        else if (q1.equals("adios", ignoreCase = true)){
                            resp="Adios"
                            cifrado(resp)
                        }
                        else{
                            resp="Yo que se"
                            cifrado(resp)
                        }
                    }
                    "Adulto" -> {
                        if (q1.equals("¿Cómo estás?")){
                            resp="En la flor de la vida, pero me empieza a doler la espalda"
                            cifrado(resp)
                        }
                        else if(q1.contains('¿') && q1.contains('?') && cont==tam){
                            resp="Estoy buscando la mejor solución"
                            cifrado(resp)
                        }
                        else if (cont==q1.length){
                            resp="No me levantes la voz mequetrefe"
                            cifrado(resp)
                        }
                        else if (q1.equals("Jack")){
                            resp="¿Necesitas algo?"
                            cifrado(resp)
                        }
                        else if (q1.equals("adios", ignoreCase = true)){
                            resp="Adios"
                            cifrado(resp)
                        }
                        else{
                            resp="No sé de qué me estás hablando"
                            cifrado(resp)
                        }
                    }
                    "Anciano" -> {
                        if (q1.equals("¿Cómo estás?")){
                            resp="No me puedo mover"
                            cifrado(resp)
                        }
                        else if(q1.contains('¿') && q1.contains('?') && cont==tam){
                            resp="Que no te escucho!"
                            cifrado(resp)
                        }
                        else if (cont==q1.length){
                            resp="Háblame más alto que no te escucho"
                            cifrado(resp)
                        }
                        else if (q1.equals("Jack")){
                            resp="Las 5 de la tarde"
                            cifrado(resp)
                        }
                        else if (q1.equals("adios", ignoreCase = true)){
                            resp="Adios"
                            cifrado(resp)
                        }
                        else{
                            resp="En mis tiempos esto no pasaba"
                            cifrado(resp)
                        }
                    }
                }
            }
            "Enano" -> {
                when(pers.edad){
                    "Joven" -> {
                        if (q1.equals("¿Cómo estás?")){
                            println("DE LUJO")
                        }
                        else if(q1.contains('¿') && q1.contains('?') && cont==tam){
                            println("TRANQUI SE LO QUE HAGO")
                        }
                        else if (cont==q1.length){
                            println("EH RELÁJATE")
                        }
                        else if (q1.equals("Jack")){
                            println("QUÉ PASA?")
                        }
                        else if (q1.equals("adios", ignoreCase = true)){
                            println("ADIOS")
                        }
                        else{
                            println("YO QUE SE")
                        }
                    }
                    "Adulto" -> {
                        if (q1.equals("¿Cómo estás?")){
                            println("EN LA FLOR DE LA VIDA, PERO ME EMPIEZA A DOLER LA ESPALDA")
                        }
                        else if(q1.contains('¿') && q1.contains('?') && cont==tam){
                            println("ESTOY BUSCANDO LA MEJOR SOLUCIÓN")
                        }
                        else if (cont==q1.length){
                            println("NO ME LEVANTES LA VOZ MEQUETREFE")
                        }
                        else if (q1.equals("Jack")){
                            println("¿NECESITAS ALGO?")
                        }
                        else if (q1.equals("adios", ignoreCase = true)){
                            println("ADIOS")
                        }
                        else{
                            println("NO SÉ DE QUÉ ME ESTÁS HABLANDO")
                        }
                    }
                    "Anciano" -> {
                        if (q1.equals("¿Cómo estás?")){
                            println("NO ME PUEDO MOVER")
                        }
                        else if(q1.contains('¿') && q1.contains('?') && cont==tam){
                            println("QUE NO TE ESCUCHO!")
                        }
                        else if (cont==q1.length){
                            println("HÁBLAME MÁS ALTO QUE NO TE ESCUCHO")
                        }
                        else if (q1.equals("Jack")){
                            println("LAS 5 DE LA TARDE")
                        }
                        else if (q1.equals("adios", ignoreCase = true)){
                            println("ADIOS")
                        }
                        else{
                            println("EN MIS TIEMPOS ESTO NO PASABA")
                        }
                    }
                }
            }
            "Humano" -> {
                when(pers.edad){
                    "Joven" -> {
                        if (q1.equals("¿Cómo estás?")){
                            println("De lujo")
                        }
                        else if(q1.contains('¿') && q1.contains('?') && cont==tam){
                            println("Tranqui se lo que hago")
                        }
                        else if (cont==q1.length){
                            println("Eh relájate")
                        }
                        else if (q1.equals("Jack")){
                            println("Qué pasa?")
                        }
                        else if (q1.equals("adios", ignoreCase = true)){
                            println("Adios")
                        }
                        else{
                            println("Yo que se")
                        }
                    }
                    "Adulto" -> {
                        if (q1.equals("¿Cómo estás?")){
                            println("En la flor de la vida, pero me empieza a doler la espalda")
                        }
                        else if(q1.contains('¿') && q1.contains('?') && cont==tam){
                            println("Estoy buscando la mejor solución")
                        }
                        else if (cont==q1.length){
                            println("No me levantes la voz mequetrefe")
                        }
                        else if (q1.equals("Jack")){
                            println("¿Necesitas algo?")
                        }
                        else if (q1.equals("adios", ignoreCase = true)){
                            println("Adios")
                        }
                        else{
                            println("No sé de qué me estás hablando")
                        }
                    }
                    "Anciano" -> {
                        if (q1.equals("¿Cómo estás?")){
                            println("No me puedo mover")
                        }
                        else if(q1.contains('¿') && q1.contains('?') && cont==tam){
                            println("Que no te escucho!")
                        }
                        else if (cont==q1.length){
                            println("Háblame más alto que no te escucho")
                        }
                        else if (q1.equals("Jack")){
                            println("Las 5 de la tarde")
                        }
                        else if (q1.equals("adios", ignoreCase = true)){
                            println("Adios")
                        }
                        else{
                            println("En mis tiempos esto no pasaba")
                        }
                    }
                }
            }
            "Goblin" -> {
                when(pers.edad){
                    "Joven" -> {
                        if (q1.equals("¿Cómo estás?")){
                            resp="De lujo"
                            cifrado(resp)
                        }
                        else if(q1.contains('¿') && q1.contains('?') && cont==tam){
                            resp="Tranqui se lo que hago"
                            cifrado(resp)
                        }
                        else if (cont==q1.length){
                            resp="Eh relájate"
                            cifrado(resp)
                        }
                        else if (q1.equals("Jack")){
                            resp="Qué pasa?"
                            cifrado(resp)
                        }
                        else if (q1.equals("adios", ignoreCase = true)){
                            resp="Adios"
                            cifrado(resp)
                        }
                        else{
                            resp="Yo que se"
                            cifrado(resp)
                        }
                    }
                    "Adulto" -> {
                        if (q1.equals("¿Cómo estás?")){
                            resp="En la flor de la vida, pero me empieza a doler la espalda"
                            cifrado(resp)
                        }
                        else if(q1.contains('¿') && q1.contains('?') && cont==tam){
                            resp="Estoy buscando la mejor solución"
                            cifrado(resp)
                        }
                        else if (cont==q1.length){
                            resp="No me levantes la voz mequetrefe"
                            cifrado(resp)
                        }
                        else if (q1.equals("Jack")){
                            resp="¿Necesitas algo?"
                            cifrado(resp)
                        }
                        else if (q1.equals("adios", ignoreCase = true)){
                            resp="Adios"
                            cifrado(resp)
                        }
                        else{
                            resp="No sé de qué me estás hablando"
                            cifrado(resp)
                        }
                    }
                    "Anciano" -> {
                        if (q1.equals("¿Cómo estás?")){
                            resp="No me puedo mover"
                            cifrado(resp)
                        }
                        else if(q1.contains('¿') && q1.contains('?') && cont==tam){
                            resp="Que no te escucho!"
                            cifrado(resp)
                        }
                        else if (cont==q1.length){
                            resp="Háblame más alto que no te escucho"
                            cifrado(resp)
                        }
                        else if (q1.equals("Jack")){
                            resp="Las 5 de la tarde"
                            cifrado(resp)
                        }
                        else if (q1.equals("adios", ignoreCase = true)){
                            resp="Adios"
                            cifrado(resp)
                        }
                        else{
                            resp="En mis tiempos esto no pasaba"
                            cifrado(resp)
                        }
                    }
                }
            }
        }

   }while(!q1.equals("Adios", ignoreCase = true))
}


