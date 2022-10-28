
fun main() {

    println("Введите год")
    val god = readln().toInt()
    val kraten = if(god % 4 == 0 && god % 100 != 0 || god % 400 == 0 ) "Високосный год 366 дней" else "Не высокосный год 365 дней"

    println(kraten)
//    println("Ваше число ${even_number(x, y)}")
}
