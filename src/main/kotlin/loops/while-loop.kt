package loops
import loops.items

var idx = 0

fun printWhileLoop() {
  while (idx < items.size) {
    println("item at $idx is ${items[idx]}")
    idx++
  }
}
