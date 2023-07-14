package Java101;
import java.util.Scanner;
public class AsalSayiRecursive {
    static void isPrime(int a,int b){
        if(a==b){
            System.out.println(a+" sayısı ASALDIR!");
        }else if(a%b==0){
            System.out.println(a+" sayısı ASAL değildir!");
        }else{
                isPrime(a,++b);
            }
        }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;
        System.out.print("Sayı giriniz: ");
        number=input.nextInt();
        isPrime(number,2);
    }
}
