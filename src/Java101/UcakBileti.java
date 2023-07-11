package Java101;
import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        int km, yas, tercih;
        //yi=yaş indirimi, gdbi=gidiş dönüş bilet indirimi.
        double normalTutar, yi,indirimliTutar, gdbi, toplam=0;
        boolean isError=false;
        Scanner input=new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz: ");
        km=input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas=input.nextInt();
        System.out.print("Yolculuk tipini giriniz(1 >= Tek Yön, 2 >= Gidiş Dönüş): ");
        tercih=input.nextInt();
        if (km>0&&yas>0) {
            normalTutar=km*0.10;
            //Yaş bilgisine göre uygulanacak indirimlerin girilmesi.
            if (yas<=12) {
                yi=normalTutar*0.50;
            } else if (yas>12&&yas<=24) {
                yi=normalTutar*0.10;
            } else if (yas>=65) {
                yi=normalTutar*0.30;
            }else{
                yi=0;
            }indirimliTutar=normalTutar-yi;
            if (tercih==1) {
                gdbi=0;
                toplam+=indirimliTutar;
            } else if (tercih==2) {
                gdbi=indirimliTutar*0.20;
                toplam+=(indirimliTutar-gdbi)*2;
            }else{
                isError=true;
            }
        }else{
            isError=true;
        }
        if (isError==true) {
            System.out.print("Hatalı veri girdiniz!");
        }else{
            System.out.print("Toplam tutar: "+ toplam);
        }


    }
}
