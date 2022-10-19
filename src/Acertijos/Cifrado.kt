package Acertijos

fun main(){
    val arrayC = "abcdefghijklmnopqrstuvwxyz".toCharArray()
    val long = arrayC.size
    var word = "h"
    var pass = ""
    var rot = 13
    var i = 0
    var sum = 0

    //si i se pasa de 26 haremos un MOD para que vaya a la posicion adecuada
    //por ejemplo si tenemos "z" se ira al 27, por lo tanto 27%26 = 1 (sse iria al inicio del array)

    word.forEach {
        do{
            if(!it.lowercaseChar().isLetter()){
                pass += it.lowercaseChar()
            }
            else if(it.lowercaseChar() == arrayC[i]){
                if(sum>){}
                sum = i + rot
                word += arrayC[sum]
            }
        }while(i<=long)
    }

    println(i)

}


