package Java101;
import java.util.Scanner;
public class EtkinlikOnerme {
    public static void main(String[] args) {
        int heat;
        Scanner input=new Scanner(System.in);
        System.out.print("Sıcaklık değerini giriniz: ");
        heat=input.nextInt();
        //Girilen sıcaklık değerine bağlı olarak aktivite önerme.
        if (heat < 5) {
            System.out.print("Kayak yapabiirsin.");
        } else if (10>heat && heat>=5) {
            System.out.print("Sinemaya gidebilirsin.");
        } else if (15>heat && heat>=10) {
            System.out.print("Sinema veya pikniğe gidebilirsin.");
        } else if (heat>=15 && 25>heat) {
            System.out.print("Pikniğe gidebilirsin.");
        }else{
            System.out.print("Yüzmeye gidebilirsin.");
        }

    }
}
