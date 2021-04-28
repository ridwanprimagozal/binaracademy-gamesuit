package pemain

class SuitPemain() {

    val batu : String = "Batu.toLowerCase()"
    val kertas : String = "Kertas.toLowerCase()"
    val gunting : String = "Gunting.toLowerCase()"

    fun aksiPemain( pemainSatu: String,  pemainDua: String) {

        val suitPemain: Array<String> = arrayOf("Draw", "Pemain 2 Menang", "Pemain 1 Menang")

        if (pemainSatu == pemainDua) {
            println("=====================================")
            println(suitPemain[0])
            println("=====================================")

        } else if (pemainSatu == batu && pemainDua == kertas  ) {
            println("=====================================")
            println(suitPemain[1])
            println("=====================================")
        } else if (pemainSatu == batu && pemainDua == gunting ) {
            println("=====================================")
            println(suitPemain[2])
            println("=====================================")

        }

    }


//    private fun swite(){
//        val batu : String = "Batu.toLowerCase()"
//        val kertas : String = "Kertas.toLowerCase()"
//        val gunting : String = "Gunting.toLowerCase()"
//    }




}






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






