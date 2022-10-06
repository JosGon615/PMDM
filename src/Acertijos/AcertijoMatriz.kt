package Acertijos

fun main () {
    var matriz: String =
            "1 2 3\n " + //arraylist (1 2 3)
            "4 5 6\n " + //arraylist
            "7 8 9\n"

    var contC = 0
    var contF = 0
    val arrayG = ArrayList<ArrayList<Char>>()


    matriz.forEach {
        if (it == '\n')
            arrayG.add(ArrayList())
    }

    matriz.forEach {
        if (!it.isWhitespace()){
            arrayG[contF].add(it)
            contC++
        }

        if (it == '\n'){
            contC = 0
            contF++
        }
    }

   contF = 0
   arrayG.forEach(){
       print(arrayG[contF])
       contF++
   }




}
