package TugasOOP;

public class Lingkaran {
    double jarijari;
    double phi = 3.14;

    public Lingkaran(double jarijari){
        this.jarijari =jarijari;
    }

    public double hitungKeliling(){
        return 2 * phi * jarijari;
    }

    public double hitungLuas(){
        return phi * jarijari *jarijari;
    }
}
