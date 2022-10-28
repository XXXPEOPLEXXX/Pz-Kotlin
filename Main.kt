fun main() {

    print("Введите 1-е число: ")
    val a = readln().toInt()
    print("Введите 2-е число: ")
    val b = readln().toInt()
    print("Введите 3-е число: ")
    val c = readln().toInt()

    fun getMax(a: Int, b: Int, c: Int): Int {
        return when {
            a > b && a > c -> a
            b > a && b > c -> b
            c > a && c > b -> c
            else -> -1
        }
    }

    println("самое большое число ${getMax(a, b, c)}")

}