fun main() {
    val str = "codility"
    println(solutionThird(str))
}
fun solutionThird(str:String):String {

    for(n in 0 until str.lastIndex) {
        if (str[n] > str[n+1]) {
            return str.removeRange(n,n+1)
        }
    }
    return str.dropLast(1)
}