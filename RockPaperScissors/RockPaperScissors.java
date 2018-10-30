/**
 * RockPaperScissors is a game of rock, paper, scissors with a computer
 * @author Shiven Gupta
 */
public class RockPaperScissors {
    /**
     * Returns computer choice based on the input
     * @param pChoice the player's choice
     */
    public static String playRPS (String pChoice) {
        int cChoice = (int)(Math.random() * 3);
        //Runs through options if player choice is rock
        if (pChoice.equalsIgnoreCase("rock")) {
            switch (cChoice) {
                //Different return statements based on player input
                case 0: return ("Computer selcect: Rock\n\nIt's a tie");
                case 1: return ("Computer selcect: Paper\n\nYou win");
                case 2: return ("Computer selcect: Scissors\n\nComputer wins");
            }
        }
        //Runs through options if player choice is paper
        else if (pChoice.equalsIgnoreCase("paper")) {
            switch (cChoice) {
                //Different return statements based on player input
                case 0: return ("Computer selcect: Rock\n\nComputer Wins");
                case 1: return ("Computer selcect: Paper\n\nIt's a tie");
                case 2: return ("Computer selcect: Scissors\n\nYou win");
            }
        }
        //Runs through options if player choice is scissors
        else if (pChoice.equalsIgnoreCase("scissors")) {
            switch (cChoice) {
                //Different return statements based on player input
                case 0: return ("Computer selcect: Rock\n\nYou win");
                case 1: return ("Computer selcect: Paper\n\nComputer wins");
                case 2: return ("Computer selcect: Scissors\n\nIt's a tie");
            }
        }
        
            return "Enter a proper choice";
    }
    
}