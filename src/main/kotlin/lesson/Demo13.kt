package lesson

//将类的成员变量（属性）声明在构造方法里面
class Student(private val username: String, private val age: Int, private var address: String) {
    fun printInfo() {
        println("username:$username,age:$age,address:$address")
    }
}

/**
 * 如果构造方法拥有注解或者可见性修饰符，那么constructor关键字不能省略，并且它位于修饰符的后面
 */
class Student2 private constructor(username:String){

}

/**
 * 给属性赋初始值
 * 在JVM上，如果类的Primary构造方法的所有参数都拥有默认值，那么Kotlin编译器就会自动为这个类生成一个不带参数的构造方法
 * 这个不带参数的构造方法使用这些参数的默认值，这样做的目的在于可以跟Spring等框架更好的集成
 */
class Student3(val username: String = "zhangsan"){

}
fun main(args: Array<String>) {
    val student = Student("zhangsan",20,"shenzhen")
    student.printInfo()

    var student3 = Student3()
    println(student3.username)

    student3 = Student3("lisi")
    println(student3.username)
}