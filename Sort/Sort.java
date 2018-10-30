
/**
 * Sort sorts an array in ascending order
 * 
 * @author (Shiven Gupta)
 */
public class Sort
{
   public static int[] shivenSort(int[] values) {
       /* This algorithm checks whether a value at a certain index is greater than the value in the index after it.
        * If it is, then the values switch places in order to sort the array in ascending order. There are two for loops
        * so that each case is checked. This resembles the selection sort algorithm as this algorithm swaps values 
        * continuously until the array is in ascending order.
        */
        for(int i = 0; i < values.length; i++){
            for(int j = i + 1; j < values.length; j++){
            if(values[i] > values[j]){
                int x = values[i];
                values[i] = values[j];
                values[j] = x;
            }
        }
    }
    return values;
  }
}