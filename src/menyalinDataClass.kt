fun main(){
    val dataUser = DataUser("neri paldanu", 24)
    val dataUser2 = DataUser("neri paldanu", 24)
    val dataUser3 = DataUser("neri paldanu", 25)
    val dataUser4 = dataUser.copy(age = 18)

    println(dataUser4)

}