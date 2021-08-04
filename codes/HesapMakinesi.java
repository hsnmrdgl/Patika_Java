import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        double sayi1, sayi2, sonuc;
        char islem;
        Scanner veri = new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz > ");
        sayi1 = veri.nextInt();

        System.out.print("2. Sayıyı giriniz > ");
        sayi2 = veri.nextInt();

        System.out.println("\tToplama işlemi için \"+\"");
        System.out.println("\tÇıkarma işlemi için \"-\"");
        System.out.println("\tÇarpma işlemi için \"*\"");
        System.out.println("\tBölme işlemi için \"/\"");
        System.out.print("Yapmak istediğiniz işlem için ilgili sayıyı seçiniz >> ");

        islem = veri.next().charAt(0);

        switch (islem) {
            case '+':
                sonuc = sayi1 + sayi2;
                System.out.print("Toplama sonucu = " + sonuc);
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                System.out.print("Çıkarma sonucu = " + sonuc);
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                System.out.print("Çarpma sonucu = " + sonuc);
                break;
            case '/':
                if (sayi2 == 0) {
                    System.out.print("Bir sayı sıfıra bölünemez");
                    break;
                } else {
                    sonuc = sayi1 / sayi2;
                    System.out.print("Bölme sonucu = " + sonuc);
                    break;
                }
            default:
                System.out.print("Geçerli bir operatör seçin!");
                break;

        }
        veri.close();
    }
}