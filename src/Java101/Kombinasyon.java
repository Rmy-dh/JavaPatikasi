package Java101;
import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {
        int n,r,nf=1,rf=1,nrf=1;
        double kombinasyon;
        Scanner input=new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        n=input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        r=input.nextInt();
        //n!
        for(int i=1;i<=n;i++){
            nf*=i;
        }
        //r!
        for(int j=1;j<=r;j++){
            rf*=j;
        }
        //nrf! => (n-r)!
        for(int t=1;t<=n-r;t++){
            nrf*=t;
        }
        kombinasyon=nf/(rf*nrf);
        System.out.print(n+" ile "+r+" kombinasyonu sonucu: "+kombinasyon);
    }
}
