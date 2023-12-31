package Java101;
public class PalindromikKelime {
    //First method
    static boolean isPalindrom(String str){
        String reverse="";
        for (int i=str.length()-1;i>=0;i--){
            reverse += str.charAt(i);
        }
        return str.equals(reverse);
    }
    //Second method
    static boolean isPalindrom2(String str){
        int i=0;
        int j=str.length()-1;
        while (i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false ;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str="abba";
        System.out.println(isPalindrom(str));


    }
}
