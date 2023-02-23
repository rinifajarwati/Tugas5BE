package TugasOOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int pilihan;
        System.out.println("Pilih bidang tanah pak denklek  ");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Lingkaran");
        System.out.print("Masukkan Pilihan Anda = ");
        pilihan = input.nextInt();

        if(pilihan==1){
            Persegi persegi = new Persegi(5);
            System.out.println("Keliling persegi: " + persegi.hitungKeliling());
            System.out.println("Luas persegi: " + persegi.hitungLuas());
        } else if (pilihan==2) {
            PersegiPanjang persegipanjang = new PersegiPanjang(10,5);
            System.out.println("Keliling Persergi Panjang: " +persegipanjang.hitungKeliling());
            System.out.println("Luas Persegi Panjang: " +persegipanjang.hitungLuas());
        } else if (pilihan==3) {
            Segitiga segitiga = new Segitiga(10, 7, 8, 9, 10);
            System.out.println("Keliling Segitiga: " +segitiga.hitungKeliling());
            System.out.println("Luas Segitiga: " +segitiga.hitungLuas());
        } else if (pilihan==4) {
            Lingkaran lingkaran = new Lingkaran(7);
            System.out.println("Keliling Lingkaran: " +lingkaran.hitungKeliling());
            System.out.println("Luas Lingkaran: " +lingkaran.hitungLuas());
        } else {
            System.out.println("Pilihan Tidak Tersedia");
        }

    }
}
