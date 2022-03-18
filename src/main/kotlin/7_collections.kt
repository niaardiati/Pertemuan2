fun printAll(strings: Collection<String>) {
    for(s in strings) print("$s ")
    println()
}
fun main() {
    //List
    val stringList = listOf("one", "two", "one")
    printAll(stringList)

    //Set
    val stringSet = setOf("one", "two", "three")
    printAll(stringSet)
}