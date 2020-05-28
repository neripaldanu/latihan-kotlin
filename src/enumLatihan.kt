fun main(){

    val colors: Array<Warna> = enumValues()
    colors.forEach { color ->
        println(color)
    }

    val color: Warna= enumValueOf("GREEN")
    println("color is $color")


}

enum class Warna(val value: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)


}