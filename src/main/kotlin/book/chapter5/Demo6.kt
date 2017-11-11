package book.chapter5

/**
 * Created by liusilong on 2017/11/11.
 * KotlinDemo
 * GroupBy
 */
fun main(args: Array<String>) {
    //将集合中的Person按年龄分组
    val people = listOf(Person("Alice",20),
            Person("Jack",30),
            Person("Rose",20))

    println(people.groupBy { it.age })

    val list = listOf("a","ab","b")
    println(list.groupBy{it.first()})

    println("abc".toList())
}
