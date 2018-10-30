
/**
 * Write a description of class MultiDArrayTester here.
 * 
 * @author (Shiven Guta)
 */
public class MultiDArrayTester
{
    public static void main (String[] args) {
        //Created new array with 8 rows and 6 columns
        double[][] myArray = new double[8][6];
        //Created new object
        MultiDArray x = new MultiDArray(myArray);
        //Created sum variable that holds the sum of the 2D array values
        double sum = 0;
        //Fills the array with random values and computes the sum
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
            myArray[i][j] = (Math.random()*100);
            sum += myArray[i][j];
            }
        }
        //Prints the expected and actual averages
        System.out.println("\nExpected Average: " + sum/48);
        System.out.println("Computed Average: " + x.getAverage(0,7,0,5));
        }
    }
