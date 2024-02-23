package id.ac.pnm.ti2a.aplikasikotlin


fun main(args: Array<String>) {
    biodata("Ergi Zenila Marta Sasmige", institusi = "Politeknik Negeri Madiun", hobby="Membaca", desc = "Saya suka membaca webtoon dan menonton film, saya juga suka pantai.")
}
fun biodata(nama:String, institusi:String, hobby:String, desc: String, kelas:String = "2A") {
    println("Nama   : $nama")
    println("Prodi  : $institusi")
    println("Kelas  : $kelas")
    println("Hobby  : $hobby")
    println("$desc")
}

