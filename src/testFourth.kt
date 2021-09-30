import kotlin.math.max

fun main() {
    val list = intArrayOf(1,1)
    println(solutionFourth(list))
}
fun solutionFourth(blocks:IntArray):Int {
    val downScore = IntArray(blocks.size)
    val upScore = IntArray(blocks.size)

    // assertEquals( 3 , angryFrogs.solution(intArrayOf(2, 6, 8, 5)))
    // 1, 1, 1, 2
    // 3, 2, 1, 1
    var maxValue = 0
    var prevScore = 0
    var prevValue = Int.MAX_VALUE

    // Down
    blocks.forEachIndexed { index, value ->
        if(prevValue >= value) {
            prevScore++
            downScore[index] = prevScore
        } else {
            prevScore = 1
            downScore[index] = 1
        }
        prevValue = value
    }

    // Up
    prevScore = 0
    prevValue = 0

    for( index in blocks.lastIndex downTo  0) {
        val value = blocks[index]

        if(prevValue >= value) {
            prevScore++
            upScore[index] = prevScore
        } else {
            prevScore = 1
            upScore[index] = 1
        }
        prevValue = value
    }

    for( index in 0..blocks.lastIndex ) {
        maxValue = max(maxValue, downScore[index] + upScore[index] - 1)
    }

    return maxValue


}

//    var temp = 0
//    var frontArray = IntArray(block.size){1}
//    var endArray = IntArray(block.size){1}
//    var max = 0
//    for(n in 0 until block.lastIndex) {
//        if(block[n]<block[n+1]) {
//            temp = 0
//            continue
//        } else {
//            temp++
//            frontArray[n+1] += temp
//        }
//    }
//    for(n in block.lastIndex downTo 1) {
//        if(block[n]<block[n-1]) {
//            temp = 0
//            continue
//        } else {
//            temp++
//            endArray[n-1] += temp
//        }
//    }
//    for(n in frontArray.indices) {
//        val sum = frontArray[n]+endArray[n]
//        if(sum>max) {
//            max = sum
//        }
//    }
//    return max-1





//var longest = 0
//var temp = 1
//if(block.size == 2){
//    return 2
//}
//for(n in 0 until block.lastIndex) {
//    if(block[n]<=block[n+1]) {
//        temp++
//    } else {
//        longest = temp
//        temp = 1
//        break
//    }
//}
//for(n in 1 until block.lastIndex) {
//    for(k in n downTo 1) {
//        if(block[k-1]>=block[k]){ // 1 5 5 2 6
//            temp++
//        } else {
//            break
//        }
//    }
//    for(j in n until block.lastIndex) {
//        if(block[j]<=block[j+1]) {
//            temp++
//        } else {
//            if(longest<temp){
//                longest = temp
//            }
//            temp = 1
//            break
//        }
//    }
//}
//if(longest<temp){
//    longest = temp
//}
//return longest