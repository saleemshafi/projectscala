import Timed.timed

class Fibonacci {
	def sequence(prev1:Long, prev2:Long, max:Long):List[Long] = {
		val nextNumber = prev1 + prev2
		if (nextNumber > max)
			List()	
		else
			List(nextNumber) ++ sequence(prev2, nextNumber, max)
	}

	def until(max:Long):List[Long] = {
		List(0L, 1L) ++ sequence(0, 1, max)
	}
}


object Problem2 {
	def sumOf(list: List[Long]):Long = (0L /: list)(_ + _)

	def main(args: Array[String]):Unit = {
		val limit = if (args.length < 1) 4000000 else args(0).toLong
		timed {
			val fib = new Fibonacci
			println(sumOf (for (i <- fib.until(limit) if i % 2 == 0) yield i))
		}
	}
}
