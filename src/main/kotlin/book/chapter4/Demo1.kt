package book.chapter4

interface User1{
    val nikename: String
}

class PrivateUser(override val nikename: String): User1

class SubscribingUser(val email: String): User1{
    override val nikename: String
        get() = email.substringBefore('@')
}