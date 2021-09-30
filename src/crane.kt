import java.util.*

fun main() {

}
fun solution(board: Array<IntArray>, moves: IntArray): Int {
    var stack = Stack<Int>()
    var value = 0
    var bomb = 0
    moves.forEach { it ->
        for(n in board.indices) {
            value = board[it-1][n]
            if(!stack.isEmpty() && stack.peek() == value) {
                stack.pop()
                bomb+=2
                break
            } else {
                stack.push(value)
            }
            board[it-1][n] = 0
            break
        }
    }
    return bomb
}