package Contructores

import Contructores.Jugador
import java.io.File

public fun main() {
    var jugador1 = Jugador("jose",100,2,92,12)

    val archivo = File("./jugador1.txt")
    print(jugador1)
    println(archivo.readLines())




}