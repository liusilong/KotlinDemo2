package book.chapter4

class Student {
    val nikename: String

    constructor(email: String) {
        nikename = email.substringBefore('@')
    }

    constructor(facebookAccountId: Int) {
        nikename = "Liusilong"
    }
}

class Student2 private constructor(val nikename: String) {
    companion object {
        fun newSubscribeUser(email: String) =
                Student2(email.substringBefore('@'))

        fun newFacebookUser(accountId: Int) =
                Student2("Liusilong")

    }
}

fun main(args: Array<String>) {
    val sub = Student2.newSubscribeUser("bob@gmail.com")
    val sub2 = Student2.newFacebookUser(88);
    println(sub.nikename)
    println(sub2.nikename)
}