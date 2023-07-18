package Java101;
import java.util.Scanner;
import java.util.Arrays;
/*Bu programda kullanıcıdan alınan bir sayı değerinin verilen listede sayıya
   en yakın büyük ve küçük değerinin bulunması saglandı.
 */


public class GirilenSayiyaEnYakinMinMaxDegeri {
    public static void main(String[] args) {
        int[] list={15,12,788,1,-1,-788,2,0};
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int value=input.nextInt();
        //Yeni oluşturulan listenin sonuna verilen sayı eklendi.
        int[] list2=Arrays.copyOf(list,list.length+1);
        list2[(list.length)]=value;
        Arrays.sort(list2);
        int b=Arrays.binarySearch(list2,value);
        int min=list2[b-1];
        int max=list2[b+1];
        System.out.println("Dizi: "+Arrays.toString(list2));
        System.out.println("Girilen sayı: "+value);
        System.out.println("Girilen sayıdan küçük en yakın sayı: "+min);
        System.out.print("Girilen sayıdan büyük en yakın sayı: "+max);


    }
}
