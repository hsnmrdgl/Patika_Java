# 	:man_technologist: Kodluyoruz / Patika - Java 101

Kodluyoruz Java Patikası

- [Pratik 1](https://github.com/hsnmrdgl/Patika_Java#arrow_forward-pratik-1---not-ortalamas%C4%B1-hesaplayan-program "Pratik 1")
- [Pratik 2](https://github.com/hsnmrdgl/Patika_Java#arrow_forward-pratik-2---kdv-tutar%C4%B1-hesaplayan-program "Pratik 2")
- [Pratik 3](https://github.com/hsnmrdgl/Patika_Java#arrow_forward-pratik-3---dik-%C3%BC%C3%A7gende-hipoten%C3%BCs-bulan-program "Pratik 3")
- [Pratik 4](https://github.com/hsnmrdgl/Patika_Java#arrow_forward-pratik-4---taksimetre-hesaplayan-program "Pratik 4")
- [Pratik 5](https://github.com/hsnmrdgl/Patika_Java#arrow_forward-pratik-5---dairenin-alan%C4%B1n%C4%B1-ve-%C3%A7evresini-hesaplayan-program "Pratik 5")
- [Ödev 1](https://github.com/hsnmrdgl/Patika_Java#arrow_forward-%C3%B6dev-1---v%C3%BCcut-kitle-i%CC%87ndeksi-hesaplayan-program "Ödev 1")
- [Ödev 2](https://github.com/hsnmrdgl/Patika_Java#arrow_forward-%C3%B6dev-2---manav-kasa-program%C4%B1 "Ödev 2")
- [Pratik 6](https://github.com/hsnmrdgl/Patika_Java#arrow_forward-pratik-6---hesap-makinesi "Pratik 6")
- [Pratik 7](https://github.com/hsnmrdgl/Patika_Java#arrow_forward-pratik-7---kullan%C4%B1c%C4%B1-giri%C5%9Fi "Pratik 7")


## :arrow_forward: Pratik 1 - Not Ortalaması Hesaplayan Program

:scroll: Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın. Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti", küçük ise "Sınıfta Kaldı" yazsın.

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

## :arrow_forward: Pratik 3 - Dik Üçgende Hipotenüs Bulan Program

:scroll: Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın. Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

>Üçgenin Çevresi = 2𝑢
>
>𝑢 = (a+b+c) / 2
>
>Alan&sup2; = 𝑢&times;(𝑢 − 𝑎)&times;(𝑢 − 𝑏)&times;(𝑢 − 𝑐)

### :white_check_mark: Cevap :
<details>
  <summary>Kodu Gör!</summary>
  
 ```java
import java.util.Scanner;

public class Hipotenüs {
    public static void main(String[] args) {

    double a, b, c, alan, cevre, u;

    Scanner veri = new Scanner(System.in);
    System.out.print("İlk kenarı giriniz : ");
    a = veri.nextDouble();

    System.out.print("İkinci kenarı giriniz : ");
    b = veri.nextDouble();
    
    veri.close();
    
    c = Math.sqrt((a*a) + (b*b));

    System.out.println("\nHipotenüs : " + c);

    cevre = a+b+c;
    u = cevre / 2;
    alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
    
    System.out.println("Üçgenin alanı : " + alan);
    
    }
}

```
</details>


------------

## :arrow_forward: Pratik 4 - Taksimetre Hesaplayan Program

:scroll: Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
- Taksimetre KM başına 2.20 TL tutmaktadır.
- Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
- Taksimetre açılış ücreti 10 TL'dir.

### :white_check_mark: Cevap :
<details>
  <summary>Kodu Gör!</summary>
  
 ```java
import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

    int km;
    double tutar;

    Scanner veri = new Scanner(System.in);
    System.out.print("Mesafeyi giriniz : ");
    km = veri.nextInt();
    veri.close();
    
    

    tutar = 10 + (km * 2.20);

    if(tutar < 20){
        tutar = 20;
    }

    System.out.println("Toplam tutar : " + tutar);

    }
}

```
</details>


------------

## :arrow_forward: Pratik 5 - Dairenin Alanını ve Çevresini Hesaplayan Program

:scroll: Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın. Yarıçapı r, merkez açısısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
	
**Not** : 𝜋 sayısını = 3.14 alınız.
	
> Alan Formülü : π &times; r&sup2;
>
> Çevre Formülü : 2π &times; r
>
> Formül : (𝜋 &times; r&sup2; &times; 𝛼) / 360
	
### :white_check_mark: Cevap :
<details>
  <summary>Kodu Gör!</summary>
  
 ```java
import java.util.Scanner;

public class DaireHesap {
    public static void main(String[] args) {
        
        double r, alan, cevre, merkezAcı, dilimAlan, pi=3.14;

        Scanner veri = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını (cm cisinden) giriniz : ");
        r = veri.nextDouble();
        System.out.print("Dairenin merkez açısını giriniz : ");
        merkezAcı = veri.nextDouble();
        veri.close();

        cevre = 2*pi*r;
        System.out.println("Dairenin çevresi : " + cevre + "cm");

        alan = pi*r*r;
        System.out.println("Dairenin alanı : " + alan + "cm\u00B2");


        dilimAlan=(alan*merkezAcı)/360;
        System.out.println("Daire diliminin alanı : " + dilimAlan + "cm\u00B2");
    }
}

```
</details>


------------

	
## :arrow_forward: Ödev 1 - Vücut Kitle İndeksi Hesaplayan Program
	
:scroll: Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıda ki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

:pushpin: Örnek Çıktı
	  
    Lütfen boyunuzu (metre cinsinde) giriniz : 1,83
    Lütfen kilonuzu giriniz : 75
    Vücut Kitle İndeksiniz : 22.395413419331717
	
### :white_check_mark: Cevap :
<details>
  <summary>Kodu Gör!</summary>
  
 ```java
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

```
</details>


------------

## :arrow_forward: Ödev 2 - Manav Kasa Programı

:scroll: Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları :
- Armut : 2,14 TL
- Elma : 3,67 TL
- Domates : 1,11 TL
- Muz: 0,95 TL
- Patlıcan : 5,00 TL
	
:pushpin: Örnek Çıktı
	  
    Armut Kaç Kilo ? :0
    Elma Kaç Kilo ? :1
    Domates Kaç Kilo ? :1
    Muz Kaç Kilo ? :2
    Patlıcan Kaç Kilo ? :3
    Toplam Tutar : 21.68 TL

### :white_check_mark: Cevap :
<details>
  <summary>Kodu Gör!</summary>
  
 ```java
import java.util.Scanner;

public class ManavProgramı {
    public static void main(String[] args) {
        
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;
        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg, toplam;

        Scanner veri = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? : ");
        armutKg = veri.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        elmaKg = veri.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        domatesKg = veri.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        muzKg = veri.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlicanKg = veri.nextDouble();
        veri.close();

        toplam = (armut*armutKg)+(elma*elmaKg)+(domates*domatesKg)+(muz*muzKg)+(patlican*patlicanKg);
        System.out.println("Toplam tutar = " + toplam + " TL");

    }
}

```
</details>


------------
	
## :arrow_forward: Pratik 6 - Hesap Makinesi

:scroll: Java koşullu ifadeler ile basit hesap makinesi yapımı. Hesap makinesini switch-case kullanarak yapınız.
	
	
### :white_check_mark: Cevap :
<details>
  <summary>Kodu Gör!</summary>
  
 ```java
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

```
</details>
	

------------

## :arrow_forward: Pratik 7 - Kullanıcı Girişi
	
:scroll: Java koşullu ifadeler ile kullanıcı adı ve şifreyi kontrol eden program yapımı. Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.

### :white_check_mark: Cevap :
<details>
  <summary>Kodu Gör!</summary>
  
 ```java
import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {

        String username, password;
        char sifreCevap;

        Scanner veri = new Scanner(System.in);

        System.out.print("Kullanıcı Adı : ");
        username = veri.nextLine();
        System.out.print("Şifre : ");
        password = veri.nextLine();

        if (username.equals("patika")) {
            if (password.equals("dev")) {
                System.out.println("Giriş Başarılı!");
            }
            
            else {
                System.out.println("Hatalı şifre girişi!");
                System.out.print("Şifrenizi sıfırlamak ister misiniz? (E)vet/(H)ayır : ");
                sifreCevap = veri.next().charAt(0);

                if (sifreCevap == 'E') {

                    System.out.print("Yeni Şifre : ");
                    String newpassword = veri.next();
                    veri.close();

                    if (newpassword.equals(password) || newpassword.equals("dev")) {
                        System.out.print("Yeni şifre eski şifreyle aynı olmamalıdır!");
                    }
                    else {
                        System.out.print("Yeni şifre başarıyla oluşturuldu!");
                    }
                }
                else if (sifreCevap == 'H') {
                    System.out.print("Tekrar giriş yapınız.");

                }
                else {
                    System.out.print("Lütfen geçerli bir parametre giriniz. E (Evet) veya H (Hayır) !");
                }
            }
        }
        else {
            System.out.println("Geçersiz kullanıcı adı!");
        }
    }
}

```
</details>
	

------------
