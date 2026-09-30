//LATIHAN 5
enum class CourseStatus {ACTIVE, COMPLETED}

object AppConfig {const val MAX_COURSES = 5}

data class Course(val code: String, val name: String, val status: CourseStatus) {
    companion object {
        const val PREFIX = "PAB"
    }
}

fun MutableList<Course>.addCourse(course: Course): Boolean {
    if (size < AppConfig.MAX_COURSES &&
        course.code.startsWith(Course.PREFIX)
    ) {
        add(course)
        return true
    }

    return false
}

fun main() {
    val courses = mutableListOf<Course>()
    val course = Course(
        "101",
        "PAB",
        CourseStatus.ACTIVE
    )

    println(courses.addCourse(course))
    println(courses)
}