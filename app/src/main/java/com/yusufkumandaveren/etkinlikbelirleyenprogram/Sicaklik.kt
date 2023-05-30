package com.yusufkumandaveren.etkinlikbelirleyenprogram

import java.util.Scanner

/*Java ile kullanıcının girdiği sıcaklık durumuna göre aşağıda ki etkinlikleri öneren programı yazınız.

Sıcaklık 5'den küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Tiyatro" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Mangal" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.*/

class Sicaklik {

    fun sicakliklar(){
        print("Sıcaklık degerini giriniz:")
        val derece = readln()!!.toIntOrNull()
        when(derece){
            in 1..4 -> println("Hava $derece derece Kayak yapabilirsiniz.") // when de in 1..5 yapısı ile aralıklı deger yapısını kullanabiliriz.
            in 5..14 -> println("Hava $derece derece Tiyatro izlemeye gidebilirsiniz.")
            in 15..24 -> println("Hava $derece derece Mangal'a gidebilirsiniz.")
            in 25..55 -> println("Hava $derece derece Yüzmeye gidebilirsiniz.")
            else -> println("Cehennem sicakligi olmus gecmis olsun :(")
        }
    }
}
