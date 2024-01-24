package DistinctCharacterSentence;

import java.util.Scanner;

public class DistinctCharacterSentence {
    static boolean checkCondition(String newSentence,char character){
        for(int i=0;i<newSentence.length();i++){
            if(newSentence.charAt(i)==character){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String newSentence="";
        Scanner input =new Scanner(System.in);
        System.out.print("Enter your sentence: ");
        String sentence=input.nextLine();
        sentence=sentence.toLowerCase();

       for(int i=0;i<sentence.length();i++){
           for(int j=i;j<sentence.length();j++){
               if(sentence.charAt(i)==sentence.charAt(j)){
                   if (checkCondition(newSentence,sentence.charAt(i))){
                       // if newSentence does not have the character ,the character is added to newSentence
                       newSentence+=sentence.charAt(i);
                   }
               }
           }
       }
        System.out.println("Answer: "+newSentence);
    }
}
