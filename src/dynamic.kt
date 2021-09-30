import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val n = nextInt()
    println(fibonacci(n))
}
fun fibonacci(n:Int):Int {
    var resultList = IntArray(100) { 0 }
    if(n<=2) return 1;
    if(resultList[n]==0){
        resultList[n]=fibonacci(n-1)+fibonacci(n-2)
    }
    return resultList[n]
}