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

