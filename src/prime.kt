import java.lang.StringBuilder

fun main() {
    var string = "1234"
    var sff = StringBuffer("")
    var stringTwo = string.plus(5)
    var sb = StringBuilder("12345")
    string+="5"
    var stringTh = sb.toString()
    println(stringTwo)
    println(string)
    println(sff)
}
fun dis(i:Int, location:Int):Int {
    return Math.abs(location%3)
}