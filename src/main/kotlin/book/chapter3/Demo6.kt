package book.chapter3

fun main(args: Array<String>) {
    val view: View = Button()
    view.click()
    view.showOff()
}



fun View.showOff() = println("I am a view!")
fun Button.showOff() = println("I am a button")
open class View {
    open fun click() = println("View clicked")
}

class Button : View() {
    override fun click() {
        println("Button clicked")
    }
}