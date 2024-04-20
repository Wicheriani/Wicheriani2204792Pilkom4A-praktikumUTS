import java.util.Scanner;

class Balok {
    private int panjang;
    private int lebar;
    private int tinggi;

    public Balok() {
        panjang = 0;
        lebar = 0;
        tinggi = 0;
    }

    public Balok(int panjangBaru, int lebarBaru, int tinggiBaru) {
        panjang = panjangBaru;
        lebar = lebarBaru;
        tinggi = tinggiBaru;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjangBaru) {
        panjang = panjangBaru;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebarBaru) {
        lebar = lebarBaru;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggiBaru) {
        tinggi = tinggiBaru;
    }

    public int getLuas() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }

    public int getKeliling() {
        return 4 * (panjang + lebar + tinggi);
    }

    public int getVolume() {
        return panjang * lebar * tinggi;
    }
}

public class UTS4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan panjang balok: ");
            int panjang = scanner.nextInt();
            
            System.out.print("Masukkan lebar balok: ");
            int lebar = scanner.nextInt();
            
            System.out.print("Masukkan tinggi balok: ");
            int tinggi = scanner.nextInt();

            Balok balok = new Balok(panjang, lebar, tinggi);

            System.out.println("Luas balok: " + balok.getLuas());
            System.out.println("Keliling balok: " + balok.getKeliling());
            System.out.println("Volume balok: " + balok.getVolume());
        }
    }
}
