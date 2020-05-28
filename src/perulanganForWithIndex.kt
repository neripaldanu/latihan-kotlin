fun main(){
    var ranges = 1.rangeTo(10) step 2
    for((index, value) in ranges.withIndex()){
        println("value $value in index $index")
    }
}