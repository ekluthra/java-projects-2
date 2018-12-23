import java.util.Scanner;

public class Eggs{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int numEggs;
        int eggDozens;
        int remainderEggs;
        double totalCost = 0;
        
        System.out.print("Enter the number of eggs purchased: ");
        numEggs = scan.nextInt();
        eggDozens = numEggs/12;
        remainderEggs = numEggs%12;
        
        if ((eggDozens >= 0) && (eggDozens <4)){
            totalCost = (eggDozens*.50) + (remainderEggs*.50/12);
        }
        else if ((eggDozens >= 4) && (eggDozens < 6)){
            totalCost = (eggDozens*.45) + (remainderEggs*.45/12);
        }
        else if ((eggDozens >= 6) && (eggDozens < 11)){
            totalCost = (eggDozens*.40) + (remainderEggs*.40/12);
        }
        else if (eggDozens >= 11){
            totalCost = (eggDozens*.35) + (remainderEggs*.35/12);
        }
        //by writing %.2f, im using a placeholder for a float that truncates after the second decimal place
        System.out.format("The bill is equal to: $%.2f\n", totalCost);
        scan.close();
    }
}