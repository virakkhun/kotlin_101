package ranges

class Ranges {
  fun operation(x: Int, y: Int) {
    if(x in 1..y+1) {
      println("$x in range between 1 & $y")
    } else {
      println("$x of range between 1 & $y")
    }
  }

  fun ifOutOfRange() {
    val list = listOf('a', 'b', 'c')

    if(-1 !in 0..list.lastIndex) {
      println("-1 is out of range")
    }

    if(list.size !in list.indices) {
      println("list size is out of valid list indices range, too")
    }
  }

  fun iterateOverRange(startRange: Int, endRange: Int) {
    for(x in startRange..endRange) {
      println(x)
    }
  }

  fun iterateOverProgression() {
    for(x in 1..10 step 2) {
      println(x)
    }

    println()

    for (x in 9 downTo 0 step 3) {
      println(x)
    }
  }
}