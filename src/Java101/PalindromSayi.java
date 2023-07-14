package Java101;

public class PalindromSayi {
    static boolean isPalindrom(int number){
        int temp=number,reverseNumber=0,lastNumber;
        while (temp!=0){
            lastNumber=temp%10;
            reverseNumber=(reverseNumber*10)+lastNumber;
            temp/=10;
        }if(reverseNumber==number){
            return true;
        }else {
            return false;
        }
    }
    //Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
    public static void main(String[] args) {
        System.out.println(isPalindrom(101));

    }
}
