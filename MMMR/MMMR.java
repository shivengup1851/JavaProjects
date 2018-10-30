
/**
 * MMMR finds the mean, median, mode, and range of an array
 * 
 * @author (Shiven Gupta)
 */
public class MMMR
{
    public static int getMean(int[] array) {
        int x = 0;
        double mean = 0.0;
        for(int i = 0; i < array.length; i++) {
            x = x + array[i];
            mean = x / array.length;
        }        
        return mean;
    }
    
    public static int getMedian(int[] array) {
        if(array.length % 2 == 1)
            return array[array.length / 2];
        else
            return (array[(array.length - 1) / 2] + array[array.length / 2]) / 2;
    }
    
    public static int getMode(int[] array) {
        int cMax = 0;
        int mode = 0;
        for(int i = 0; i < array.length; i++) {
            int temp = array[i];
            int c = 1;
            for(int j = 0; j < array.length; j++) {
                if(array[j] == temp)
                    c++;
                if(c > cMax) {
                    cMax = c;
                    mode = temp;
                }
            }
        }
        return mode;
    }
    
    public static int getRange(int[] array) {
        return array[array.length - 1];
    }
}
