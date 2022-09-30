package Ejercicios

fun main() {
    //BUCLE REPEAT

    crearRascacielos(20,8,3)


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
        repeat(numeroTorres) {
            print("|")
            repeat(numeroVentanas) {
                print("_▋_")
            }
            print("|")
            repeat(numeroVentanas * 3 + 2) {
                print(" ")
            }
        }
    }
}
