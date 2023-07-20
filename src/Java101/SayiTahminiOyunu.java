package Java101;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class SayiTahminiOyunu {
    public static void main(String[] args) {
        Random rand=new Random();
        int number=rand.nextInt(100);
        Scanner input=new Scanner(System.in);
        int select,right=0;
        boolean isWin=false,isWrong=false;
        int[] wrong=new int[5];
        System.out.println(number);
        while (right<5){
            System.out.print("Lütfen tahmininizi giriniz: ");
            select=input.nextInt();
            if((select<0)||(select>100)){
                System.out.println("Lütfen 0-100 arasında bir değer giriniz!");
                if(isWrong){
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız."+"Kalan hakkınız: "+(5-right));
                }else{
                    isWrong=true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }
            if(select==number){
                System.out.println("Tebrikler dogru tahmin! Tahmin ettiginiz sayı: "+ number);
                isWin=true;
                break;
            }else{
                System.out.println("Hatalı bir sayı girdiniz.");
                if(select>number){
                    System.out.println(select+" sayısı gizli sayıdan büyüktür.");
                }else {
                    System.out.println(select+" sayısı gizli sayıdan küçüktür.");
                }
                wrong[right++]=select;
                System.out.println("Kalan hakkınız: "+(5-right));
            }
        }
        if(!isWin){
            System.out.println("Kaybettiniz.");
            if(!isWrong){
                System.out.print("Tahminleriniz: "+Arrays.toString(wrong));
            }
        }




    }
}
