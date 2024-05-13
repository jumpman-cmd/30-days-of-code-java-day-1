import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main
{

    public static void main(String[] args)
    {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int secondI = 4;
        double secondD = 4.0;
        String secondS;

        /* Read and save an integer, double, and String to your variables.*/
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        secondI = myObj.nextInt();
        secondD = myObj.nextDouble();
        secondS = myObj.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + secondI);

        /* Print the sum of the double variables on a new line. */
        System.out.printf("%.1f\n", d + secondD);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s.concat(myObj.nextLine()));

        scan.close();
    }
}