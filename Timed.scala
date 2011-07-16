object Timed {

def timed(func:  => Unit) {
	def formatTime(time: Long):String = time+"ms" 

	val start = System.currentTimeMillis
	try {
		func
	} finally {
		val end = System.currentTimeMillis
		println("Elapsed: "+formatTime(end-start))
	}
}

}

/*
timed {
	println("what's going on!")
}
*/
