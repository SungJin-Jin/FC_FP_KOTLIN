import List.Cons
import List.Nil

fun <T, R> List<T>.map(f: (T) -> R, acc: List<R> = List.Nil): List<R> = when (this) {
    Nil -> acc
    is Cons -> tail.map(f, acc.appendTail(f(head)))
}

fun <T> List<T>.appendTail(tail: T): List<T> = when (this) {
    Nil -> Cons(tail, Nil)
    is Cons -> Cons(head, appendTail(tail))
}
