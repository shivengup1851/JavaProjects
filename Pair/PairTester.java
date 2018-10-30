import java.util.Scanner;
public class PairTester {
    public static void main(String[] args) {
        
        //Created scanner in order to type numbers
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        double first = in.nextDouble();
        double second = in.nextDouble();
        Pair x = new Pair(first, second);
        
        
        //Called methods and printed different operations
        System.out.println("Sum: " + x.getSum());
        System.out.println("Difference: " + x.getDifference());
        System.out.println("Product: " + x.getProduct());
        System.out.println("Average: " + x.getAverage());
        System.out.println("Distance: " + x.getDistance());
        System.out.println("Maximum: " + x.getMaximum());
        System.out.println("Minimum: " + x.getMinimum());
    }
}
    
        