fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)

    // Create a new mutable list to modify
    val mutableList = doubledList.toMutableList()
    mutableList[0] = 10
    println(mutableList)
}