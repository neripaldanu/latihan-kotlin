fun main(){
    val list =(1..1000000).toList()
//    list.filter { it % 5==0 }.map { it * 2 }.forEach{ println(it)}
//    list.asSequence().filter { it % 5 == 0 }.map { it + it }.forEach { println(it) }

    //generateSequence()
    val sequenceNumber = generateSequence(1){it + 2}
    sequenceNumber.take(5).forEach { print("$it ") }
}