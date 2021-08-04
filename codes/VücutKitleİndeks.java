import java.util.Scanner;

public class VücutKitleİndeks {
   public static void main(String[] args) {
       
       double boy, kilo, indeks;

       Scanner veri = new Scanner(System.in);
       System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
       boy = veri.nextDouble();
       System.out.print("Lütfen kilonuzu giriniz : ");
       kilo = veri.nextDouble();
       veri.close();

       indeks = kilo / (boy * boy);

       System.out.println("Vücut Kitle İndeksiniz : " + indeks);
   }
}

