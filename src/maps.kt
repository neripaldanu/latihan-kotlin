fun main(){
    val capital = mapOf(
            "jakarta" to "Indonesia",
            "england" to "Inggris",
            "new delhi" to "India"
    )
    val mutableMap = capital.toMutableMap()
    mutableMap.put("berlin", "Germany")
    val capitalKeys = mutableMap.keys
    val capitalValue = mutableMap.values

    println(mutableMap["jakarta"])
    println(capitalKeys)
    println(capitalValue)
}