package Java101;
import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) { int n1, n2, selection;
        Scanner input=new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        n1=input.nextInt();
        System.out.print("İkinci sayıyı giriniz:  ");
        n2=input.nextInt();
        //Yapılacak olan işlem için seçenek belirtme.
        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        selection=input.nextInt();
        //Switch case yapısı ile işlemlere yönlendirme.
        switch (selection){
            case 1:
                System.out.print("Toplama işlemi sonucu:"+(n1+n2));
                break;
            case 2:
                System.out.print("Çıkarma işlemi sonucu: "+(n1-n2));
                break;
            case 3:
                System.out.print("Çarpma işlemi sonucu: "+(n1*n2));
                break;
            case 4:
                if (n2!=0) {
                    System.out.print("Bölme işlemi sonucu: "+(n1/n2));
                }else{
                    System.out.print("Sayı 0'a bölünemez.");
                }
                break;
                //Farklı bir işlem talep ettğinde hata ver.
            default:{
                System.out.print("Hata");
            }


        }

    }
}
