package Acertijos

fun main () {
    var contF = 0
    var contC = 0
    var i = 1

    val arrayG = arrayOf<String>("1","2","3","8","8","\n","4","5","6","8","8","\n","7","8","9","8","8","\n","7","8","9","8","8","\n","4","5","6","8","8","\n","7","8","9","8","8","\n")


    arrayG.forEach {
        if (it == "\n") {
            contF++
        }
        else {
            contC++
        }
    }
    contC= contC/contF

    //print contador columnas
    print("   ")
    repeat(contC){
        print(i)
        i++
        repeat(2){
            print(" ")
        }
    }

    //print guiones
    println()
    print(" |")
    repeat(contC*3){
        print("-")
    }


    println()

    i=1
    print(i)
    print("| ")

    arrayG.forEach {
        //print contador filas
       if(it != "\n" ){
           print(it)
           print("  ")
       }
       else if(i<contF){
           i++
           println()
           print(i)
           print("| ")
        }
    }

}
