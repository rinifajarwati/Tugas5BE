package TugasOOP;

public class PersegiPanjang extends BentukGeometri {
    double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double hitungLuas() {
        return (double) (panjang * lebar);
    }

    @Override
    public double hitungKeliling() {
        return (double) (2 * (panjang + lebar));
    }
}
