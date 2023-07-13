package Java101;
import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n1,n2,ebob=1,ekok=1;
        int i=1,j=1,k=1;
        System.out.print("n1 sayısını giriniz: ");
        n1=input.nextInt();
        System.out.print("n2 sayısını giriniz: ");
        n2=input.nextInt();
        // EBOB
        if(n2>n1){
            while (i<=n1){
                if(n1%i==0 && n2%i==0){
                    ebob=i;
                }
                i++;
            }

        }else{
            while(j<=n2){
                if(n1%j==0 && n2%j==0){
                    ebob=j;
                }
                j++;
            }
        }
        //EKOK
        while (k<=(n1*n2)){
            if(k%n1==0 && k%n2==0){
                ekok=k;
                break;
            }
            k++;
        }
        System.out.println(n1+" ile "+n2+" sayılarının Ebob'u = "+ebob);
        System.out.println(n1+" ile "+n2+" sayılarının Ekok'u = "+ekok);


    }
}
