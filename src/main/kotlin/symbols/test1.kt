package symbols

fun main() {
    val string = "helo"
    string.toCharArray()
        .forEachIndexed { pos, c ->
            println("$pos. $c -> ${String.format("\\%04x", c.toInt())}")
        }
}