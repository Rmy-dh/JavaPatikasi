package Java101;
import java.util.Scanner;
public class MinMaxValue {
    public static void main(String[] args) {
        //Kullanıcının istediği sayıda sayıyı kullanıcıdan  alıp bu sayıların en büyüğü ve en küçüğünü ekrana yazdırma.
        int n,number,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        Scanner input=new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        n=input.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i+". Sayıyı giriniz: ");
            number=input.nextInt();
            if(max<=number){
                max=number;
            }
            if(min>=number){
                min=number;
            }
        }
        System.out.println("En büyük sayı: "+max);
        System.out.println("En küçük sayı: "+min);
    }
}
