package MayinTarlasiOyunu;
import java.util.Scanner;

public class MineSweeper {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Satır Giriniz: ");
        int row=input.nextInt();
        System.out.print("Sütun Giriniz: ");
        int col=input.nextInt();
        String[][] matris=new String[row][col];

        OyunArkaPlani oyun=new OyunArkaPlani(matris);
        oyun.enter();
    }
}
