fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
    var answer = mutableListOf<Int>()
    for(arr in commands) {
        val i = arr[0]-1
        val j = arr[1]
        val k = arr[2]-1
        val split = array.copyOfRange(i,j).sortedArray()
        val tmp = split[k]
        answer.add(tmp)
    }
    return answer.toIntArray()
}