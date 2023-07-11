package Java101.Hafta1;
import java.util.Scanner;
public class Ortalama {
    public static void main(String[] args) {
        //Değişkenler ve scanner oluşturuldu.
        int mat, turkce, fizik, kimya, muzik;
        double average;
        Scanner input=new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz: ");
        mat=input.nextInt();
        System.out.print("Türkçe notunuzu giriniz: ");
        turkce=input.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        fizik=input.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        kimya=input.nextInt();
        System.out.print("Müzik notunuzu giriniz: ");
        muzik=input.nextInt();
        //Alınan notlar 100>not>0 olduğu koşullarda ortalamaya dahil oldu .
        if (!((101>mat)&&(mat>0))) {
            mat=0;
        }

        if(!((101>turkce)&&(turkce>0))){
            turkce=0;
        }
        if(!((101>fizik)&&(fizik>0))){
            fizik=0;
        }
        if(!((101>kimya)&&(kimya>0))){
            kimya=0;
        }
        if(!((101>muzik)&&(muzik>0))){
            muzik=0;
        }
        average=(mat+turkce+fizik+kimya+muzik)/5.0;
        if (average>55) {
            System.out.print("Sınıfı Geçtiniz.");
        }else{
            System.out.print("Sınıfta kaldınız.");
        }

    }
}
