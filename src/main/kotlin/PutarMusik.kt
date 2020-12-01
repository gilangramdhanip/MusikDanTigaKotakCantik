fun main(args : Array<String>){
//
//var arrayAlbum1 = intArrayOf(300,200,100)
//    var arrayAlbum2 = intArrayOf(400,500,600)
//    var menit = 17 * 60
//    var minLaguAlbum = 1
    var arrayAlbum1 = IntArray(3){0}
    var arrayAlbum2 = IntArray(3){0}
    var i = 0
    var j =0
    val albumPertama = arrayAlbum1.size
    var albumKedua = arrayAlbum2.size

    print("Masukkan menit untuk mendengarkan lagu : ")
    val menit = readLine()!!.toInt()
    val detik = menit * 60
    print("Masukkan minimal lagu per album : ")
    val minLaguAlbum = readLine()!!.toInt()


    while( i < albumPertama)
    {
        print("Masukkan durasi lagu ke $i pada album 1 : ")
        arrayAlbum1[i] = readLine()!!.toInt()
        i++

    }

    while ( j < albumKedua){

        print("Masukkan durasi lagu ke $j pada album 2 : ")
        arrayAlbum2[j] = readLine()!!.toInt()
        j++
    }


    jumlahLaguMaksimum(arrayAlbum1, arrayAlbum2, detik, minLaguAlbum)
}

private fun jumlahLaguMaksimum( array1: IntArray, array2: IntArray, menit : Int, T_Lagu : Int) {

    T_Lagu
    var i = 0
    var k = 0
    var total = 0
    var jumlahLagu = 1


    while (i < array1.size){

            total += array1.elementAt(i)

            if(total<=menit){
                jumlahLagu+=i
            }

        i++

    }

    while ( k < array2.size){
        total += array2.elementAt(k)


        if(total<= menit){
            jumlahLagu+=k
        }

        k++

    }
 //
//
    print("Jumlah Lagu : $jumlahLagu ")
}