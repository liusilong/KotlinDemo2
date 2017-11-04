package book.chapter3

fun main(args: Array<String>) {
    val user = User(id = 9,name = "lisilong",address = "beijing")

}
class User(val id: Int,val name: String,val address: String)

fun saveUser(user: User) {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("can't save user ${user.id}: empty $fieldName")
        }
    }

    validate(user.name, "Name")
    validate(user.address, "Address")
}