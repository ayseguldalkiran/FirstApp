package com.aysegul.firstapp

import java.util.*
import kotlin.random.Random

fun main() {
    AsalMi()
    //HarfNotuHesapla()
    //HangiGun()
    //RastgeleSayiyiBul()

}

fun AsalMi() {

    val sayiInput = Scanner(System.`in`)
    println("Sayı: ")
    var counter = 0

    val sayi = sayiInput.nextInt()

    for (i in 2..sayi-1){
        if( sayi%i == 0){
            counter++
        }
    }
    if(sayi == 0 || sayi == 1){
        println("Asal değil")
    }
    else if(sayi == 2){
        println("Asal")
    }
    else if(counter == 0){
        println("Asal")
    }
    else {
        println("Asal değil")
    }

}

fun HarfNotuHesapla() {
    val vizeInput = Scanner(System.`in`)
    println("Vize notunuz: ")
    val vize = vizeInput.nextInt()

    val finalInput = Scanner(System.`in`)
    println("Final notunuz: ")
    val final = finalInput.nextInt()

    var ortalama = 0
    ortalama = (vize + final) / 2

    when  {
        ortalama > 0 && ortalama <= 49 -> println("FF")
        ortalama > 49 && ortalama <= 59 -> println("DD")
        ortalama > 59 && ortalama <= 69 -> println("CC")
        ortalama > 69 && ortalama <= 79 -> println("BB")
        ortalama > 79 && ortalama <= 100 -> println("AA")

    }

}

fun HangiGun () {
    val sayiInput = Scanner(System.`in`)
    println("Bir sayi giriniz: ")
    val sayi = sayiInput.nextInt()

    when (sayi) {
        1 -> println("$sayi sonra günlerden perşembe")
        2 -> println("$sayi sonra günlerden cuma")
        3 -> println("$sayi sonra günlerden cumartesi")
        4 -> println("$sayi sonra günlerden pazar")
        5 -> println("$sayi sonra günlerden pazartesi")
        6 -> println("$sayi sonra günlerden salı")
        7 -> println("$sayi sonra günlerden çarşamba")
    }
    if (sayi > 7) {

        when {
            sayi % 7 == 1 -> println("$sayi sonra günlerden perşembe")
            sayi % 7 == 2 -> println("$sayi sonra günlerden cuma")
            sayi % 7 == 3 -> println("$sayi sonra günlerden cumartesi")
            sayi % 7 == 4  -> println("$sayi sonra günlerden pazar")
            sayi % 7 == 5  -> println("$sayi sonra günlerden pazartesi")
            sayi % 7 == 6  -> println("$sayi sonra günlerden salı")
            sayi % 7 == 0  -> println("$sayi sonra günlerden çarşamba")

        }

    }
}

fun RastgeleSayiyiBul () {
    val randomSayi = Random.nextInt(1,100)
    var tahminHakki = 3
    println("Random: " + randomSayi)
    println("3 tahmin hakkınız var. 1 ie 100 arasında bir sayı giriniz: ")


    while(tahminHakki >= 1) {
        val tahminInput = Scanner(System.`in`)
        val tahmin = tahminInput.nextInt()

        if(tahmin == randomSayi){
            println("Tebrikler doğru sayıyı buldunuz!")
        }

        if(tahmin < randomSayi) {
            tahminHakki--
            if(tahminHakki != 0){
                println("Kalan tahmin hakkınız: " + tahminHakki + ", Daha büyük bir sayı deneyin.")
            }
        }

        if(tahmin > randomSayi) {
            tahminHakki--
            if(tahminHakki != 0){
                println("Kalan tahmin hakkınız: " + tahminHakki + ", Daha küçük bir sayı deneyin.")
            }
        }
    }

    println("Tahmin hakkınız bitti")

}


