fun main(){
    val numberList = listOf(1,2,3,4,5,6,7,8,9,10)
//    val evenList = numberList.filterNot { it % 2 == 0 }
//    val multifleby5 = numberList.map { it * 5 }
//    val firstOffNumber = numberList.find { it % 2==1 }
    val lastOffNumber = numberList.lastOrNull()

//    println(numberList.count())
//    println(multifleby5)
//    println(firstOffNumber)
    println(lastOffNumber)
}