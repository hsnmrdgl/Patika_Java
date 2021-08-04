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

