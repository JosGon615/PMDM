package Acertijos

fun main(){
    val arrayC = charArrayOf('a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z')
    var ROT = 15
    var i = 0
    var cont = 0
    var word = "h "
    var pass = ""


    word.forEach {
        do{
            if (it.lowercaseChar() == arrayC[i]){
                cont = i + ROT
                println(cont)
                pass += arrayC[cont]
            }
            i++
        }while (i < word.length)
    }



    println(word)
    print(pass)

}


