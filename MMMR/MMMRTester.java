import java.util.Arrays;
/**
 * MMMRTester tests the MMMR class
 * 
 * @author (Shiven Gupta)
 */
public class MMMRTester
{
    public static void main (String[] args) {
        int[] array1 = {2, 6, 4, 5, 7, 8, 9, 11, 1, 10};
        
        SelectionSorter x = new SelectionSorter(array1);
        x.sort();
        System.out.println(Arrays.toString(array1));
        
        MMMR y = new MMMR();
        System.out.println("\nMean: " + y.getMean());
        System.out.println("Median: " + y.getMedian());
        System.out.println("Mode: " + y.getMode());
        System.out.println("Range: " + y.getRange());
        
    }
}
