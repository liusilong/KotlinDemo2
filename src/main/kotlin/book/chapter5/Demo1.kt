package book.chapter5

data class Person(val name:String, val age: Int)

fun main(args: Array<String>) {
    //构造方法引用
    val createPerson = ::Person
    val jack = createPerson("jack",20)
    println(jack)
}