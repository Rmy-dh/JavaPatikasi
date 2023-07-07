package Java101;

import java.util.Scanner;
public class TaksimetreHesabi {
    public static void main(String[] args) {
        //Değişkenler ve scanner oluşturma.
        int km;
        double para, perKm=2.20, startPrice=10;
        Scanner input=new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        km=input.nextInt();
        para=km*perKm;
        para+=startPrice;
        //Ödenecek tutar 20'nin altı ise 20 öde değil ise kendi değerini öde.
        para=(para<20)? 20:para;
        System.out.println(para);

    }
}
