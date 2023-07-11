package Java101.Hafta1;
import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        int day, month;
        //boolean ifade default olarak false çalışıcak herhangi bir hatalı veri girişinde true ifadeye dönüşücek.
        boolean isError=false;

        String burc = "";
        Scanner input=new Scanner(System.in);
        System.out.print("Ay: ");
        month=input.nextInt();
        System.out.print("Gün: ");
        day=input.nextInt();
        //Ay ve günlere göre burç bilgisinin verilişi.
        if((month==1)&&(day>=1&&day<=31)){
            if (day<=21) {
                burc="Oğlak";
            }else{
                burc="Kova";
            }
        } else if ((month==2)&&(day>=1&&day<=28)) {
            if (day<=19) {
                burc="Kova";
            }else {
                burc="Balık";
            }
        } else if ((month==3)&&(day>=1&&day<=31)) {
            if (day<=20) {
                burc="Balık";
            }else{
                burc="Koç";
            }
        } else if ((month==4)&&(day>=1&&day<=31)) {
            if (day<=20) {
                burc="Koç";
            }else{
                burc="Boğa";
            }
        } else if ((month==5)&&(day>=1&&day<=31)) {
            if (day<=21) {
                burc="Boğa";
            }else{
                burc="İkizler";
            }
        } else if ((month==6)&&(day>=1&&day<=30)) {
            if (day<=22) {
                burc="İkizler";
            }else{
                burc="Yengeç";
            }
        } else if ((month==7)&&(day>=1&&day<=31)) {
            if (day<=22) {
                burc="Yengeç";
            }else{
                burc="Aslan";
            }
        } else if ((month==8)&&(day>=1&&day<=31)) {
            if(day<=22){
                burc="Aslan";
            }else{
                burc="Başak";
            }
        } else if ((month==9)&&(day>=1&&day<=30)) {
            if (day<=22) {
                burc="Başak";
            }else{
                burc="Terazi";
            }
        } else if ((month==10)&&(day>=1&&day<=31)) {
            if (day<=22) {
                burc="Terazi";
            }else{
                burc="Akrep";
            }
        } else if ((month==11)&&(day>=1&&day<=30)) {
            if (day<=21) {
                burc="Akrep";
            }else{
                burc="Yay";
            }
        } else if ((month==12)&&(day>=1&&day<=31)) {
            if (day<=21) {
                burc="Yay";
            }else{
                burc="Oğlak";
            }
        }else{
            isError=true;

        }
        //Hatalı durum var ise hata mesajını ,yok ise burç bilgisinin ekrana verilmesi.
        if (isError) {
            System.out.print("Hata! Yanlış bilgi girdiniz.");
        }else{
            System.out.print("Burcunuz: " + burc);

        }

    }
}
