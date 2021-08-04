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

