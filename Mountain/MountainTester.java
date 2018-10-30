
/**
 * Write a description of class MountainTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MountainTester
{
    public static void main (String[] args) {
        Mountain x = new Mountain();
        int[] a = {1, 2, 3, 4, 5, 6};
        System.out.print("Given array ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        
    }
    System.out.println("\nPeak Index: " + x.getPeakIndex(a));
    System.out.println("Mountain? " + x.isMountain(a));
}
}