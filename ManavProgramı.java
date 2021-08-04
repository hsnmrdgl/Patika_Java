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

