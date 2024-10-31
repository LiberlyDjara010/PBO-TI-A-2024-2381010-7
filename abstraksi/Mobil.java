package abstraksi;

public class Mobil extends Kendaraan {

    public Mobil (final String warna) {
        super (warna);
    }
    @override
    void bergerak() {
        System.out.println("Mobil bergerak di jalan:");
    }
}
