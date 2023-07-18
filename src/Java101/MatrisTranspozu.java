package Java101;

public class MatrisTranspozu {
    public static void main(String[] args) {
        int[][] matris={{1,2,3},{4,5,6}};
        int [][] matrisTranspoz=new int[matris[0].length][matris.length];
        //Matris[İ][J] değerleri matrisTranspose[J][İ]'a olarak aktarımı.
        for(int i=0;i<matris.length;i++){
            for (int j=0;j<(matris[0].length);j++){
                matrisTranspoz[j][i]=matris[i][j];
            }
        }
        System.out.println("Matris:");
        for(int[] i:matris){
            for(int t:i){
                System.out.print(t+" ");
            }
            System.out.println();
        }
        System.out.println("Transpozu:");
        //Oluşan matristen değerleri okuma.
        for(int[] k :matrisTranspoz){
            for(int t :k){
                System.out.print(t+" ");
            }
            System.out.println();
        }

    }
}
