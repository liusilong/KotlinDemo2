package book.chapter4

//带有一个参数的主构造方法
class User constructor(_nikename: String){
    val nikename: String
    init { //初始化语句块
        nikename = _nikename
    }
}