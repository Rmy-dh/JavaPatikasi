package MayinTarlasiOyunu;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class OyunArkaPlani {    //Bu oyunda "*" karakteri mayını , "-" karakteri ise gezilebilecek alanı verir.
    String[][] map;
    String[][] bos;
    boolean condition , result = false ,check=true;
    int count;
    int a;

    OyunArkaPlani(String[][] map) {
        this.map = map;
    }
    void enter() {
        int row = map.length;
        int col = map[0].length;  //Temel bigiler kaç mayın olacağı.
        int mayin = row * col / 4;
        int n, y;

        Random rand = new Random();
        for (String[] k : map) {
            Arrays.fill(k, "-");     //to fill "-" multidimensional array.

        }
        bos = new String[row][col];
        for (String[] m : bos) {             //bos Array oluşturma "-" karakter ile.
            Arrays.fill(m, "-");
        }
        for (int i = 0; i < mayin; i++) {
            n = rand.nextInt(row);
            y = rand.nextInt(col);            //mayın döşeme.
            map[n][y] = "*";
        }
        print(map);
        run(map, bos,mayin);
    }
    void run(String[][] arr1, String[][] bos,int may) {
        int r, c;
        Scanner input = new Scanner(System.in);
        condition=true;
        a=(arr1.length*arr1[0].length)-may;

        while (a>0 && condition){
            System.out.print("Satır giriniz: ");
            r = input.nextInt();
            System.out.print("Sütun giriniz: ");
            c = input.nextInt();
            if (r > arr1.length || r < 0) {
                System.out.println("Geçersiz veri girdiniz.Lütfen tekrar deneyiniz. ");
                System.out.print("Satır giriniz: ");
                r = input.nextInt();
            }
            if (c > arr1[0].length || c < 0) {
                System.out.println("Geçersiz veri girdiniz.Lütfen tekrar deneyiniz. ");
                System.out.print("Sütun giriniz: ");
                c = input.nextInt();
            }
            isBomb(arr1, bos, r, c);
            a-=1;
        }
        if (check){
            result=true; //Döngü çıkışı eğer bombaya denk gelmediyse  oyunu kazanmıştır.
            isWin();
        }


    }
    void isBomb(String[][] arr3, String[][] bos1, int row, int col) {
        count=0;
        if (arr3[row][col].equals("*")) {
            result=false;                        //bombaya denk gelmiş ise isWin' e yönlendir bitir.
            isWin();
        } else if(bos1[row][col].equals("-")) {

            if(row+1<arr3.length && arr3[row+1][col].equals("*")){
            count++;
            }
            if(row+1<arr3.length && col+1<arr3[0].length  && arr3[row+1][col+1].equals("*")){
                count++;
            }
            if(col+1<arr3[0].length && arr3[row][col+1].equals("*")){
                count++;
            }
            if(row-1>=0 && arr3[row-1][col].equals("*")){
                count++;
            }
            if(col-1>=0 && arr3[row][col-1].equals("*")){
                count++;
            }
            if(row-1>=0 && col-1>=0  && arr3[row-1][col-1].equals("*")){
                count++;
            }
            if(row-1>=0 && col+1<arr3[0].length  && arr3[row-1][col+1].equals("*")){
                count++;
            }
            if(row+1<arr3.length && col-1>=0  && arr3[row+1][col-1].equals("*")){
                count++;
            }
            number(count,bos1,row,col);
            print(bos1);
        }
}
    void  number(int n,String[][] bos2,int r,int c){
        if(n==0){
            bos2[r][c]="0";
        }else if(n==1){
            bos2[r][c]="1";
        }else if(n==2){
            bos2[r][c]="2";
        }else if(n==3){
            bos2[r][c]="3";
        }else{
            bos2[r][c]="4";
        }
    }
    void isWin(){
        if (result) {
            System.out.println("Oyunu Kazandınız.");
            condition=false;
            print(map);

        } else {
            System.out.println("Game Over!");
            condition=false;
            check=false;
        }
    }
    void print(String[][] arr2){
        System.out.println("======================");
        for (String[] i:arr2){
            for (String j:i){
                System.out.print(j+" ");                      //ekrana çıktı verme.
            }
            System.out.println();
        }
    }
}
