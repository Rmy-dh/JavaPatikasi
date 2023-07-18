package Java101;
import java.util.Arrays;
public class HarmonikOrtalama {
    public static void main(String[] args) {
        int[] list={1,2,3,4,5};
        double sum=0.0;
        for(int i=0;i<list.length;i++){
            sum+=((double) 1/list[i]);

        }
        //Harmonic seri toplam formülü: 1+1/2+1/3+.....1/n
        //Harmonik ortalama formülü: eleman sayısı/harmonic toplam.
        double avarege=list.length/sum;
        System.out.println(Arrays.toString(list)+"\tlistesinin");
        System.out.println("Harmonic Ortalaması: "+avarege);
    }
}
