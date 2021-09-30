import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val string = nextLine()
    val result = solution(string)
    println(result)
}
fun solution(str: String): Boolean {
    if (str.length < 6) {
        return false
    }
    val specials = listOf('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_')
    var upper = false
    var lower = false
    var digit = false
    var special = false
    str.forEach { c ->
        when (c) {
            in 'A'..'Z' -> upper = true
            in 'a'..'z' -> lower = true
            in '0'..'9' -> digit = true
            in specials -> special = true
            else -> return false
        }
    }
    return upper && lower && digit && special
}
//    val specialCharList = arrayListOf<Char>('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_')
//    var result = 0
////    var resultList = mutableListOf<Boolean>(false, false, false, false)
//    var upper = false
//    var lower = false
//    var digit = false
//    var special = false
//
//    if (string.indexOf(' ') != -1 || string.length < 6) {
//       return false
//    for (char in string) {
//        if (char in 'a'..'z') {
//            resultList[0] = true
//            continue
//        }
//        if (char in 'A'..'Z') {
//            resultList[1] = true
//            continue
//        }
//        if (char in '0'..'9') {
//            resultList[2] = true
//            continue
//        }
//        if (char in specialCharList) {
//            resultList[3] = true
//            continue
//        }
//    }
//    for (it in 0..3) {
//        if (resultList[it]) {
//            result++
//        }
//    }
//    return result == 4