package lesson

import java.util.function.Consumer

fun main(args: Array<String>) {
    val list: List<String> = listOf("a","b","c")
    for (str in list) {
        println(str)
    }
    println("----------------------")

    list.forEach(Consumer { println(it) })

    println("-----------------------")

    list.forEach(System.out::println)

    list.forEach { it -> println(it) }

    list.forEach { value -> println(value) }


}