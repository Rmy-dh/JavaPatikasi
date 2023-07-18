package Java101;
import java.util.Arrays;
public class DizidekiElemanlarinFrekansi {

    public static void main(String[] args) {
        int[] list={1,2,3,9,5,4,2,9,1,1,3};
        System.out.println("Dizisi: "+Arrays.toString(list));
        Arrays.sort(list);
        System.out.println("Tekrar Sayıları: ");
        int count=1;
        for(int i=0;i<list.length;i++){
            if(i==0){
                for(int j=0;j<list.length;j++){
                    if((i!=j) &&(list[i]==list[j])){
                        count+=1;
                    }
                }
                System.out.println(list[i]+" Sayısı "+count+" kere tekrar edildi.");
            }else if(list[i]!=list[i-1]){
                for(int k=0;k<list.length;k++){
                    if((k!=i) &&(list[k]==list[i])){
                        count+=1;
                    }
                }
                System.out.println(list[i]+" Sayısı "+count+" kere tekrar edildi.");

            }
            count=1;
        }
    }
}



