//LATIHAN 4
fun main() {
    val scores = mutableMapOf<Int, Int>(
        274 to 95,
        190 to 85,
        226 to 90
    )
    
    scores[226] = 100

    scores.remove(190)
    for ((nim, score) in scores) {
        println("$nim - $score")
    }
    println(scores[190])
}