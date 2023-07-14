package Java101;
import java.util.Scanner;
public class DeseneGoreMetotOlusturma {
    /*number değişkenim eğer 0'dan büyük
     ise sayıyı ekrana yazdırıp 5 azaltarak kendi içinde döner.
     Sayım 0'dan küçük olduğunda dsn adlı metot ile 5 artırmaya yönlendirilir.*/
    static void desen (int number,int temp){
        if(number>0){
            System.out.print(number+" ");
            desen((number-5),temp);
        }else{
            dsn(number,temp);
        }
    }
    static int dsn(int a,int b){
        if(b>a){
            System.out.print(a+" ");
            dsn(a+5,b);
        }
        //N değişkenim temp  değerine geldiğinde metotdan çık.
        if(b==a){
            System.out.print(a+" ");
            return 0;
        }
        return 0;
    }
    public static void main(String[] args) {
        int n,temp;
        Scanner input=new Scanner(System.in);
        System.out.print("N Sayısı: ");
        n=input.nextInt();
        temp=n;
        System.out.print("Çıktısı: ");
        desen(n,temp);


    }
}
