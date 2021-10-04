package if_else

fun main() {
    val a = 10
    val b = 20
    val c = 30

    if (a > b && b > c) {
        val sum = a + b
        println(sum)
    } else if (a > c && c > b) {
        val sum = a + c
        println(sum)
    } else {
        val sum = b + c
        println(sum)
    }
}