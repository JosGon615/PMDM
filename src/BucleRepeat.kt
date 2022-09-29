fun main(){
    //BUCLE REPEAT
    val pisos: Int = 10
    val ventanas: Int = 4
    repeat (14){
        print("_")
    }

    repeat(pisos){
        print("\n")
        print("|")
        repeat(ventanas){
            print("_▋_")
        }
        print("|")
    }
    print("\n")
    print("\n")

    var cont = 0
    var cont2 = 10
    repeat(pisos){
        repeat(cont2){
            print(" ")
        }
        cont2 -= 1
        print("/")
        repeat(cont){
            print("_")
        }
        cont += 2
        print("\\")
        print("\n")
    }
}