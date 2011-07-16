import Timed.timed

object Problem1 {
	def main(args: Array[String]):Unit = {
		val limit = if (args.length < 1) 1000 else args(0).toInt 
		timed {
			def numbersBelowLimit = 1 until limit 
			val theSet = numbersBelowLimit filter (x => x % 3 == 0 || x % 5 == 0)
			println( (0 /: theSet)(_ + _) )
		}
	}
}
