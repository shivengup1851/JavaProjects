
/**
 * LeftRightTester prints an array of random numbers and shifts values to the left and right
 * 
 * @author (Shiven Gupta) 
 * @version (a version number or a date)
 */
public class LeftRightTester
{
    public static void main(String[] args) {
        int[] a = new int[10];
        System.out.println("ORIGINAL ARRAY");
        for(int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*100);
            System.out.print(a[i] + " ");
        }
        int x = a[0];
        System.out.println("\nDATA SHIFTED LEFT");
        for(int i = 0; i < a.length - 1; i++) {
            a[i] = a[i + 1];
            System.out.print(a[i] + " ");
        }
        a[9] = x;
        System.out.print(a[9]);
        System.out.println("\nDATA SHIFTED RIGHT");
        for(int i = a.length - 1; i > 0; i++) {
            a[i] = a[i - 1];
            System.out.print(a[i] + " ");
        }
    }
}
