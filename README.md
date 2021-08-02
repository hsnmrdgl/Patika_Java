# 	:man_technologist: Kodluyoruz / Patika - Java 101
Java ile Backend Web Development Patikası

- [Pratik 1](https://github.com/hsnmrdgl/Patika_Java#arrow_forward-pratik-1---not-ortalamas%C4%B1-hesaplayan-program "Pratik 1")
- [Pratik 2](https://github.com/hsnmrdgl/Patika-Java#arrow_forward-pratik-2---kdv-tutar%C4%B1-hesaplayan-program "Pratik 2")

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

------------


## :arrow_forward: Pratik 2 - KDV Tutarı Hesaplayan Program

:scroll: Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın. Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.

:pushpin: Örnek Çıktı
	  
    Ana paranızı giriniz : 10
  
    KDVsiz Tutar : 10.0
    KDVsiz Oranı : 0.18
    KDVli Tutar : 11.8
    KDV Tutarı : 1.8

### :white_check_mark: Cevap :
<details>
  <summary>Kodu Gör!</summary>
  
 ```java
import java.util.Scanner;

public class KdvTutar {
    public static void main(String[] args) {

    double tutar, kdvliTutar, kdvOran;

    Scanner veri = new Scanner(System.in);
    System.out.print("Tutarı giriniz : ");
    tutar = veri.nextDouble();

    veri.close();

    if (tutar > 1000){
        kdvOran = 0.8;
    }

    else{
        kdvOran = 0.18;
    }

    kdvliTutar = tutar + (tutar * kdvOran);

    System.out.println("\nKDV'siz Tutar : " + tutar);
    System.out.println("KDV'siz Oranı : " + kdvOran);
    System.out.println("KDV'li Tutar : " + kdvliTutar);
    System.out.println("KDV Tutarı : " + (kdvliTutar-tutar));

    }
}

```
</details>


------------

