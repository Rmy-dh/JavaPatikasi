package Java101;

import java.util.Scanner;
public class NotOrtalaması {
    public static void main(String[] args) {
        //Değişkenleri ve scanner oluşturma.
        int mat, fizik, kimya, turkce, tarih, muzik, toplam;
        double ortalama;
        Scanner input= new Scanner(System.in);
        //Kullanıcıdan değer al.
        System.out.print("Matematik notunuzu giriniz: ");
        mat=input.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        fizik=input.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        kimya=input.nextInt();
        System.out.print("Türkçe notunuzu giriniz: ");
        turkce=input.nextInt();
        System.out.print("Tarih notunuzu giriniz: ");
        tarih=input.nextInt();
        System.out.print("Müzik notunuzu giriniz: ");
        muzik=input.nextInt();
        toplam = mat+fizik+kimya+turkce+tarih+muzik;
        ortalama = toplam / 6.0;
        String karar =(ortalama>=60)? "Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println(karar);




    }
}
