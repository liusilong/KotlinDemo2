package book.chapter5

/**
 * Created by liusilong on 2017/11/11.
 * KotlinDemo
 * filter 和 map
 */
fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4)
    println(list.filter { it % 2 == 0 })
    println(list.map { it * it })


    val people = listOf(Person("Jack", 30), Person("rose", 20))
    println(people.filter { it.age > 20 })
    println(people.map { it.name })

    println(people.filter { it.age > 20 }.map { it.name })
    println("------")
    //获取最大年龄
    val maxAge = people.maxBy(Person::age)!!.age
    println(people.filter { it.age == maxAge })
    //
    val filter = people.filter { it.age == maxAge }
    println(filter[0].age)

}