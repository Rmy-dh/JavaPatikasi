package SwapCase;

import java.util.Scanner;

public class SwapCase {
    public static String swapCase(String sentence){
        char[] charOfSentence=sentence.toCharArray();
        sentence="";
        for(int i=0;i<charOfSentence.length;i++){
            char value=charOfSentence[i];
            if(Character.isUpperCase(value)){
                charOfSentence[i] = Character.toLowerCase(value);
            }else if(Character.isLowerCase(value)){
                charOfSentence[i] =Character.toUpperCase(value);
            }
        }
        for(char character:charOfSentence){
            sentence += character;
        }
        return sentence;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your sentence: ");
        String sentence=input.next();
        System.out.println(swapCase(sentence));

    }
}
