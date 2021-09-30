fun main() {
    val P = intArrayOf(2,3,4,2)
    val S = intArrayOf(2,5,7,2)
    println(solution(P,S))
}
fun solution(P:IntArray, S:IntArray):Int {
    var totalPerson = P.sum()
    val carSizeWithDescending = S.sortedArrayDescending()
    var nCar = 0
    for(it in carSizeWithDescending){
        if(totalPerson-it>0){
            nCar++
            totalPerson-=it
            continue
        } else {
            nCar++
            break
        }
    }
    return nCar
}