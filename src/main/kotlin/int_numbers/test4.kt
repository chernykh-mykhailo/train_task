package int_numbers

fun main() {
    val N = 234
    val a = N/100
    val b = (N/10)%10
    val c = N%10
    val M = b*100+c*10+a*1

    println(M)


}