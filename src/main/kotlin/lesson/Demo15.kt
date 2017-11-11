package lesson

open class Fruit{
    open fun name(){
        println("name")
    }

    fun expirationDate(){
        println("1 month")
    }
}

class Apple: Fruit(){
    //重写父类的方法
    override fun name(){
        println("apple")
    }
}

open class Orange: Fruit(){
    // 不能被Orange的子类重写，因为明确标记为终态
    final override fun name() {
        println("orange")
    }
}

fun main(args: Array<String>) {
    var apple = Apple()
    apple.name()
    apple.expirationDate()
}