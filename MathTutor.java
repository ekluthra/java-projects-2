import java.util.Scanner;
import java.util.Random;

public class MathTutor{
    public static void main(String[] args){
        
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        
        int randNum1 = rand.nextInt(10)+1;
        int randNum2 = rand.nextInt(10)+1;
        int randOperator = rand.nextInt(4)+1;
        //see, eclipse compiler 4.5 is stupid and counts it as an error when you initialize a variable in a loop or if statement instead of outside of one
        //so I have to give them default values at the beginning so it doesn't freak out 
        int answer=0;
        int userAnswer=0;
        //I'm using a do while loop here instead of a while loop here because I want the loop to run at least once, especially since answer and userAnswer are both 0 at the beginning
        do{
            switch(randOperator){
                case 1:
                    System.out.format("What's %d x %d?\n", randNum1, randNum2);
                    userAnswer = scan.nextInt();
                    answer = randNum1 * randNum2;
                    break;
                case 2: 
                    System.out.format("What's %d + %d?\n", randNum1, randNum2);
                    userAnswer = scan.nextInt();
                    answer = randNum1 + randNum2;
                    break;
                case 3: 
                    System.out.format("What's %d - %d?\n", randNum1, randNum2);
                    userAnswer = scan.nextInt();
                    answer = randNum1 - randNum2;
                    break;
                case 4:
                    System.out.format("What's %d / %d?\n", randNum1 ,randNum2);
                    userAnswer = scan.nextInt();
                    answer = randNum1 / randNum2;
                    break;
            }
        }while(userAnswer != answer);
        
        System.out.println("Correct!");
        
        scan.close();
    }
}