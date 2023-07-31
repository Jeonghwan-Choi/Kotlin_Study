import java.io.IOException

class KotlinThrow {

    @Throws(IOException::class)
    fun throwIOException() {
        throw IOException("IOException Call Kotlin")
    }
    
}
fun main() {
    val javaThrow = JavaThrow()
    javaThrow.throwIOException()

    val kotlinThrow = KotlinThrow()
    kotlinThrow.throwIOException()
}