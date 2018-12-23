import java.util.Scanner;
import java.text.NumberFormat;

public class Printing{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        int numCopies;
        int totalCost;
        
        System.out.print("Enter how many copies to be printed: ");
        numCopies = scan.nextInt();
        
        System.out.print("Price per copy is: ");
        
        if ((numCopies >= 0) && (numCopies <= 99)){
            System.out.format("%s\n", money.format(.30) );
            System.out.format("The total cost is: %s\n", money.format(numCopies*.30));
        } 
        else if ((numCopies >= 100) && (numCopies <=499)){
            System.out.format("%s\n", money.format(.28));
            System.out.format("The total cost is: %s\n", money.format(numCopies*.28));
        }
        else if ((numCopies >= 500) && (numCopies <= 749)){
            System.out.format("%s\n", money.format(.27));
            System.out.format("The total cost is: %s\n", money.format(numCopies*.27));
        }
        else if ((numCopies >= 750) && (numCopies <= 1000)){
            System.out.format("%s\n", money.format(.26));
            System.out.format("The total cost is: %s\n", money.format(numCopies*.26));
        }
        else if (numCopies >= 1001){
            System.out.format("%s\n", money.format(.25));
            System.out.format("The total cost is: %s\n", money.format(numCopies*.25));
        } 
        scan.close();
    }
}