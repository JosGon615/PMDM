package Acertijos

fun main (){
    var matriz:String = "1 2 3 4 5 6 7 8 9 10 11 12"

    filas(matriz)
    columnas(matriz)
    var tam = matriz.length
    print(tam)
}

fun filas(matriz:String){

    var tam = matriz.length
    var mArray = matriz.toCharArray()
    print("Filas: \n")
    var i = 0
    repeat(tam/3){
        print(" " + matriz[i])
        i += 2
    }
    print("\n")
    repeat(tam/3){
        print(" " + matriz[i])
        i += 2

    }
    print("\n")
    repeat(tam/3){
        print(" " + matriz[i])
        i += 2
    }
    print("\n")
    print("\n")
}

fun columnas(matriz:String){
    var mArray = matriz.toCharArray()
    var tam = matriz.length
    print("Columnas: \n")

    var i = 0
    repeat(tam/3){
        print(" " + matriz[i])
        i += 6
        repeat(tam/3){
            print(" " + matriz[i])
            i += 6
        }
        i = 4
        print("\n")
        repeat(tam/3){
            print(" " + matriz[i])
            i += 6
        }
    }

    print("\n")
    print("\n")
}