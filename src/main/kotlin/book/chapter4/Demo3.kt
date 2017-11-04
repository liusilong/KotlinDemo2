package book.chapter4

 class Client(val name: String, val postalCode: Int)
{
    fun copy(name: String = this.name, postalCode: Int = this.postalCode)
            = Client(name, postalCode)

    override fun toString(): String {
        return "Client(name = $name, postalCode = $postalCode)"
    }
}

fun main(args: Array<String>) {
    val bob = Client("Bob",234)
    println(bob.copy("helln",345))
}