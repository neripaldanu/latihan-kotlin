fun main(){
    val intList = listOf<Int>(1,2,3,4,5,6,7,8,9)
    val numberList = listOf(2,4,6,7,8)
    val charList = listOf('A', 'B', 'C', 'D')
    val anyList = mutableListOf(20, 'Q', true)
    anyList.add('D')
    anyList.remove(true)

    println(numberList[2])
    println(anyList)

}

