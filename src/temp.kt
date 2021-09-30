fun solution(param0:Array<String>): Array<String> {
    var answer = arrayListOf<String>()
    var temp:Array<String> = arrayOf()
    for(i in param0.indices) {
        val index = param0[i].lastIndex
        if(param0[i][index-2] in 1..9) {
            temp[i] = param0[i][index-5]+param0[i].substring(index-1)
        } else {
            temp[i] = param0[i].substring(index-2)
        }
        for(value in temp) {
            var count = 0
            for(j in 1..temp.size) {
                if(value == temp[j]) {
                    count++
                }
            }
            answer.add(value)
            answer.add(count.toString())
        }

    }
    return answer.toTypedArray()
}
fun main() {
    val param0 = arrayOf<String>("/a/a_v2.x","/b/a.x","/d/a/t.x","/e/z/t_v1.z","/k/k/k/a_v9.x")
    println(solution(param0))
}