import java.util.Arrays;
/**
 * Write a description of class SortTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SortTester
{
    public static void main(String[] args) {
        String[] array1 = new String[] {"Advanced", "Placement", "Computer", "Science"};
        String[] array2 = new String[] {"Advanced", "Computer", "Placement", "Science"};
        String[] array3 = new String[] {"Advanced", "Placement", "Computer", "Science"};
        
        MergeSorter x = new MergeSorter(array1);
        InsertionSorter y = new InsertionSorter(array2);
        SelectionSorter z = new SelectionSorter(array3);

        x.sort();
        System.out.println(Arrays.toString(array1));
        y.sort();
        System.out.println(Arrays.toString(array2));
        z.sort();
        System.out.println(Arrays.toString(array3));
    }
   
}
