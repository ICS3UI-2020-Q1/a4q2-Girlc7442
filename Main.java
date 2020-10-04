import java.util.Scanner;

/**
 * Prompts the user to enter a positive integer until a negative integer is input
 * @author Cole Girling
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Scanner for user input
    Scanner input = new Scanner(System.in);

    //declare the variable
    int positiveNumber;

    //loops until a negative integer is input
    do{
      //prompts the user to enter an integer
      System.out.println("Please enter a positive integer. Enter a negative integer to quit.");
      positiveNumber = input.nextInt();
    //checks if a negative integer was input
    }while(positiveNumber >= 0);
    
    //when a negative integer is input the loop stops and it prints all done to the screen
    System.out.println("All done!");
  }
}
