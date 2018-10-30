/**
   A Pair computes various mathematical computations with two numbers.
*/
public class Pair
{
    //Created instance variables
    private double firstNum;
    private double secondNum;
   /**
      Constructs a pair of numbers.
      @param aFirst the first value of the pair
      @param aSecond the second value of the pair
   */
   public Pair(double aFirst, double aSecond)
   {
      firstNum = aFirst;
      secondNum = aSecond;
   }

   /**
      Computes the sum of the values of this pair.
      @return the sum of the first and second values
   */
   public double getSum()
   {
      return firstNum + secondNum;
   }

   /**
      Computes the difference of the values of this pair.
      @return the difference of the first and second values
   */
   public double getDifference()
   {
      return firstNum - secondNum;
   }

   /**
      Computes the product of the values of this pair.
      @return the product of the first and second values
   */
   public double getProduct()
   {
      return firstNum * secondNum;
   }

   /**
      Computes the average of the values of this pair.
      @return the average of the first and second values
   */
   public double getAverage()
   {
      return (firstNum + secondNum)/2;
   }

   /**
      Computes the distance (absolute value of the difference)
         of the values of this pair.
      @return the distance of the first and second values
   */
   public double getDistance()
   {
      return Math.abs(firstNum - secondNum);
   }

   /**
      Computes the maximum of the values of this pair.
      @return the maximum of the first and second values
   */
   public double getMaximum()
   {
      return Math.max(firstNum , secondNum);
   }

   /**
      Computes the minimum of the values of this pair.
      @return the minimum of the first and second values
   */
   public double getMinimum()
   {
      return Math.min(firstNum, secondNum);
   }
}