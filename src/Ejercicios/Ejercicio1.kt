package Ejercicios

fun main() {
    //BUCLE REPEAT

    crearRascacielos(20,15,2)


}
fun crearRascacielos(numeroPisos: Int, numeroVentanas:Int, numeroTorres:Int) {

    repeat(numeroTorres) {
        repeat(numeroVentanas * 3 + 2) {
            print("_")
        }
        repeat(numeroVentanas * 3 + 2) {
            print(" ")
        }
    }
        repeat(numeroPisos) {
            print("\n")
            print("|")
            repeat(numeroVentanas) {
                print("_▋_")

            }
            print("|")
        }


    }
