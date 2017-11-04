package book.chapter4

class Person(val name: String) {
    var address: String = "unspecified"
        set(value) {
            println("""
                Address was changed for $name
                "$field" -> "$value".
                """.trimIndent())
            field = value
        }
}

fun main(args: Array<String>) {
    val person = Person("Liusilong")
    person.address = "HuBei Province"
}