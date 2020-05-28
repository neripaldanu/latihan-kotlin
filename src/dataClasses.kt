data class User(val name: String, val age:Int)

data class DataUser(val name: String, val age: Int)


fun main(){
    val user = User("neripaldanu", 24)
    val dataUser = DataUser("neriPaldanu", 24)

    println(user)
    println(dataUser)
}