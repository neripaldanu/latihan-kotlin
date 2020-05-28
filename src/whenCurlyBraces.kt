fun main(){
    val value = 7
    val valueStringOf = when (value){
        7-> {
            println("SEVEN")
            "value is 7"
        }
        8-> {
            println("EIGHT")
            "value is 8"
        }
        else ->{
            println("undefined")
            "value cannot be reached"
        }
    }

    println(valueStringOf)
}