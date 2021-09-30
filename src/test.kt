fun solution(answers: IntArray): IntArray {
    val first = intArrayOf(1,2,3,4,5)
    val second = intArrayOf(2,1,3,4,2,4,2,5)
    val third = intArrayOf(3,3,1,1,2,2,4,4,5,5)
    var count = intArrayOf(0,0,0)

    for(i in answers.indices) {
        if(answers[i] == first[i%5]) {
            count[0]++
        }
        if(answers[i] == second[i%8]) {
            count[1]++
        }
        if(answers[i] == third[i%10]) {
            count[2]++
        }
    }
    var answer = intArrayOf()
    var tmp = ArrayList<Int>()
    val max = count.sortedArray()[2]
    if(count[0]==count[1] && count[1]==count[2]) {
        answer = intArrayOf(1,2,3)
    } else {
        if(count[0]==max) tmp.add(1)
        if(count[1]==max) tmp.add(2)
        if(count[2]==max) tmp.add(3)
    }
    answer = tmp.toIntArray()

    return answer
}
fun main() {
    val answers = intArrayOf(1,3,2,4,2)
    val answer = solution(answers)
    for(i in answer) {
        println(i)
    }

}