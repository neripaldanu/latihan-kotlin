import kotlin.random.Random

fun main(){
    val registerNumber= when(val regis = getRegisterNumber()){
        in 50..100 -> 50 *regis
        in 51..100 ->100 *regis
        else-> regis
    }

}

fun getRegisterNumber()= Random.nextInt(100)