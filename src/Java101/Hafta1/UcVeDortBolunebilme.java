package Java101.Hafta1;
import java.util.Scanner;
public class UcVeDortBolunebilme {
    public static void main(String[] args) {
        //Değişkenler ve scanner oluşturuldu.
        int number, sayac=0, toplam=0;
        double average;
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        number=input.nextInt();
        /*0'dan "number" sayısına kadar olan sayılardan
        3 ve 4'e tam olarak bölünen sayıların toplamının ortalamasını hesaplama.
         */
        for(int i=0;i<=number;i++){
            if ((i%3==0)&&(i%4==0)) {

                sayac+=1;
                toplam+=i;
            }
        }
        average=toplam/sayac;
        System.out.print("3 ve 4'e bölünen sayıların ortalaması: "+average);

    }
}
