
/**
 * Write a description of class MultiDArray here.
 * 
 * @author (Shiven Gupta)
 */
public class MultiDArray
{
   private double[][] myMultiDArray;
   /**
    * MultiDArray initializes the 2D array object
    * @param array aids in initializing the 2D array object
    */
   public MultiDArray (double[][] array) {
       myMultiDArray = array;
    }
    /**
     * getAverage computes the average of values in a 2D array based on the bounds provided
     * @param startRow index of the rows of the 2D array
     * @param endRow of the rows of the 2D array
     * @param startColumn index of the columns of the 2D array
     * @param endColumn end of the columns of the 2D array
     */
   public double getAverage(int startRow, int endRow, int startColumn, int endColumn) {
         //Created a sum variable which holds sum of the 2D array values
         double sum = 0;
         //Creted count variable that increments
         int count = 0;
         //Computes the sum of the 2D array values
         for (int y = startRow; y <= endRow; y++){
            for (int x = startColumn; x <= endColumn; x++){
                sum += myMultiDArray[y][x];
                count++;
            }
         }
         //Returns the average of the 2D array values
         return sum / count;
    }
}
