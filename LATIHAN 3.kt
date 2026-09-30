//LATIHAN 3
fun main() {
    val skills = mutableSetOf("Kotlin", "Java")
    skills.add("Python")
    skills.add("Kotlin")
    println(skills.size)
    println("Swift" in skills)
    println("Python" in skills)
}