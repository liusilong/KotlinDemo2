package book.chapter5


data class People(val name: String,val age: Int)

fun main(args: Array<String>) {
    val people = listOf(People("Jack",20),People("rose",18))
    val names = people.joinToString(separator = " ",transform = { p: People -> p.name})
    println(names)
    println(people.joinToString(separator = " "){it.name})
    println(people.joinToString { it.name })

    println(people.maxBy { p: People -> p.age })
    println(people.maxBy { p -> p.age })
}