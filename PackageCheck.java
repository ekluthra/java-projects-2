import java.util.Scanner;

public class PackageCheck{
    public static void main (String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        double weight;
        double length, width, height;
        double volume;
        
        System.out.print("Enter package weight in Kg: ");
        weight = scan.nextDouble();
        System.out.print("Enter the length in cm: ");
        length = scan.nextDouble();
        System.out.print("Enter the width in cm: ");
        width = scan.nextDouble();
        System.out.print("Enter the height in cm: ");
        height = scan.nextDouble();
        
        volume = (length * width * height);
        
        if((volume > 100000) && (weight > 27)){
            System.out.println("Too heavy\nToo large");
        }
        else if ((volume > 100000) && (weight <= 27)){
            System.out.println("Too large");
        }
        else if ((volume <= 100000) && (weight > 27)){
            System.out.println("Too heavy");
        }
        scan.close();
    }
}