package loops

// constants list `array` annotate type `String`
val items = listOf("Apple", "OnePlus", "Google Pixel")

fun printOutLoop() {
  for (item in items) {
    println("[${item}]")
  }
}

fun printWithIndex() {
  for(idx in items.indices) {
    println("{${idx}} : [${items[idx]}]")
  }
}