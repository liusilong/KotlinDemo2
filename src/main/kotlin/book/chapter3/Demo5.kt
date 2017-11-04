package book.chapter3

import book.chapter3.strings.firstChar as first // 使用 关键字 as 来修改导入类或者函数的名称
import book.chapter3.strings.lastChar

fun main(args: Array<String>) {
    println("Liusilong".lastChar())
    println("Kotlin".first())

    val list = arrayListOf(1, 3, 5, 7, 9)
    println(list.joinToString())
    println("---------------------")
    val strList = arrayListOf("hello","world","hello world")
    println(strList.join())
}


fun <T> Collection<T>.joinToString(
//       分隔符
        separator: String = ";",
//        前缀
        prefix: String = "(",
//        后缀
        postfix: String = ")"
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun Collection<String>.join(
        separator: String = ",",
        prefix: String = "",
        postfix: String = ""
) = joinToString(separator,prefix,postfix)