package int_numbers

fun main() {
    val N = 234
    val a = N/100
    val b = (N/10)%10
    val c = N%10
    val M = b*100+a*10+c*1

    println(N)
    println(a)
    println(b)
    println(c)
    println("Перестановка: M $M")
}