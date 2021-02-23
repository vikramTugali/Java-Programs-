/*
1.	Chapter 4, Challenge 16. on page 265: 

Write a program that asks the user to enter the amount that he or she has budgeted for a month. A loop should then prompt the user to enter each of his or her expenses for the month, and keep a running total. When the loop finishes, the program should display the amount that the user is over or under budget.

Logic:
    1. ask the user for their monthly budget
    2. ask the user if they have any expenses for that month
        2.1 if yes then save that value and ask for any aditional expenses then add them to the previosuly saved value and ask if any addtion expenses and keep this going untill the user says no
    3. if the user says no additional expenses for that month then compare the expense with their budget to determine if they are over, under or on budget
        3.1 if expenses < budget then user is under budget
        3.2 if expenses > budget then user is over budget
        3.3 if expenses = budget then user is on budget
    4. to create a loop as explained in 2.1 we will use while loop ===> while (expenses = yes)
*/
import java.util.Scanner; // importing scanner for user input

public class Monthly_Budget  // creating a class for our program
{
    public static void main(String[] args)  // main method is created which means the program will debug from here onwards 
    {
        System.out.println("Welcome to mothly budgeting program");

        // declaring variables
        double monthly_budget;
        double expense;
        double total_expense = 0;
        char aditional_expense = 'y';  // y = yes will be using additional_expense variable as shown in our while loop
        
        // using scanner to ask for user input
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your monthly budget");
        monthly_budget = input.nextDouble();

        // initating our while loop
        while (aditional_expense == 'y')
        {
            System.out.println("Please enter if you have any expenses for this month : ");
            expense = input.nextDouble();   // this will save the user input for additional expense
            total_expense = total_expense + expense;    // here we are adding the new expense entered by the user to the above saved expense
            
            System.out.println("Please enter y if you have any aditional expenses for this month : ");
            input.nextLine();
            // here we are making sure that user has to enter char 'y' to continue the loop any other letter than 'y'  will result in termination of loop
            aditional_expense = input.nextLine().charAt(0);  
        }

        // starting our if else statements
        if (total_expense < monthly_budget)
        {
            System.out.println("You are under budget by : $ " + (monthly_budget - total_expense));
        }
        else if (total_expense > monthly_budget)
        {
            System.out.println("You are over the budget by : $ " + (total_expense - monthly_budget));
        }
        else
        {
            System.out.println("you are on budget");
        }

    }
}
