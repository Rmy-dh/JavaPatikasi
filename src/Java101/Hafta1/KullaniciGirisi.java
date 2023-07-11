package Java101.Hafta1;
import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        //Değişkenler ve scanner oluşturuldu.
        String userName, password, newPassword, choice;
        Scanner input = new Scanner(System.in);
        System.out.print("User name: ");
        userName = input.nextLine();
        System.out.print("Password: ");
        password = input.nextLine();
        //Kullanıcı isim ve şifreyi doğru girdiğinde giriş başarılı .
        if (userName.equals("Patika") && password.equals("Java101")) {
            System.out.print("Giriş başarılı.");
            //Kullanıcı isimi doğru ama şifreyi yanlış girmişse
        } else if ((!(password.equals("Java101")) && userName.equals("Patika"))) {
            System.out.println("Yanlış şifre! Şifre sıfırlamak için YES istemiyorsanız NO giriniz. ");
            System.out.print("Seçiminiz: ");
            choice = input.nextLine();
            if (choice.equals("YES")) {
                System.out.print("Yeni şifreyi giriniz: ");
                newPassword = input.nextLine();
                if (newPassword.equals("Java101")) {
                    System.out.print("Şifre oluşturulamadı.");

                } else {
                    System.out.print("Şifre oluşturuldu.");

                }

            }else{
                System.out.print("Şifre değiştirme işlemi istenmedi.Giriş başarısız!");
            }

        }else{
            System.out.print("Bilgileriniz yanlış!");
        }
    }
}
