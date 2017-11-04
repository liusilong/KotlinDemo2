package book.chapter4

class Person8 (val firstName: String,val lastName: String){
//    声明一个空的伴生对象
    companion object {}
}
// 声明一个扩展函数
fun Person8.Companion.fromJson(json: String): Person8{

    return Person8("Liu","Silong")
}

fun main(args: Array<String>) {
//    调用Person8伴生对象的扩展函数
    val p = Person8.fromJson("{firstName:'liu',lastName:'Silong'}")
}
