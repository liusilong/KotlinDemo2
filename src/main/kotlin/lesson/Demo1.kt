package lesson

fun main(args: Array<String>) {
    println(add(2, 3))
    myPrint(4, 5)
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun add2(a: Int, b: Int) = a + b

fun myPrint(a: Int, b: Int) {
    println("$a + $b = ${a + b}")
}