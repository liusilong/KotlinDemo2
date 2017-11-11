package lesson

/**
 * Person类包含带有一个参数的Primary构造方法
 */
class Person constructor(username: String){
    private var username: String
    private var age: Int
    private var address: String
    //在初始化代码块中给成员变量赋值
    init {
        println(username)//构造方法中的属性
        this.username = username
        this.age = 20
        this.address = "Beijing"
    }
    //一个Secondary构造方法必须要直接或者间接的去调用Primary构造方法
    //接受两个参数Secondary构造方法，直接调用了Primary构造方法
    constructor(username: String,age: Int): this(username){
        println(username+","+age)
        this.username = username
        this.age = age
        this.address = "beijing"
    }

    //接受三个参数Secondary构造方法，调用了接收两个构造方法，间接调用了Primary方法
    constructor(username: String,age: Int,address: String): this(username, age){
        this.address = address
    }

    fun printInfo(){
        println("username:${this.username},age:${this.age},address:${this.address}")
    }
}

fun main(args: Array<String>) {
    val person = Person("zhangshan")
    val person2 = Person("lisi",30)
    val person3 = Person("wangwu",40,"hangzhou")

    person.printInfo()
    person2.printInfo()
    person3.printInfo()
}