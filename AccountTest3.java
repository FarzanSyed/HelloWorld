//AccountTest
//Create and manipulate an Account object

import java.util.Scanner;

public class AccountTest3{
  public static void main(String[] args){
    //Create object of Scanner
    Scanner input = new Scanner(System.in);
    
    //create an Account object and assign it to myAccount
    Account2 myAccount2 = new Account2("John Smith");
    
    //display initial value of name(mull)
    System.out.printf("initial name is %s%n%n", myAccount2.getName());
    
    //prompt for and read name
    System.out.println("Please enter the name:");
    String theName = input.nextLine(); // read a line of text
    myAccount2.setName(theName); // put theName in myAccount
    System.out.println(); //outputs a blank line
    
    //display the name stored in object myAccount
    System.out.printf("Name in object myAccount is: %n%s%n", myAccount2.getName());
  }
}