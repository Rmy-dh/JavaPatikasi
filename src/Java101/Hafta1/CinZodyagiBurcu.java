package Java101.Hafta1;
import java.util.Scanner;
public class CinZodyagiBurcu {
    public static void main(String[] args) {
        int year, kalan;
        String animal="";
        boolean isError=false;
        Scanner input=new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz: ");
        year=input.nextInt();
        kalan=year%12; //Çin zodyağı burç hesabı.
        if (kalan==0) {
            animal="Maymun";
        } else if (kalan==1) {
            animal="Horoz";
        } else if (kalan==2) {
            animal="Köpek";
        } else if (kalan==3) {
            animal="Domuz";
        } else if (kalan==4) {
            animal="Fare";
        } else if (kalan==5) {
            animal="Öküz";
        } else if (kalan==6) {
            animal="Kaplan";
        } else if (kalan==7) {
            animal="Tavşan";
        } else if (kalan==8) {
            animal="Ejderha";
        } else if (kalan==9) {
            animal="Yılan";
        } else if (kalan==10) {
            animal="At";
        } else if (kalan==11) {
            animal="Koyun";
        } else {
            isError=true;
        }
        if (isError==true) {
            System.out.print("Hatalı veri girildi.");
        }else{
            System.out.print("Çin Zodyağı Burcunuz: "+animal);
        }
    }
}
