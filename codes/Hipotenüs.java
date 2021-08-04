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

