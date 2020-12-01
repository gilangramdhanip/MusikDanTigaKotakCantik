
    fun main(args:Array<String>){

        print("Masukkan jumlah permen di kotak pertama : ")
        var kotak1 = readLine()
        print("Masukkan jumlah permen di kotak Kedua : ")
        var kotak2 = readLine()
        print("Masukkan jumlah permen di kotak Ketiga : ")
        var kotak3 = readLine()

        print("keluaran "+jumlahMakanMinimal(kotak1!!.toInt(), kotak2!!.toInt(), kotak3!!.toInt()))
    }

private fun jumlahMakanMinimal(kotak1 : Int, kotak2 : Int, kotak3 : Int) : Int{

    print("Jumlah yang dimakan dikotak 1 : ")
    var jumlahDimakanKotak1 = readLine()
    print("Jumlah yang dimakan dikotak 2 : ")
    var jumlahDimakanKotak2 = readLine()
    print("Jumlah yang dimakan dikotak 3 : ")
    var jumlahDimakanKotak3 = readLine()

    var totalKotak1 = kotak1 - jumlahDimakanKotak1!!.toInt()
    var totalKotak2 = kotak2 - jumlahDimakanKotak2!!.toInt()
    var totalKotak3 = kotak3 - jumlahDimakanKotak3!!.toInt()

    if(totalKotak1 >= totalKotak2 || totalKotak2 >= totalKotak3){
        return -1
    }else{
        return jumlahDimakanKotak1.toInt()+ jumlahDimakanKotak2.toInt()+ jumlahDimakanKotak3.toInt()
    }


}

