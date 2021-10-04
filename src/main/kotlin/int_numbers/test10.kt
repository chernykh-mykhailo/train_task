package int_numbers

fun main() {
    var N = 523

    while (N > 0) {
        val r = N % 10
        println(r)
        N = N / 10
    }
}