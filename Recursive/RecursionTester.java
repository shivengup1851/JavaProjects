/**
 * RecursionTester tests methods
 *
 * @author (Shiven Gupta)
 */
public class RecursionTester
{
    /**
     * Computes the sum of all of the digits in an integer recursively
     * @param num an integer
     * (Precondition: num >= 0)
     * @return the sum of the digits in an integer
     */
    public static int sumOfDigits(int num) {
        //throws exception if number is negative
        if(num < 0) 
            throw new IllegalArgumentException("The number must be positive");
        if(num / 10 == 0)
            return num;
        int add = num % 10;
        num = num / 10;
        return add + sumOfDigits(num);
    }
    
    /**
     * Exponentiates an integer
     * @param base the integer which is exponentiated
     * (Precondition: base >= 0)
     * @param exp the exponent
     * (Precondition: exp >= 0)
     * @return the integer exponentiated
     */
    public static int baseExp(int base, int exp) {
        //throws exception if numbers are negative
        if(base < 0 || exp < 0)
            throw new IllegalArgumentException("The numbers must be positive");
        if(exp == 0)
            return 1;
        return base * baseExp(base, exp - 1);
    }
    
    /**
     * Finds the minimum integer in an array
     * @param array an array of integers
     * @param arrayLength the length of the array
     * (Precondition: arrayLength > 0)
     * @return the minimum value of the array
     */
    public static int findMinimum(int[] array, int arrayLength) {
        if (arrayLength <= 1)
            return array[0];

        else {
            int x = findMinimum(array, arrayLength-1);
            return Math.min(x, array[arrayLength - 1]);
        }
    }
    
    /**
     * Finds how many times a single integer was used in a bigger integer
     * @param num a big integer
     * (Precondition: num > 0)
     * @param occur the small integer that is being looked for
     * (Precondition: occur > 0)
     * @return the amount that the smaller integer was used in the bigger integer
     */
    public static int cntDig(int num, int occur) {
        if (num == 0) {
                return 0;
        }
        else if(occur == num % 10) {
            return 1 + cntDig(num / 10, occur);
        }
        else 
            return cntDig(num / 10, occur);
    }
    
    /**
     * Splits a string into parts if letters are repeated consecutively
     * @param s the string
     * (Precondition: s.length() > 0)
     * @return the split string
     */
    public static String splitPair(String s) {
       if (s.length() < 2)
            return s;
       if  (s.charAt(0) == s.charAt(1)) {
            return s.charAt(0) + " " + splitPair(s.substring(1));
       }
       return s.charAt(0) + splitPair(s.substring(1));
      }
    /**
     * Finds how many times an integer is used in an array given a starting index
     * @param array the array
     * (Precondition: array.length >= 0)
     * @param num the number being searched for
     * (Precondition: num >= 0)
     * @param index the starting index of the array
     * (Precondition: index >= 0)
     * @return the number of times a number was repeated in an array
     */
    public static int findInt(int[] array, int num, int index) {
        if(index == array.length - 1) {
            if(array[index] == num)
                return 1;
            else
                return 0;
            }
        else {
            if(array[index] == num)
                return 1 + findInt(array, num, index + 1);
            else
                return findInt(array, num, index + 1);
            }
    }

    public static void main (String[] args) {
           System.out.println(sumOfDigits(123456789));
           System.out.println(baseExp(5,3));
           int[] numbers = {1,5,3,76,8,54};
           System.out.println(findMinimum(numbers, 6));
           System.out.println(cntDig(1209401,0));
           System.out.println(splitPair("webb"));
           int[] moreNumbers = {17, 2, 44, 17};
           System.out.println(findInt(moreNumbers, 17, 0));
    }
}