package book.chapter4

sealed class SealedDemo {
    class Num(val value: Int) : SealedDemo()
    class Sum(val left: SealedDemo, val right: SealedDemo) : SealedDemo()

}

//class AAA() : SealedDemo()

fun eval(e: SealedDemo): Int =
        when (e) {
            is SealedDemo.Num ->
                e.value

            is SealedDemo.Sum ->
                eval(e.right) + eval(e.left)

        }
