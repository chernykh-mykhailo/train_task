package if_else

fun main() {
    var n = 0

    if (n>0) {
        n=n+1
    } else if (n<0){
        n=n-2
    } else {
        n=10
    }
    println(n)
}