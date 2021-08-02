# Kodluyoruz / Patika - Java 101
Java ile Backend Web Development Patikası

- [Pratik 1](https://github.com/hsnmrdgl/Patika-Java#pratik-1---not-ortalamas%C4%B1-hesaplayan-program "Pratik 1")

## :arrow_forward: Pratik 1 - Not Ortalaması Hesaplayan Program

:scroll: Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti", küçük ise "Sınıfta Kaldı" yazsın.

**Not** : If ve Else kullanılmayacak...

### :white_check_mark: Cevap :
<details>
  <summary>Kodu Gör!</summary>
  
 ```java
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


```
</details>
