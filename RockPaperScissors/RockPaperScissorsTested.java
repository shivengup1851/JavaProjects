//Shiven Gupta
import java.util.Scanner;

public class RockPaperScissorsTested {
 public static void main(String[] args) {
    //Scanner which will allow for user input
    Scanner x = new Scanner(System.in);
    int i = 0;
  while(i < 1) {
      //Lets user input
    System.out.println("Please enter rock, paper, or scissors: ");
    String choice = x.nextLine();
        if (choice.equalsIgnoreCase("rock") || choice.equalsIgnoreCase("paper") || choice.equalsIgnoreCase("scissors")) {
        System.out.println(RockPaperScissors.playRPS(choice));
        }
        //If the user does not input a proper value
        else {
        System.out.println("Please enter rock, paper, or scissors!!!");

    }
    //Lets user pick if they want to play again
    System.out.print("Finished playing? If so please enter yes or no: ");
    String scan = x.nextLine();
        if (scan.equalsIgnoreCase("yes")){
        System.out.println("C YA!");
        i = 10;
        
    }
  }
        System.exit(0);
 }
}
