package LastValueOfArray;

import java.util.Arrays;

public class LastValueOfArray {
    public static void main(String[] args) {
        int[] list={1,2,6,8,3,7,5};
        int answer=0;
        for(int i=list.length-1;i>=0;i--){
            Arrays.sort(list);
            if((i>1)&&list[i]==1 && list[i-1]==1){
                break;
            }
            if(i==0 ){
                answer=list[i];
            }else if(list[i]==list[i-1]){
                list[i]=Integer.MAX_VALUE;
                list[i-1]=Integer.MAX_VALUE;
            }else{
                list[i-1]=list[i]-list[i-1];
                list[i]=Integer.MAX_VALUE;
            }
            System.out.println("liste->"+Arrays.toString(list));
            System.out.println("answer->"+answer);

        }
        System.out.println(answer);
    }
}
