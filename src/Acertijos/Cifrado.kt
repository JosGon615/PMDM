package Acertijos

fun main(){
    var arrayC = arrayListOf<Char>('a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z')
    var ROT = 15
    var palabra = ""
    var cifrado = ""
    var i = 0
    var cont = 0

    arrayC.forEach {
        do {
            if (it.lowercaseChar() == arrayC[i]) {
                cont = i + ROT
                if (cont > TAM-1) {
                    cont = cont - TAM
                    cifrado += array[cont].toString()
                    cont = 0
                    i=TAM
                }

                else
                    if (cont < TAM-1){
                        cifrado += array[cont].toString()
                        cont = 0
                        i=TAM
                    }
            }
            i++
        } while (i < TAM)
        i = 0
    }
    println("El cifrado sería " + cifrado)
}

}