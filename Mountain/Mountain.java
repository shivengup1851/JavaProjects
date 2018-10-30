class Mountain {
    /** @param array an array of positive integer vales
     *  @param stop the last index to check;
     *  @return true if for each j such that 0 <= j < stop, array[j] < arrray[j+1]
     *           false otehrwise
     */
    public boolean isIncreasing(int[] array, int stop)
    {
        for(int j = 0; j < stop; j++)
        {
            if(array[j] >= array[j+1])
                return false;
                
        }
        return true;
    }
    
    /** @param array an array of positive integer vales
     *  @param start the first index to check;
     *  @return true if for each j such that start <= j < array.length - 1, array[j] < arrray[j+1]
     *           false otehrwise
     */
    
    public boolean isDecreasing(int [] array, int start)
    {
        for(int j = start; j < array.length-1; j++)
        {
            if(array[j] < array[j+1])
                return false;
                
        }
        return true;
    }
    
    public int getPeakIndex(int[] array)
    {
        int max = array[0];
        int store = 0;
        for(int i = 0; i <= array.length-1; i++) {
            if (max >= array[i]) {
                max = array[i];
                store = i;
              }
          }
        if (max == array[array.length - 1])
            return -1;
            else 
            return store;
         
    }
    
    public boolean isMountain(int[] array)
    {
        
        if (this.getPeakIndex(array) == - 1)
           return false;
        if (this.isIncreasing(array, this.getPeakIndex(array)))
            if(this.isDecreasing(array, this.getPeakIndex(array)))
                return true;
                return false;
    }
    
}