package Java101;
import java.util.Scanner;
public class AtmProjesi {
    public static void main(String[] args) {
        //Switch case yapısı kullanılarak atm makinası yapıldı.
        String userName, password;
        int right=3;
        int select;
        int balance=1500;
        int price;
        while (right>0){
            Scanner input=new Scanner(System.in);
            System.out.print("Kullanıcı adınızı giriniz: ");
            userName=input.nextLine();
            System.out.print("Parolanız: ");
            password=input.nextLine();
            if (userName.equals("patika")&&password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz.");
                do {
                    System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgulama\n4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select=input.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Para miktarı: ");
                            price=input.nextInt();
                            balance+=price;
                            break;
                        case 2:
                            System.out.print("Para miktarı: ");
                            price=input.nextInt();
                            if (price>balance) {
                                System.out.println("Bakiye Yetersiz.");
                            }else{
                                balance-=price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: "+balance);
                            break;

                    }

                }while(select!=4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            }else{
                --right;
                System.out.println("Hatalı kullanıcı adı veya şifre! Tekrar deneyiniz.");
                if (right==0) {

                    System.out.println("Hesabınız bloke olmuştur. Lütfen bankanız ile iletişime geçiniz.");
                }else{
                    System.out.println("Kalan Hakkınız: "+right);
                }
            }
        }

    }
}
