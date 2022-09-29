package Contructores

import javax.print.attribute.IntegerSyntax
import kotlin.math.round
import kotlin.math.roundToInt
import kotlin.math.truncate

class Jugador {
    var nombre = ""
    var numPartidas = 0
    var horas = 0
    var kills = 0
    var deaths = 0

    constructor(nombre: String, numPartidas: Int, horas: Int, kills: Int, deaths: Int) {
        this.nombre = nombre
        this.numPartidas = numPartidas
        this.horas = horas
        this.kills = kills
        this.deaths = deaths
    }

    fun ratioKD (): Double {
        return kills.toDouble() / deaths.toDouble()
    }


    override fun toString(): String {
        return ("Nombre: $nombre\n" +
                "Nº Partidas: $numPartidas\n" +
                "Horas: $horas\n" +
                "Kills: $kills\n" +
                "Deaths: $deaths\n" +
                "K/D: ${ratioKD()}")
    }

}