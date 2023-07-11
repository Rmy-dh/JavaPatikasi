package Java101;
import java.util.Scanner;
public class DortunKatiOlanSayilarinToplami {
    public static void main(String[] args) {
        int n,toplam=0;
        /*
        Tek bir sayı girilene kadar kullanıcıdan girişleri
        kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan program.
         */
        Scanner input=new Scanner(System.in);
        do{
            System.out.print("Bir sayı giriniz: ");
            n=input.nextInt();
            if(n%4==0){
                toplam+=n;
            }
        }while( n%2==0);
        System.out.print("4'ün katı olan sayıların toplamı: "+toplam);

    }
}
