import pemain.SuitPemain

fun main(args: Array<String>) {
    println("""     
        
        =============================================
        Aplikasi Penghitung Rata Rata Nilai Mahasiswa
        =============================================
        
    """.trimIndent())



    println("1. Masukan Pemain 1: ")
    val pemainSatu = readLine()?.toString()!!
    val suitPemainSatu= SuitPemain()

    suitPemainSatu.aksiPemainSatu(pemainSatu)




    println("2. Masukan Pemain 2: ")
    val pemainDua = readLine()?.toString()!!
    val suitPemainDua = SuitPemain()
    suitPemainDua.aksiPemainDua(pemainDua)


//    val result : String
//    println("""
//        Hasil :
//        $pemainSatu
//    """.trimIndent() )




}









