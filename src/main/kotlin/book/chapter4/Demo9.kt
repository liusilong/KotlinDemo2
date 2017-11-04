package book.chapter4

interface OnClickListener{
    fun onClick()
}
class ClickTest{
    fun addOnClickListener(onClickListener: OnClickListener){
        onClickListener.onClick()
    }
}

val listener = object : OnClickListener{
    override fun onClick() {
        println("item clicked...")
    }
}
fun main(args: Array<String>) {
    val clickTest = ClickTest()
    var count = 0
    clickTest.addOnClickListener(
//            匿名对象代替Java中的匿名内部类
            object : OnClickListener{
                override fun onClick() {
                    println("view onClicked..")
//                    访问函数中的变量，并没有final的限制
                    count++
                    println(count)
                }
            }
    )
}