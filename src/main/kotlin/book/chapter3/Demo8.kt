package book.chapter3

fun main(args: Array<String>) {
    val a:Array<String> = arrayOf("aa","bb")
    val b = listOf("bb",*a)
    println(b)

    val price = """$ {'$'} 99.9"""
    println(price)
}
