fun main(){
    val setA = setOf(1,2,3,4,5,1,2,6)

    val setC = setOf(1,4,6)
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)

    println(union)
    println(intersect)
}