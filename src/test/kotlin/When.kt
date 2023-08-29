package test.kotlin

fun main() {
    // 자바코드를 코틀린의 when 식으로 변환한 코드
    val day = 2

    val result = when(day){
        1 -> "월요일"
        2->"화요일"
        3->"수요일"
        4->"목요일"
        else -> "기타"
    }
    println("result: $result")

    //else를 생략할 수 있다

    //여러개의 조건을 콤마로 구분해 한줄에서 정의할 수 있다.


}

enum class Color {
    RED, GREEN
}

