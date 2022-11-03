package Acertijos

fun main(){
    var word = "abcdefghijklmnopqrstuvwxyz"


    //si i se pasa de 26 haremos un MOD para que vaya a la posicion adecuada
    //por ejemplo si tenemos "z" se ira al 27, por lo tanto 27%26 = 1 (sse iria al inicio del array)

    cifrado(word)

}

fun cifrado(word : String){
    val arrayC = "abcdefghijklmnopqrstuvwxyz".toCharArray()
    val long = arrayC.size
    var pass = ""
    var rot = 13
    var i = 0
    var sum = 0

    word.forEach {
        i=0
        sum=0
        if(!it.lowercaseChar().isLetter()){
            pass += it.lowercaseChar()
        }
        do{
            if(it.lowercaseChar() == arrayC[i]){
                sum = i + rot
                if(sum>=long){
                    sum %= long
                }
                pass += arrayC[sum]
            }
            i++
        }while(i<long)
    }

    println(pass)
}

