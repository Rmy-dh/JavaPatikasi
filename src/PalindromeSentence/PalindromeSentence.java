package PalindromeSentence;

import java.util.Scanner;

public class PalindromeSentence {
    public static boolean isPalindrome(String sentence){
        String newStr="";
        String reverseStr="";
        sentence=sentence.toLowerCase();
        String[] list =sentence.split(" ");


        for(int i=0;i<list.length;i++){
            if((list[i]).equals("-")){
                list[i]=null;
            }
        }
        for(String value:list){
            if(value != null && ((value.contains("!")) || (value.equals("."))
                    ||(value.equals("?"))
                    || (value.equals(",")))){
                int locationOfCharacter=(value.length())-1;
                value=value.substring(0,locationOfCharacter);
                newStr +=value+" ";
            }else if(value != null){
                newStr +=value+" ";
            }
        }
        for(int i=(newStr.length()-2);i>=0;i--){
            reverseStr+=newStr.charAt(i);
        }
        reverseStr=reverseStr.trim();
        newStr=newStr.trim();


        return newStr.equals(reverseStr);
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter your sentence: ");
        String sentence=input.nextLine();
        System.out.print(isPalindrome(sentence));
    }
}
