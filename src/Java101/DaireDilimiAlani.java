package Java101;

import java.util.Scanner;
public class DaireDilimiAlani {
    public static void main(String[] args) {
        //Değişkenler ve Scanner oluşturuldu.
        double pi=3.14, alan;
        int r, a;
        Scanner input=new Scanner(System.in);
        //Daire dilimi değerlerini alma.
        System.out.print("Daire dilimi yarıçapını giriniz: ");
        r=input.nextInt();
        System.out.print("Daire dilimi merkez açısını giriniz: ");
        a=input.nextInt();
        alan=((pi*r*r)*a)/360;
        System.out.print("Daire dilimi alanı:"+alan);



    }
}
