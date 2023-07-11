package Java101;
import java.util.Scanner;
public class  DortVeBesinKuvvetleri {
    public static void main(String[] args) {
        // Girilen sayıya kadar olan 4 ve 5'in kuvvetlerini bulma.
        int n;
        Scanner input=new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz: ");
        n=input.nextInt();
        System.out.println("Sınır sayısına kadar olan 4'ün katları: ");
        for(int i=1;i<=n;i*=4){
            System.out.println(i);
        }
        System.out.println("---------------------------------");
        System.out.println("Sınır sayısına kadar olan 5'in katları: ");
        for(int j=1;j<=n;j*=5){
            System.out.println(j);
        }

    }
}
