//Shiven Gupta
public class BugTester {
    public static void main (String[] args) {
        //Creates object variable
        Bug x = new Bug(4);
        
        //Prints the initial position of the bug
        System.out.println("Initial position = " + x.getPosition());
        
        //Changes the bug's direction
        x.turn();
        
        //Bug moves by 1 unit
        x.move();
        
        //Prints expected and new position
        System.out.println("Expected new position = 3");
        System.out.println("New position = " + x.getPosition());
        
        //Changes direction and moves bug's position by 4 units
        x.turn();
        
        x.move();
        
        x.move();
        
        x.move();
        
        x.move();
        
        //Prints expected and new position
        System.out.println("Expected new position = 7");
        System.out.println("New position = " + x.getPosition());
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
