package lesson

open class MyParent {
    //表示name属性可以被子类复写该属性
    open val name: String = "parent"
}

class MyChild : MyParent() {
    //重写父类的属性，父类属性必须是open的，子类重写的属性需用override修饰
    override val name: String = "child"
}

//在构造方法中直接复写父类中的属性
class MyChild2(override val name: String) : MyParent() {}

//---
open class MyParent3 {
    open val name: String get() = "parent"
    open fun method() {
        println("parent method")
    }
}


//val属性既可以被val属性override也可以被var属性override
//var属性只能被var属性override
class MyChild3 : MyParent3() {
    //重写父类方法
    override fun method() {
        super.method()
        println("child method")
    }

    //重写父类属性
    override val name: String
        get() = super.name + " and child"
}

fun main(args: Array<String>) {
    val myChild = MyChild()
    println(myChild.name) // child
    println("------------------")
    val myChild3 = MyChild3()
    myChild3.method() //parent method  child method
    println(myChild3.name) //parent and child
}

