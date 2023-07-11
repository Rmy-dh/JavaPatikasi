package Java101.Hafta1;
import java.util.Scanner;
public class ArtikYilHesabi {
    public static void main(String[] args) {
        int year,kalan;
        Scanner input=new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        year=input.nextInt();
        //Artık yıl hesabında sayı 100'ü tam bölüyor ise 400 ile de tam olarak bölüne bilir.
        if ((year%100==0)&& (year%400==0)) {
            System.out.print(year+ " bir atık yıldır.");

        } else if ((year%100!=0)&&(year%4==0)) {    //Sayı 100'e bölünmüyorsa ve  4 ile tam bölünüyor ise artık yıldır.
            System.out.print(year+" bir artık yıldır.");
        }else{
            System.out.print(year+" bir artık yıl değildir.");
        }


    }
}
