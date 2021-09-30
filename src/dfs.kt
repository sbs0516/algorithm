fun solution(numbers: IntArray, target: Int): Int {
    var arr = arrayListOf(0)
    numbers.forEach { value ->
        val childs = arrayListOf<Int>()
        arr.forEach { parent ->
            childs.add(parent + value)
            childs.add(parent - value)
        }
        arr = childs
    }
    return arr.filter { it == target }.count()
}
//fun solution(numbers: IntArray, target: Int): Int {
//    return numbers.fold(listOf(0)) { list, i ->
//        list.run {
//            map { it + i } + map { it - i }
//        }
//    }.count { it == target }
//}