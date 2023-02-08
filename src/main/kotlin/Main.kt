data class Person(var name: String, var age: Int = 0, var city: String = "", var sex: String = "")
fun main() {
    val andrey = Person("Andrey").apply {
        age = 28
        city = "Saint-Petersburg"
        sex = "men"
    }
    val yana = Person("Yana").apply {
        age = 28
        city = "Saint-Petersburg"
        sex = "women"
    }
    println("Парни: $andrey")
    println("Девушки: $yana")
    
    val people = listOf(andrey, yana)
    println("Список людей: $people")
}