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

