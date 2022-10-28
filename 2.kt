
fun main() {

    println("Введите год")
    val god = readln().toInt()
    val result = if(god % 4 == 0 ) "Високосный год 366 дней" else "Не высокосный год 365 дней"

    println(result)
//    println("Ваше число ${even_number(x, y)}")
}
