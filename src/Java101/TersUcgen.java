package Java101;
import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        n=input.nextInt();
        for(int i=n;i>=0;i--){
            //Boşluk karakteri yapmak için for döngüsü
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //"*" karakteri basmak için for döngüsü
            for (int t=1;t<=(2*i-1);t++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
