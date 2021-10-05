package `while`

fun main() {
    val n = 5
    val a = 10F
    var p = 1

    for (i in 1..n+1) {
        p= (p*a).toInt()
        println(p)
    }
}