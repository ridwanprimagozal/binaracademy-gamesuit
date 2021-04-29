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









