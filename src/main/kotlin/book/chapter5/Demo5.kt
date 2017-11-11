package book.chapter5

/**
 * Created by liusilong on 2017/11/11.
 * KotlinDemo
 * all
 * any
 * count
 * find
 */

fun main(args: Array<String>) {

//    定义比变量，检查一个人的年龄是否小于28
    val age = { p: Person -> p.age <= 27 }

    val people = listOf(Person("jack", 30), Person("tom", 28))

//    对people中所有元素进行检查是否满足条件
    println(people.all(age))


    val list = listOf(1, 2, 3, 4)
    //判断list中不是所有的元素都等于3
    println(!list.all { it == 3 })

    //判断list中至少有一个不等于3
    println(list.any { it != 3 })

    //list中大于2的元素的个数
    println(list.count { it > 2 })

    println(list.find { it > 2 })
}