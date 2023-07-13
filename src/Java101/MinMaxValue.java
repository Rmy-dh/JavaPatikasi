package Java101;
import java.util.Scanner;
public class MinMaxValue {
    public static void main(String[] args) {
        //Kullanıcının istediği sayıda kullanıcıdan sayı alıp bu sayıların en büyüğü ve en küçüğünü ekrana yazdırma.
        int n,number,max=1,min=1;
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
