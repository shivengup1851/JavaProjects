/**
   This class computes the average
   of a set of data values.
*/
public class DataSet
{
   /**
      Constructs an empty data set.
   */
   public DataSet()
   {
      final int DATA_LENGTH = 100;
      data = new double[DATA_LENGTH];
      dataSize = 0;
   }

   /**
      Adds a data value to the data set.
      @param x a data value
   */
   public void add(double x)
   {
      if (dataSize >= data.length)
      {  
         // make a new array of twice the size
         double[] newData = new double[2 * data.length];
         // copy over all elements from data to newData
         System.arraycopy(data, 0, newData, 0, data.length);
         // abandon the old array and store in data
         // a reference to the new array
         data = newData;
      }
      data[dataSize] = x;
      dataSize++;
   }

   /**
      Gets the average of the added data.
      @return avg the average of the data or 0 if no data has been added
   */
   public double averageScore()
   {
    //Returns 0 when the size of the data is 0
     if (dataSize == 0) {
         return 0;
    }
    //Computes the sum of the array values
     else {
        for(int i = 0; i < dataSize; i++) {
         sum = sum + data[i];
        }
        //Returns the average of the imputs
        return sum / (dataSize * 1.0);
    }
    
   }
   //Instance variables
   private double[] data;
   private int dataSize;
   private double sum = 0.0;
}

