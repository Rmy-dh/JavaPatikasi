package Java101.Hafta1;

import java.util.Scanner;
public class VucutKitleİndeksi {
    public static void main(String[] args) {

        double boy, kilo, indeks ;
        Scanner input=new Scanner(System.in);
        System.out.print("Boyunuzu(m) giriniz: ");
        boy=input.nextDouble();
        System.out.print("Kilonuzu(kg) giriniz: ");
        kilo=input.nextDouble();
        //İndeks hesabı.
        indeks=kilo/(boy*boy);
        System.out.print("Vücut kitle indeksiniz: "+indeks);


    }
}
