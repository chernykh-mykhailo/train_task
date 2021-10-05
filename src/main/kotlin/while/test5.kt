package `while`

fun main() {
    val n = 10
    var i = 1
    var fac = 1

    while (i <= n)  {
        fac = fac*i
        i=i+1
    }
    println(fac)

}