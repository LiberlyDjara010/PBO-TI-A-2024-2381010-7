package polinorfisme;

public class Persegi extends BangunDatar{
    private double sisi;

    public Persegi(final double sisi) {
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }
}
