import List.Cons
import List.Nil

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        var data = Cons(1, Cons(2, Nil))

        println(data.map({ it + 1 }).toString())
    }
}
