package Java101.Hafta1;

import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args) {
        //Değişkenler ve scanner oluşturma.
        int a, b, c;
        double u, alan;
        Scanner input=new Scanner(System.in);
        System.out.print("1. kenar uzunluğunu giriniz: ");
        a=input.nextInt();
        System.out.print("2. kenar uzunluğunu giriniz: ");
        b=input.nextInt();
        System.out.print("3. kenar uzunluğunu giriniz: ");
        c=input.nextInt();
        //Alan hesaplama.
        u=(a+b+c)/2.0;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("Üçgenin alanı: "+alan);


    }
}
