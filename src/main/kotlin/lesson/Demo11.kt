package lesson

class MyClass constructor(username:String){
     val username:String  = username.toUpperCase()

    init {
        println(username)
    }
}

fun main(args: Array<String>) {
    var myClass = MyClass("liusilong")
    println(myClass.username)
}