package pewarisan;

public class Mobil extends Kendaraan {
    private int jumlahpintu;
    private String jenisBahanBakar;

    public Mobil(final String merek, final String model, final int tahunProduksi){
        super(merek, model, tahunProduksi);
    }

    public void infoMobil(){
        super.infoKendaraan();
        System.out.println("Jumlah pintu: " + jumlahpintu);
        System.out.println("Jenis bahan bakar : " + jenisBahanBakar);
    }
}