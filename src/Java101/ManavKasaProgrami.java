package Java101;

import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        double ap=2.14, ep=3.67, dp=1.11, mp=0.95, pp=5.00;
        double ak, ek, dk, mk, pk, toplam;
        Scanner input=new Scanner(System.in);
        System.out.print("Kaç kg armut: ");
        ak=input.nextDouble();
        System.out.print("Kaç kg elma: ");
        ek=input.nextDouble();
        System.out.print("Kaç kg domates: ");
        dk=input.nextDouble();
        System.out.print("Kaç kg muz: ");
        mk=input.nextDouble();
        System.out.print("Kaç kg patlıcan: ");
        pk=input.nextDouble();
        toplam=(ak*ap)+(ek*ep)+(dk*dp)+(mk*mp)+(pk*pp);
        System.out.print("Toplam tutar: "+ toplam);


    }
}
