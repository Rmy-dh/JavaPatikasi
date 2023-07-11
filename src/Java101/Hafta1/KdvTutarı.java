package Java101.Hafta1;

import java.util.Scanner;
public class KdvTutarı {
    public static void main(String[] args) {
        //Değişkenler ve scanner oluşturma.
        double para, kdv, kdvliTutar, kdvTutari;
        Scanner input = new Scanner(System.in);
        System.out.print("Ürün fiyatını giriniz: ");
        para = input.nextDouble();
        //Koşul ifadesi belirtme.
        kdv=((para>0)&&(para<1000))? 0.18:0.08;
        //Koşula bağlı olarak işlemlerin gerçekleşmesi.
        kdvTutari=para*kdv;
        kdvliTutar=para+kdvTutari;
        System.out.println("Ürün fiyatı: "+para);
        System.out.println("Kdv miktarı: "+kdvTutari);
        System.out.println("Kdv'li fiyat: "+kdvliTutar);



    }
}
