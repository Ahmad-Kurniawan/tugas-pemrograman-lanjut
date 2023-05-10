//Program ini dibuat sebagai input awal untuk dipanggil pada program berikutya
class Mobil {
    String merek, warna, harga;
    int tahun;


    void setInfoMobil(String merek, String warna, int tahun){
        System.out.println("Merek Mobil \t: "+merek+"\nWarna Mobil \t: "+warna+"\nTahun Produksi \t: "+tahun);
    }

    String setMobil(){
        String a = "Toyota Alphard adalah MPV premium berukuran besar yang diproduksi oleh Toyota Motor Corporation sejak tahun 2002.";
        System.out.println(a);
        return a;
    }

}


