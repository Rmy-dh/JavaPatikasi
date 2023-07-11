package Java101.Hafta1;
import java.util.Scanner;
public class SayiSiralama {
    public static void main(String[] args) {
        //Değişkenler ve Scanner oluşturuldu.
        int a, b, c;
        Scanner input=new Scanner(System.in);
        System.out.print("1.sayı: ");
        a=input.nextInt();
        System.out.print("2. sayı: ");
        b=input.nextInt();
        System.out.print("3. sayı: ");
        c=input.nextInt();
        //Alınan sayı değerleri küçükten büyüğe doğru sıralandı.
        if ((a<b)&&(a<c)) {
            if (b<c) {
                System.out.print("a<b<c");
            }else{
                System.out.print("a<c<b");
            }
        } else if ((b<a)&&(b<c)) {
            if (a<c) {
                System.out.print(("b<a<c"));
            }else{
                System.out.print("b<c<a");
            }
        }else{
            if (a<b) {
                System.out.print("c<a<b");
            }else{
                System.out.print("c<b<a");
            }
        }

    }
}
