import pemain.SuitPemain

fun main(args: Array<String>) {
    println("""     
        
        =============================================
        Aplikasi Penghitung Rata Rata Nilai Mahasiswa
        =============================================
        
    """.trimIndent())



    println("1. Masukan Pemain 1: ")
    val pemainSatu = readLine()
    val suitPemainSatu = SuitPemain()

        suitPemainSatu.aksiPemain(pemainSatu)


    println("2. Masukan Pemain 2: ")
    val pemainDua = readLine()
    val suitPemainDua = SuitPemain()
    suitPemainSatu.aksiPemain(pemainDua)





//    val result : String
//    println("""
//        Hasil :
//        $pemainSatu
//    """.trimIndent() )




}
