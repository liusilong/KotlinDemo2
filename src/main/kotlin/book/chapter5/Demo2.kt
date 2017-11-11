package book.chapter5


fun main(args: Array<String>) {
    val list = listOf(1,2,3,4,5)
    println(list.filter { it % 2 == 0 })

    val people = listOf(Person("jack",30),Person("rose",20))
    val maxAge = people.maxBy(Person::age)
    println(maxAge?.age)
    println(people.filter { it.age > 20 })

}