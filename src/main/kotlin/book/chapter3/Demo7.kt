package book.chapter3

import book.chapter3.strings.lastChar

fun main(args: Array<String>) {
    println("kotlin".lastChar())
    val list = listOf(1,2,3)
    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)
}

var StringBuilder.lastChar: Char
    get() = this.get(this.length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }