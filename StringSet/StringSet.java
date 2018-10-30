/**
   This class finds the smallest, middle, and largest of 
   three strings.
   @author Shiven Gupta
*/
public class StringSet
{
   //Created instance variables
   private String firstString;
   private String secondString;
   private String thirdString;
   /**
      Constructs a string set that processes three strings.
      @param str1 the first string to sort
      @param str2 the second string to sort
      @param str3 the third string to sort
   */
   public StringSet(String str1, String str2, String str3)
   {
      firstString = str1;
      secondString = str2;
      thirdString = str3;
   }

   /**
      Gets the smallest string in the string set.
      @return smallest the smallest of three strings
   */
   public String getSmallest()
   {
     if (firstString.compareTo(secondString) < 0 && firstString.compareTo(thirdString) < 0)
         return firstString;
     else if (secondString.compareTo(firstString) < 0 && secondString.compareTo(thirdString) < 0)
         return secondString;
     else if (thirdString.compareTo(firstString) < 0 && thirdString.compareTo(secondString) < 0)
         return thirdString;
     if (firstString.compareTo(secondString) == 0 || firstString.compareTo(thirdString) == 0)
        return firstString;
     if (secondString.compareTo(firstString) == 0 || secondString.compareTo(thirdString) == 0)
        return secondString;
     if (thirdString.compareTo(firstString) == 0 || thirdString.compareTo(secondString) == 0)
        return thirdString;
     return null;
   }

   /**
      Gets the largest string in the string set.
      @return largest the largest of three strings
   */
   public String getLargest()
   {
      if (firstString.compareTo(secondString) > 0 && firstString.compareTo(thirdString) > 0)
         return firstString;
     else if (secondString.compareTo(firstString) > 0 && secondString.compareTo(thirdString) > 0)
         return secondString;
     else if (thirdString.compareTo(firstString) > 0 && thirdString.compareTo(secondString) > 0)
         return thirdString;
     if (firstString.compareTo(secondString) == 0 || firstString.compareTo(thirdString) == 0)
        return firstString;
     if (secondString.compareTo(firstString) == 0 || secondString.compareTo(thirdString) == 0)
        return secondString;
     if (thirdString.compareTo(firstString) == 0 || thirdString.compareTo(secondString) == 0)
        return thirdString;
     return null;
   }

   /**
      Gets the middle string in the string set.
      @return middle the middle string of three strings
   */
   public String getMiddle()
   {
      if (firstString.compareTo(secondString) > 0 && firstString.compareTo(thirdString) < 0 || firstString.compareTo(secondString) < 0 && firstString.compareTo(thirdString) > 0)
         return firstString;
     else if (secondString.compareTo(firstString) > 0 && secondString.compareTo(thirdString) < 0 || secondString.compareTo(firstString) < 0 && secondString.compareTo(thirdString) > 0)
         return secondString;
     else if (thirdString.compareTo(firstString) > 0 && thirdString.compareTo(secondString) < 0 || thirdString.compareTo(firstString) < 0 && thirdString.compareTo(secondString) > 0)
         return thirdString;
     if (firstString.compareTo(secondString) == 0 || firstString.compareTo(thirdString) == 0)
        return firstString;
     if (secondString.compareTo(firstString) == 0 || secondString.compareTo(thirdString) == 0)
        return secondString;
     if (thirdString.compareTo(firstString) == 0 || thirdString.compareTo(secondString) == 0)
        return thirdString;
     return null;
   }
}
