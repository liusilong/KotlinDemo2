package lesson

open class Parent(name: String,age: Int){

}

class Child(name: String,age: Int): Parent(name, age){

}

open class Parent2(name: String)

//在Kotlin中，如果一个类没有Primary构造方法，那么这个类的每个Secondary构造方法就需要通过super关键字来初始化父类型
//或者是通过其他Secondary构造方法完成这个任务，不同的Secondary构造方法可以调用父类型不同的构造方法
class Child2: Parent2{
    constructor(name: String): super(name){

    }
}
