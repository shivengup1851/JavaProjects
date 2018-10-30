//Shiven Gupta
/**
 * The Bug moves, turns, and returns the position of a bug.
 */
public class Bug {
    
    //Creates my instance variables
    private int unit;
    private int forward;
    
    /**
     * Initializes the instance variables
     * @param position the position of the bug
     */
    public Bug (int position) {
        //Moving forward by only 1 unit
        unit = position;
        forward = 1;
        
    }
    
    /**
     * Gets the position of the bug
     * @return unit of the bug's position
     */
    public int getPosition() {
        //Returns the unit of the bug's position
        return unit;
        
    }
    
    /**
     * Changes the direction of the bug's movement
     */
    public void turn() {
        //Changes the direction
        forward = -forward;
        
    }
    
    /**
     * Moves the bug's position forward
     */
    public void move() {
        //Bug moves forward by 1 unit
        unit = unit + forward;
    }
}
