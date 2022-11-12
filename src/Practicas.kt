/*fun main() {

    /*val num: Long = 13
    print("El número $num es mi....")
    print("El número ${num.toDouble()} es mi....")

    diHola("JoseMiguel")
    diEdad("JoseMiguel",22)
    sumaString("2","3")

    calcularPrecio(66)

    opVar(-2)
    parImpar(4)*/


}

fun funWithoutParams() {
    print("=== Soy la función funWithoutParams ===")
}
fun sumaIntegers(num : Int, num2 : Int){
    var res = 0;
    res = num + num2
    print("${res.toDouble()}")
}
fun diHola(nombre : String){
    print("Hola $nombre")
}
fun diEdad(nombre : String, edad : Int){
    print("Soy $nombre, y tengo $edad años")
}
fun sumaString(num1 : String, num2 : String){
    var res = 0;
    res = num1.toInt() + num2.toInt()
    print("${res.toDouble()}")
}
fun diResultado(){
    print("sumaIntegers ha devuelto un ")
}

fun calcularPrecio(edad : Int){
    when {
        edad < 18-> print("Juan, debes abonar 5€")
        edad in 18..65 -> print("Juan, debes abonar 10€")
        edad > 65 -> print("Juan, para ti es gratis")
    }
}

fun opVar (num: Int){
    if (num > 0)
        print("${num*2+3}")
    else if (num < 0)
        print("${num/2-3}")
    else
        print(0)
}

fun parImpar (num: Int) {
    if (num % 2 == 0)
        print("$num es par")
    else
        print("$num es impar")
}

//NULOS
fun funcion1 (n1: Int?, n2: Int?, n3: Int?, n4: Int?): Int?{

    return if(n1==null || n2==null || n3==null || n4==null)
        null
    else
        n1 + n2 + n3 + n4
}

fun funcion2(num1: Int?, num2: Int?, num3: Int?, num4: Int?) : Int {
    var suma = num1 ?: 0
    suma += num2 ?: 0
    suma += num3 ?: 0
    suma += num4 ?: 0
    return suma
}

fun funcion3(num1: Int?, num2: Int?, num3: Int?, num4: Int?) : Int? {
    return if ( num1 == null && num2 == null && num3 == null && num4 == null)
        null
    else {
        var suma = num1 ?: 0
        suma += num2 ?:0
        suma += num3 ?:0
        suma += num4 ?:0
        suma
    }
}
*/


