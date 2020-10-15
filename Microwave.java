//import necessary libraries
import java.lang.String;
import java.util.Scanner;

/**
* This application calculates the amount of energy that could be released.
* from an object
*
* @author  Ben Falsetto
* @version 1.0
* @since   2020-09-22
*/
public class Microwave {
  
  /**
   * This is the main method.
  */
  public static void main(String[] args) {
    //declare variables
    boolean invalidType = true;
    boolean invalidNum = true;
    int cookType = -1;
    int numFood = 0;
    float cookTime = 0;
    String foodType = "";
    
    //declare constants
    String pizza = "pizza";
    String soup = "soup";
    String sub = "sub";
    
    //check for valid input
    while (invalidType = true) {  
      //ask user to input food
      System.out.println("Please enter food type: ");
      
      //get the input from the user
      Scanner input = new Scanner(System.in);
      foodType = input.next();
      
      //foodType.toLowerCase();
      //checking for valid input, if no valid input, loop, else break loop
      if (foodType.equals(pizza) != true && foodType.equals(soup) 
          != true && foodType.equals(sub) != true) {
        System.out.println("Invalid entry. Try pizza, soup, sub");
        invalidType = true;
      } else {
        invalidType = false;
        break;
      }
    }
    
    //checking which type of food
    if (foodType.equals(pizza)) {
      cookType = 0;
    } else if (foodType.equals(soup)) {
      cookType = 1;
    } else if (foodType.equals(sub))  {
      cookType = 2;
    }
    
    //getting number of items to be heated
    while (invalidNum = true) {
      //ask the user for the number of items
      System.out.println("Please enter the quantity: ");
      
      //get the input from the user
      Scanner input = new Scanner(System.in);
      numFood = input.nextInt();
      
      //checking for valid input, if no valid input, loop, else break loop
      if (numFood != 1 && numFood != 2 && numFood != 3) {
        System.out.println("Invalid entry. Try 1, 2, 3");
        invalidNum = true;
      } else {
        invalidNum = false;
        break;
      }
    }
    
    //determining cooktime
    
    //pizza
    if (cookType == 0)  {
      if (numFood == 1) {
        System.out.println("Cook time is 0.75 minutes");
      } else if (numFood == 2) {
        System.out.println("Cook time is 1.125 minutes");
      } else if (numFood == 3) {
        System.out.println("Cook time is 2.25 minutes");
      } //soup is next
    } else if (cookType == 1)  {
      if (numFood == 1) {
        System.out.println("Cook time is 1.75 minutes");
      } else if (numFood == 2) {
        System.out.println("Cook time is 2.625 minutes");
      } else if (numFood == 3) {
        System.out.println("Cook time is 3.5 minutes");
      } //subs last
    } else if (cookType == 2)  {
      if (numFood == 1) {
        System.out.println("Cook time is 1 minutes");
      } else if (numFood == 2) {
        System.out.println("Cook time is 1.5 minutes");
      } else if (numFood == 3) {
        System.out.println("Cook time is 2.0 minutes");
      }
    }
  }
}