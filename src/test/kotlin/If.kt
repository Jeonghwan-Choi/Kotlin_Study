package test.kotlin

fun main() {
    //if..else 사용
    val job = "Software Developer"

    if(job === "Software Developer") {
        println("Developer")
    }else {
        println("Not Developer")
    }

    //코틀린의 if...else는 표현식이다
    val age : Int = 11
    val str = if (age > 10) {
        "Adult"
    }else {
        "Kid"
    }

    println(str)

    //코틀린은 삼항연산자가 없다. if..else가 표현식이므로 불필요하다.
    val a = 1
    val b = 2
    val c = if (b > a) b else a
    println(c)
}