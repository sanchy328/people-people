package ru.netology

fun main() {
    var likes = 131 // Количество лайков
    val printLikes = if ((likes%10 == 1) && (likes%100 != 11)) "Понравилось $likes человеку" else "Понравилось $likes людям"

    println(printLikes)
}