import java.util.Scanner;
import java.util.Random;

public class GuessingGame{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        
        int randNum = rand.nextInt(20)+1;
        //have to initialize variable guess because eclipse compiler freaks out if i don't
        int guess = 0;
        
        do{
            System.out.print("Enter a number between 1 and 20: ");
            guess = scan.nextInt();
            if (guess > randNum){
                System.out.println("Too high");
            }
            else if(guess < randNum){
                System.out.println("Too low");
            }
        }while(guess != randNum);
        
        System.out.println("You got it!");
        
        scan.close();
        
    }
}