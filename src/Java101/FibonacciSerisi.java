package Java101;
import java.util.Scanner;
public class FibonacciSerisi {
    public static void main(String[] args) {
        int number,n1=0,n2=1,n3=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        number=input.nextInt();
        System.out.print(number+" elemanlı Fibonacci Serisi : ");
        for(int i=1;i<=number;i++){
            System.out.print(n3+" ");
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }
    }
}
