import java.util.ArrayList;

/**
 * Write a description of class Switch here.
 * 
 * @author (Shiven Gupta)
 */
public class Switch
{
    /**
     * switchTwo swutched the strings in an array list in pairs
     * @param names the names in the array list
     */
    public static ArrayList<String> switchTwo(ArrayList<String> names) {
        //Created string that holds string in array list
        String value = new String();
        //Switches the strings in pairs
        for(int i = 0; i < names.size(); i++) {
            if (i % 2 == 0) {
                value = names.get(i);
                names.set(i, names.get(i+1));
                names.set(i + 1, names.get(i));
            }
            else {
             names.set(i, value);
            }
        }
        //Returns the array list
        return names;
    }
}
