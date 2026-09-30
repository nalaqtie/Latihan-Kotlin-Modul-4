//LATIHAN 2
enum class CourseStatus {ACTIVE, COMPLETED}

data class Course(val code: String, val name: String, val status: CourseStatus)

fun Course.displayInfo(): String = "$code - $name - $status"

fun describe(status: CourseStatus): String = when (status) {
    CourseStatus.ACTIVE -> "Sedang berjalan"
    CourseStatus.COMPLETED -> "Telah selesai"
}

fun main() {
    val courses = mutableListOf(
    Course("101", "PAB", CourseStatus.ACTIVE),
    Course("102", "PAIM", CourseStatus.ACTIVE),
    Course("103", "PGIM", CourseStatus.ACTIVE)
    )
    courses.add(Course("104", "FSD", CourseStatus.COMPLETED))
    courses.remove(Course("102", "PAIM", CourseStatus.ACTIVE))
    for (course in courses) println(course.displayInfo())
    
    val course = Course("101", "PAB", CourseStatus.ACTIVE)
    val (code, name, status) = course
    println("$code - $name - $status")
    
    println(describe(CourseStatus.ACTIVE))
 
}