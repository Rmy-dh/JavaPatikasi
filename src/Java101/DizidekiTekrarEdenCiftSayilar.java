package Java101;
import java.util.Arrays;
public class DizidekiTekrarEdenCiftSayilar {
    //isFind() sayımı duplicated içine 2 defa yazmamı önlemek için değer dönderir.
    static boolean isFind(int[] arr,int value){
        for(int i:arr){
            if(i==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list={2,4,9,9,11,0,2,3,7,0,4};
        int[] duplicatedEven=new int[list.length];
        int number=0;
        //DumplicatedEven arrayi'nin default değişkeninin 1 olması için.Eğer tekrar eden sayım 0 ise onu kaybetmem.
        Arrays.fill(duplicatedEven,1);
        for(int i=0;i<list.length;i++){
            for (int j=0;j<list.length;j++){
                 //Tekrar etmiş ve çift olan sayıları almak için koşul.
                if((i!=j)&&(list[i]==list[j])&&(list[i]%2==0)){

                    if (!(isFind(duplicatedEven,list[i]))){

                        duplicatedEven[number++]=list[i];
                    }
                    break;
                }
            }
        }
        //Eğer sayım 1'den farklı ise ekrana basar.
        for (int j:duplicatedEven){
            if(j!=1){
                System.out.println(j);
            }
        }
    }
}
