package `while`

fun main() {
    val a = 1
    val b = 3
    var s = 0

    for (i in a..b+1) {
        s=s+i
    }
    println(s)
}