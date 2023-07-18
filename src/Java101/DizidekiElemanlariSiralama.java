package Java101;
import java.util.Scanner;
import java.util.Arrays;
public class DizidekiElemanlariSiralama {
    public static void main(String[] args) {
        int number;
        Scanner input=new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        number=input.nextInt();
        int[] list=new int[number];
        for (int i=0;i<number;i++){
            System.out.print((i+1)+".Elemani: ");
            list[i]=input.nextInt();
        }
        Arrays.sort(list);
        System.out.println("Sıralama: "+Arrays.toString(list));

    }
}
