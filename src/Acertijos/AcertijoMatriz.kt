package Acertijos

fun main () {
    var contF = 0
    var contC = 0
    var i = 0

    val arrayG = arrayOf<String>("1","2","3","\n","4","5","6","\n","7","8","9","\n","7","8","9","\n")


    arrayG.forEach {
        if (it == "\n") {
            contF++
        }
        else {
            contC++
        }
    }
    contC= contC/contF
    println("contador F")
    println(contF)
    println("contador C")
    println(contC)


    //print contador columnas
    print("   ")
    repeat(contF){
        print(contC)
        contC++
        repeat(2){
            print(" ")
        }
    }

    //print guiones
    println()
    print(" |")
    repeat(contF*3){
        print("-")
    }


    println()

    i=1
    print(contC)
    print("| ")

    arrayG.forEach {
        //print contador filas
       if(it != "\n"){
           print(it)
           print("  ")
       }
       else{
           i++
           println()
           print(i)
           print("| ")
        }
    }

}
