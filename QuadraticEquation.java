import java.util.Scanner;
import java.lang.Math;

public class QuadraticEquation{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        double a, b, c;
        double ans1, ans2;
        
        System.out.print("Enter a value for a: ");
        a = scan.nextDouble();
        System.out.print("Enter a value for b: ");
        b = scan.nextDouble();
        System.out.print("Enter a value for c: ");
        c = scan.nextDouble();
        
        ans1 = ((b*-1) + (Math.sqrt(Math.pow(b, 2) - 4*(a)*(c)))) / (2*(a));
        ans2 = ((b*-1) - (Math.sqrt(Math.pow(b, 2) - 4*(a)*(c)))) / (2*(a));
        
        System.out.format("The roots are %.1f and %.1f\n", ans1, ans2);
        
        scan.close();
    }
}