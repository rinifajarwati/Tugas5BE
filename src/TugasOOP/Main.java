package TugasOOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BentukGeometri bentukGeometri = new BentukGeometri();
        Persegi persegi = new Persegi(5);
        PersegiPanjang persegipanjang = new PersegiPanjang(10, 5);
        Segitiga segitiga = new Segitiga(10,7,8,9, 10);
        Lingkaran lingkaran = new Lingkaran(7);

        // memanggil method luas dan keliling
        bentukGeometri.hitungLuas();
        bentukGeometri.hitungKeliling();

        Scanner input= new Scanner(System.in);
        int pilihan;
        System.out.println("Pilihan menghitung bidang tanah");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Lingkaran");
        System.out.println("Masukkan Pilihan anda = ");
        pilihan = input.nextInt();
        if(pilihan == 1){
            System.out.println("Luas persegi: " + persegi.hitungLuas());
            System.out.println("keliling persegi: " + persegi.hitungKeliling());
        } else if (pilihan == 2) {
            System.out.println("Luas persegi panjang: " + persegipanjang.hitungLuas());
            System.out.println("keliling persegi panjang: " + persegipanjang.hitungKeliling());
        } else if (pilihan == 3) {
            System.out.println("Luas segitiga: " + segitiga.hitungLuas());
            System.out.println("keliling segitiga: " + segitiga.hitungKeliling());
        } else if (pilihan == 4) {
            System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
            System.out.println("keliling Lingkaran: " + lingkaran.hitungKeliling());
        } else {
            System.out.println("tidak ada pilihan");
        }
    }
}
