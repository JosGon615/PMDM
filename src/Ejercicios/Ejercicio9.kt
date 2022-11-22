package Ejercicios


fun main (){
    var weight = 0
    val dado = Dado(1,6)
    val clases = arrayListOf<String>("Mago","Ladron","Guerrero","Berserker","Mercader")
    val razas = arrayListOf<String>("Elfo","Enano","Humano","Goblin")
    val edad = arrayListOf<String>("Anciano","Adulto","Joven")

    weight = dado.tiradaUnica() * 10
    var pers = Personaje(razas.random(),clases.random(),edad.random())
    println(pers.toString())

    println("Peso de la mochila: $weight")


    var valor = 123
    cambio(valor)


}

fun cambio(valor : Int){
    val monedas = mutableListOf<Int>(100,25,10,5,1)
    var moneda = 0
    var suma = 0
    var i = 0
    var cont = 0

    println("------------VUELTAS------------")
    while (suma!=valor){
        cont = 0
        if(monedas[i] < valor && (monedas[i]+suma) < valor){
            suma += monedas[i]
            moneda = monedas[i]
            cont++
            println("Monedas de $moneda: $cont")
        }
        else{
            i++
        }

    }
}
