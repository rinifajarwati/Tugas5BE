package TugasOOP;

public class Lingkaran extends BentukGeometri{
    double jarijari;
    double phi = 3.14;

    public Lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }

    @Override
    public double hitungLuas() {
        return (double) (phi * jarijari *jarijari);
    }

    @Override
    public double hitungKeliling() {
        return (double) (2 * phi * jarijari);
    }
}
