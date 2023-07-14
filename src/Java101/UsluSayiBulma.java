package Java101;
import java.util.Scanner;
public class UsluSayiBulma {
    //Taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive"ile gerçekleştirme.
    static int power(){
        Scanner input=new Scanner(System.in);
        String select;
        int n1,n2;
        int result=1;
        System.out.print("Çıkış yapmak için Y,devam etmek için N girin: ");
        select=input.nextLine();
        if(select.equals("Y")){
            return 0;
        }
        System.out.print("Taban değerini giriniz: ");
        n1=input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        n2=input.nextInt();
        for(int i=1;i<=n2;i++){
            result*=n1;
        }
        System.out.println("Sonuç: "+result);

        return power();
    }

    public static void main(String[] args) {
        power();

    }
}
