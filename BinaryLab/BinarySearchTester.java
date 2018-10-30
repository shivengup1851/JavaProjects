import java.util.Arrays;
/**
 * BinarySearchTester tests BinarySearcher
 * 
 * @author (Shiven Gupta)
 */
public class BinarySearchTester
{
    public static void main (String[] args) {
        int[] array1 = {2, 6, 4, 5, 7, 8, 9, 11, 1, 10};
        
        SelectionSorter x = new SelectionSorter(array1);
        x.sort();
        System.out.println(Arrays.toString(array1));
        
        BinarySearcher y = new BinarySearcher(array1);
        System.out.println("\nSearch for 3 returns " + y.search(3));
        System.out.println("Search for 13 returns " + y.search(13));
        
        
        
    }
}
