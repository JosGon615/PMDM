package Acertijos

fun main () {
    var matriz: String =
            "1 2 3\n " + //arraylist (1 2 3)
            "4 5 6\n " + //arraylist
            "7 8 9\n"

    var contF = 0
    var contC = 1
    var cont = 0


    val arrayG = arrayOf<String>("1","2","3","\n","4","5","6","\n","7","8","9")

    arrayG.forEach {
        print("\t")
        if (it != "\n" || cont<=contF){
            print(it)
            print(" ")
            cont++
        }


        if(it == "\n"){
            contF++
            print(contF)
        }




    }







}
