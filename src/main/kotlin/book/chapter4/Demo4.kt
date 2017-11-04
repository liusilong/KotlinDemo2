package book.chapter4

import java.io.File


object Payroll{
    val allEmployees = arrayListOf<Person>()
    fun calculateSalary(){
        for (person in allEmployees) {
            //...
        }
    }
}

object CaseInsensitiveFileComparator: Comparator<File>{
    override fun compare(o1: File, o2: File): Int {
        return o1.path.compareTo(o2.path,ignoreCase = true)
    }
}

class Test{
    private val a = 10
    val b = 20
}
fun main(args: Array<String>) {
    println( CaseInsensitiveFileComparator.compare(File("/user"),File("/user")))
    val test = Test()
    println(add(test.b,test.b))
}