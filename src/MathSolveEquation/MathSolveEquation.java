package MathSolveEquation;

import java.util.Scanner;

public class MathSolveEquation {
    public static void solveSample(String mathFormula){
        int locationOfX=0;
        boolean condition=true;
        String[] list=mathFormula.split(" ");

        for(int i=0;i<list.length;i++){
            try{
                Integer.parseInt(list[i]);               // Find the x location
            }catch(Exception e){
                if(list[i].equals("x")){
                    locationOfX=i;
                }else if(list[i].contains("x")){
                    locationOfX=i;
                    condition=false;
                }
            }
        }
        if((list[2].equals("0")) && (list[1].equals("/"))){
            System.out.println("Wrong!");
        }else{
            System.out.println(checkXCondition(list,locationOfX,condition,getAnswer(list,locationOfX)));
        }


    }
    public static int getAnswer(String[] list,int locationOfX) {
        int answer = 0;
        //Select operation and solve answer
        switch (list[1]) {
            case "+":
                if (locationOfX == 0) {
                    answer = Integer.parseInt(list[4]) - Integer.parseInt(list[2]);
                } else if (locationOfX == 2) {
                    answer = Integer.parseInt(list[4]) - Integer.parseInt(list[0]);
                } else if (locationOfX == 4) {
                    answer = Integer.parseInt(list[0]) + Integer.parseInt(list[2]);
                }
                break;
            case "-":
                if (locationOfX == 0) {
                    answer = Integer.parseInt(list[4]) + Integer.parseInt(list[2]);
                } else if (locationOfX == 2) {
                    answer = Integer.parseInt(list[0]) - Integer.parseInt(list[4]);
                } else if (locationOfX == 4) {
                    answer = Integer.parseInt(list[0]) - Integer.parseInt(list[2]);
                }
                break;
            case "*":
                if (locationOfX == 0) {
                    answer = Integer.parseInt(list[4]) / Integer.parseInt(list[2]);
                } else if (locationOfX == 2) {
                    answer = Integer.parseInt(list[4]) / Integer.parseInt(list[0]);
                } else if (locationOfX == 4) {
                    answer = Integer.parseInt(list[0]) * Integer.parseInt(list[2]);
                }
                break;
            case "/":
                if (locationOfX == 0) {
                    answer = Integer.parseInt(list[4]) * Integer.parseInt(list[2]);
                } else if (locationOfX == 2) {
                    answer = Integer.parseInt(list[0]) / Integer.parseInt(list[4]);
                } else if (locationOfX == 4) {
                    answer = Integer.parseInt(list[0]) / Integer.parseInt(list[2]);
                }
                break;
        }
        return answer;
    }
    public static int checkXCondition(String[] list,int locationOfX,boolean condition,int answer){
        //Check x condition (x, 1x, 10x)
        if(!condition){
            list[locationOfX]=list[locationOfX].replace("x","0");

            return answer-Integer.parseInt(list[locationOfX]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sample=input.nextLine();
        solveSample(sample);                               //math equation is taken

    }
}
