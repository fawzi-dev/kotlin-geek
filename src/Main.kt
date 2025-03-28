import java.util.*

fun main() {

    /// Simple multiplication table
    // Note that in kotlin we can name loops

   parentLoop@ for (i in 1..10) {
      childLoop@  for (j in 1..10) {
          // Since we can name loops, we can break a single loop
          if(i*j==35) break@parentLoop;
            print("${i * j}\t")
        }
        println()
    }

}
