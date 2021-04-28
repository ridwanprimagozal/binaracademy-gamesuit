package pemain

import java.lang.reflect.Constructor

class SuitPemain() {

    fun aksiPemainSatu(pemainSatu: String){
//    val suit1 = "Pemain 1 Menang"
//    val suit2 = "Pemain 1 kalah"
//    val suit3 = "Pemain 1 seri"

      val suitPemain1 : Array<String> = arrayOf("Pemain 1 Menang","Pemain 1 kalah","Pemain 1 seri")

    if(pemainSatu == "batu" ){
        println("=====================================")
        println(suitPemain1[0])
        println("=====================================")

    } else if (pemainSatu == "gunting"){
        println("=====================================")
        println(suitPemain1[1])
        println("=====================================")
    }  else if (pemainSatu == "kertas"){
        println("=====================================")
        println(suitPemain1[2])
        println("=====================================")
    }



    }

    fun aksiPemainDua(pemainDua: String){
//    val suit1 = "Pemain 1 Menang"
//    val suit2 = "Pemain 1 kalah"
//    val suit3 = "Pemain 1 seri"

        val suitPemain2 : Array<String> = arrayOf("Pemain 2 kalah","Pemain 2 menang","Pemain 2 seri")

        if(pemainDua == "gunting" ){
            println("=====================================")
            println(suitPemain2[0])
            println("=====================================")

        } else if (pemainDua == "batu"){
            println("=====================================")
            println(suitPemain2[1])
            println("=====================================")
        }  else if (pemainDua== "kertas"){
            println("=====================================")
            println(suitPemain2[2])
            println("=====================================")
        }



    }




}



//fun main (){
//    pemain.SuitPemainSatu().aksiPemainSatu("")
//}




