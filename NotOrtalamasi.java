import java.util.Scanner;

public class NotOrtalamasi {
  public static void main(String[] args) {

  double matematik, fizik, kimya, turkce, tarih, muzik;
  Scanner veri = new Scanner(System.in);

  System.out.print("Matematik notunuzu giriniz : ");
  matematik = veri.nextInt();

  System.out.print("Fizik notunuzu giriniz : ");
  fizik = veri.nextInt();

  System.out.print("Kimya notunuzu giriniz : ");
  kimya = veri.nextInt();

  System.out.print("Türkçe notunuzu giriniz : ");
  turkce = veri.nextInt();

  System.out.print("Tarih notunuzu giriniz : ");
  tarih = veri.nextInt();

  System.out.print("Müzik notunuzu giriniz : ");
  muzik = veri.nextInt();

  veri.close();

  double notToplam = matematik + fizik + kimya + turkce + tarih + muzik;
  double notOrt = notToplam / 6;

  System.out.println("\nOrtamanız = " + notOrt);
  boolean bool = notOrt >= 60;
  System.out.println((bool == true ? "\nSınıfı Geçti" : "\nSınıfta Kaldı"));
  
  }
}

