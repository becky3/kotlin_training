fun main() {
    val nums = (-1..1)

    nums.forEach { num ->

        val text: String = if (num < 0) {
            "is minus"
        } else if (num > 0) {
            "is plus"
        } else {
            "is zero"
        }

        println("$num $text")
    }
}
