import java.util.Scanner;
import java.lang.Math;

public class RockPaperScissors{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int playerThrow;
        int computerThrow;
        
        do{
            System.out.print("Enter your throw (1 = rock, 2 = paper, 3 = scissors): ");
            playerThrow = scan.nextInt();
        }while(playerThrow <=0 || playerThrow >=4);
        
        switch(playerThrow){
            case 1: 
                System.out.println("Player throws ROCK");
                break;
            case 2: 
                System.out.println("Player throws PAPER");
                break;
            case 3: 
                System.out.println("Player throws SCISSORS");
                break;
        }
        
        computerThrow = (int)((3)*Math.random() +1);
        
        switch(computerThrow){
            case 1: 
                System.out.println("Computer throws ROCK");
                break;
            case 2: 
                System.out.println("Computer throws PAPER");
                break;
            case 3: 
                System.out.println("Computer throws SCISSORS");
                break;
        }
        
        if (computerThrow == playerThrow){
            System.out.println("It's a tie!");
        }
        else if ((playerThrow == 1 && computerThrow == 3) || (playerThrow == 2 && computerThrow == 1) || (playerThrow == 3 && computerThrow == 2)){
            System.out.println("Player wins!");
        }
        else{
            System.out.println("Computer wins!");
        }
    }
}