/*Hniangtha
Programming Fundamentals
Summer
Programming Assignment 1
 */
import java.util.Random; // import Random class
import java.util.Scanner;// import scanner class

public class Cipher {
    public static void main(String[] args) {

        System.out.println("Please enter 5 numbers between 0 and 19");
        Scanner scan = new Scanner(System.in);//Create a Scanner object

        System.out.print("1st number: ");
        int num1 = scan.nextInt(); // Read user 1st input

        if (num1 > 19) {
            System.out.println("Please read directions and try again!"); // Output user input
            scan.close();
            System.exit(0); // If the user enter a number greater than 19,the program will terminate
        }

        System.out.print("2nd number: ");
        int num2 = scan.nextInt();// Read user 2nd input

        if (num2 > 19) {
            System.out.println("Please read directions and try again!");
            scan.close();
            System.exit(0);
        }

        System.out.print("3rd number: ");
        int num3 = scan.nextInt(); // Read user 3rd input

        if (num3 > 19) {
            System.out.println("Please read directions and try again!");
            scan.close();
            System.exit(0);
        }

        System.out.print("4th number: ");
        int num4 = scan.nextInt(); // Read user 4th input

        if (num4 > 19) {
            System.out.println("Please read directions and try again!");
            scan.close();
            System.exit(0);
        }

        System.out.print("5th number: ");
        int num5 = scan.nextInt(); // Read user 5th input

        if (num5 > 19) {
            System.out.println("Please read directions and try again!");
            scan.close();
            System.exit(0);
        }

        /* calculate the sum of user input and printout the total*/
        int Total = num1 + num2 + num3 + num4 + num5;
        System.out.println("Total = " + Total);

        Random generator = new Random();// generate pseudo-random numbers
        int key = generator.nextInt(10); // include (0-9)
        System.out.println("Your random Key: " + key);

        /* separate the number into 2 integers */
        int digit1 = Total % 10;
        int digit2 = Total / 10 % 10;

        /* encodes the each digit from the total using Caesar Code */
        int tens = (digit1 + key) % 10;
        int ones = (digit2 + key) % 10;

        /* recombine the number and Prints the encoded number */
        System.out.println("Your encoded number " + ones + tens);
        scan.close();
    }
}

