package array;

public class mencariUmurTerkecil {

    public static void main(String[] args) {
        int[] ages = {20, 25, 80, 13, 50, 70, 75, 63, 20, 11, 40};

        int lowestAge = ages[0]; //mengambil nilai awal yaitu 20 

        for (int age : ages) { //for-each loop akan memanggil semua elemnt dari ages dan menyimpannya sementara di age
            if (lowestAge > age) {//kode ini akan bandingkan nilai awal 20 lalu akan membandingkannya dengan semua element dari ages
                lowestAge = age; // jika lowestAge di temukan maka akan di masukan sementara kedalam var lowestAge sampai semua elemnt selesai di cek hasil akhir adalah umur terendah.
            }
        }
        System.out.println("Umur terendah adalah:" + lowestAge);//mengeluarkan 
    }
}
