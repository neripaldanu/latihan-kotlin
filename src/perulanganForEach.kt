fun main(){
    val ranges = 1.rangeTo(10) step  2
    ranges.forEach(){ value ->
        println("value $value")
    }
}