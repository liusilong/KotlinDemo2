package book.chapter3

fun main(args: Array<String>) {
    val list = listOf(1,2,3,4,5)
//    默认的toString方法输出
    println(list)
//    自定义的分隔符
    println(joinToString(list,";","(",")"))
//    使用命名参数来调用joinToString方法,提高可读性
    println(joinToString(list,separator = ";",prefix = "(",postfix = ")"))
    println("---------------")
    println(joinToString(list))
    println(joinToString(list,";"))
    println(joinToString(list,prefix = "["))
}


fun <T> joinToString(
        collection: Collection<T>, //待操作的集合
        separator: String = ",",// 分隔符,有默认参数
        prefix: String = "", // 前缀，有默认参数
        postfix: String = ""// 后缀，有默认参数
): String{
    //声明一个StringBuilder 将前缀添加进来
    val result = StringBuilder(prefix)
//    遍历集合
    for ((index, element) in collection.withIndex()) {
//        添加分隔符
        if (index > 0) result.append(separator)
//        添加元素
        result.append(element)
    }
//    添加后缀
    result.append(postfix)
    return result.toString()
}