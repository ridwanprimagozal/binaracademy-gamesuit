package pemain

var seri : String = "DRAW!"
var menangPlayerSatuTypeA: String ="Pemain 1 MENANG!"
var menangPlayerSatuTypeB : String ="Pemain 2 MENANG!"

class SuitPemain() {



    fun aksiPemainSatu(pemainSatu: String) {

        if (pemainSatu.equals("Gunting",true)) {
            seri
        } else if (pemainSatu.equals("Gunting" ,true)){
            menangPlayerSatuTypeA
        } else if (pemainSatu.equals("Gunting", true)){
            menangPlayerSatuTypeB
        }

    }

    fun aksiPemainDua(pemainDua: String) {

        if (pemainDua.equals("Gunting",true)) {
            hasilSuitDraw("Draw")
        } else if (pemainDua.equals("Kertas", true)){
            hasilSuitDraw("PemainSatuMenang")
        } else if (pemainDua.equals("Batu",true)){
            hasilSuitDraw("PemainSatuMenangVariasi")
        }
    }


    fun hasilSuitDraw(hasil:String) {

        when (hasil) {
            "Draw" -> {
                PemainSatuDuaDraw().pemainSatuDuaDraw()
            }
            "PemainSatuMenang" -> {
                PemainSatuMenangTypeA().pemainSatuMenangTypeA()
            }
            "PemainSatuMenangVariasi" -> {
                PemainSatuMenangTypeB().pemainSatuMenangTypeB()
            }
            else -> {
                println("tidak ada")
            }
        }
    }
}




//    val batu: String = "batu"
//    val kertas: String = "kertas"
//    val gunting: String = "gunting"
//
//
//    fun aksiPemainSatu( pemainSatu: String? = ""){
//
//
//    }
//
//    fun aksiPemainDua( pemainDua: String? = ""){
//
//        if (pemainDua.equals(batu)) {
//            hasil()
//        } else if (pemainDua.equals(kertas)) {
//            result()
//        } else if (pemainDua.equals(gunting)) {
//            sama()
//        }
//
//    }
//
//    fun hasil() {
//
//        println("=====================================")
//        println("Hasil: $SERI")
//        println("=====================================")
//
//    }
//
//    fun result() {
//
//        println("=====================================")
//        println("Hasil: $MENANGPLAYER1")
//        println("=====================================")
//
//    }
//
//    fun sama() {
//
//        println("=====================================")
//        println("Hasil: $MENANGPLAYER2")
//        println("=====================================")
//
//    }


//    fun isItTie (pemainSatu : String, pemainDua: String) : Boolean {
//        return pemainSatu == pemainDua
//
//
//    }
//
//    fun checkIsPlayerWin(pemainSatu : String?="", pemainDua: String?="") : Boolean {
//        return (pemainSatu == "gunting" && pemainDua == "kertas") ||
//                (pemainSatu == "batu" && pemainDua == "gunting") ||
//                (pemainSatu == "kertas" && pemainDua == "batu")
//
//
//    }





//    private fun swite(){
//        val batu : String = "Batu.toLowerCase()"
//        val kertas : String = "Kertas.toLowerCase()"
//        val gunting : String = "Gunting.toLowerCase()"
//    }


//    fun aksiPemainDua(pemainDua: String){
////    val suit1 = "Pemain 1 Menang"
////    val suit2 = "Pemain 1 kalah"
////    val suit3 = "Pemain 1 seri"
//
//        val suitPemain2 : Array<String> = arrayOf("Pemain 2 kalah","Pemain 2 menang","Pemain 2 seri")
//
//        if(pemainDua == "gunting" ){
//            println("=====================================")
//            println(suitPemain2[0])
//            println("=====================================")
//
//        } else if (pemainDua == "batu"){
//            println("=====================================")
//            println(suitPemain2[1])
//            println("=====================================")
//        }  else if (pemainDua== "kertas"){
//            println("=====================================")
//            println(suitPemain2[2])
//            println("=====================================")
//        }
//
//
//
//    }






