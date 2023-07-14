package Java101;
import java.util.Scanner;
public class MetotlarIleHesapMakinesi {
    static void sum(int a ,int b){
        System.out.println("Toplamları: "+(a+b));
    }
    static void minus(int a,int b){
        System.out.println("Çıkarma: "+(a-b));
    }
    static void times(int a,int b){
        System.out.println("Çarpımları: "+(a*b));
    }
    static int divided(int a,int b){
        if(b==0){
            System.out.println("İkinci sayı 0'dan farklı olmalı!");
            return 0;
        }
        System.out.println("Bölüm= "+(a/b));
        return 1;
    }
    static void power(int a,int b){
        int result=1;
        for(int i=1;i<=b;i++){
            result*=a;
        }
        System.out.println("Üs hesabı: "+result);
    }
    static void factorial(int a){
        int result=1;
        for (int i=1;i<=a;i++){
            result*=i;
        }
        System.out.println("Faktöriyeli: "+result);
    }
    static void mod(int a,int b){
        System.out.println("Modları: "+(a%b));
    }
    static void calc(int a,int b){
        System.out.println("Alan: "+(a*b));
        System.out.println("Çevre: "+(2*(a+b)));
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,select;

        String menu="1-Toplama İşlemi\n2-Çıkarma İşlemi\n3-Çarpma İşlemi\n4-Bölme İşlemi\n" +
                "5-Üslü Sayı Hesaplama\n6-Faktöriyel\n7-Mod\n8-Dikdörtgen Alan ve Çevre Hesabı\n0-Çıkış Yap";
        System.out.println(menu);
        while (true){
            System.out.print("Bir işlem seçiniz: ");
            select=input.nextInt();

            if(select==0){
                break;
            }
            System.out.print("İlk sayıyı giriniz: ");
            a=input.nextInt();
            System.out.print("İkinci sayıyı giriniz: ");
            b=input.nextInt();
            switch (select){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    divided(a,b);
                    break;
                case 5:
                    power(a,b);
                    break;
                case 6:
                    factorial(a);
                    break;
                case 7:
                    mod(a,b);
                    break;
                case 8:
                    calc(a,b);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz.");


            }

        }
        System.out.println("Güle güle");


    }
}
