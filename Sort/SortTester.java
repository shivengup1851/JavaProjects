import java.util.Arrays;
/**
 * SortTester tests the Sort class
 * 
 * @author (Shiven Gupta)
 */
public class SortTester
{
    public static void main(String[] args) {
        int[] array = new int[] {9,1,4,2,5,6,7,73,2,82,3,4,45,94,3,3,3,3,4,3,2,1};
        Sort.shivenSort(array);
        System.out.println(Arrays.toString(array));
        
        
    }
}