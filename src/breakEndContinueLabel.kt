fun main(){
    loop@ for (i in 1..10){
        println("Outside loop")

        for(j in 1..10){
            println("inside loop")
            if (j> 5){ break@loop

            }
        }
    }
}