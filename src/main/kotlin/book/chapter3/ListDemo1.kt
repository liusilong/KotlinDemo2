package book.chapter3

fun main(args: Array<String>) {
    //创建HashSet集合
    val set = hashSetOf(1, 2, 3)
//    创建ArrayList集合
    val list = arrayListOf(1, 2, 3, 6)
//     创建HashMac集合
    val map = hashMapOf(1 to "one", 2 to "two", 3 to "three")

    println(set.javaClass)

    println(list.javaClass)

    println(map.javaClass)

    println("---")
    println(set.last())
    println(list.max())
}