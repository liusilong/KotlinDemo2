package book.chapter4

//接口
interface JsonFactory<T>{
    fun fromJson(jsonText: String): T
}

class Person7 (val name: String){
//    Person7中的伴生对象实现了JsonFactory接口
    companion object: JsonFactory<Person7> {
        override fun fromJson(jsonText: String): Person7 {
            //...
            return Person7("Liusilong")
        }
    }
}

fun <T> loadFraomJson(factory: JsonFactory<T>){
}

fun main(args: Array<String>) {
//    Person7里面的伴生对象实现了JsonFactory接口，
// 所以可以直接将Person7作为实现了该接口的对象实例来使用
    loadFraomJson(Person7)
}