/*
1.	Chapter 3, Challenge 15. on page 184: 

A bank charges a base fee of $10 per month, plus the following check fees for a commercial checking account:

    $.10 each for less than 20 checks

    $.08 each for 20–39 checks

    $.06 each for 40–59 checks

    $.04 each for 60 or more checks

Write a program that asks for the number of checks written for the month. The program should then calculate and display the bank’s service fees for the month.

Logic:
        1. There will be base charge of $10.00 no matter what
        2. if user issues less than 20 checks then $0.10 will be added to each check issued and then base fees is added
            2.1 this means if checks issued are less than 20 then we multiply that number with 0.10 and then added it to 10.00
        3. else if checks < 40 then multiply number of checks issued with 0.08 and add 10.00
        4. else if checks < 60 then multiply number of checks issued with 0.06 and add 10.00
        5. else if check >= 60 then multiply number of checks issued with 0.04 and add 10.00
        6. else default statement
*/

import java.util.Scanner;  // importing scanner for user input

public class Bank_Charges  // creating a class for our program
{
    public static void main(String[] args)  // main method is created which means the program will debug from here onwards 
    {
        System.out.println("Welcome to the Bank Charges program");
        
        // declaring variables
        double base_fee = 10;
        double service_fee;
        int checks_issued;

        // using scanner to ask for user input
        System.out.println("Please enter the number of checks issued this month");
        Scanner input = new Scanner(System.in);
        checks_issued = input.nextInt();

        // using our if else lader 
        if (checks_issued < 20)
        {
            service_fee = (checks_issued * 0.10) + 10;
            System.out.println("The service fee charged for this month = " + service_fee);
        }
        else if (checks_issued < 40)
        {
            service_fee = (checks_issued * 0.08) +10;
            System.out.println("The service fee charged for this month = " + service_fee);
        }
        else if (checks_issued < 60)
        {
            service_fee = (checks_issued * 0.06) +10;
            System.out.println("The service fee charged for this month = " + service_fee);
        }
        else if (checks_issued >= 60)
        {
            service_fee = (checks_issued * 0.04) +10;
            System.out.println("The service fee charged for this month = " + service_fee);
        }
        else
        {
            System.out.println("please enter a valid number of checks issued for this month");
        }
    }    
}
