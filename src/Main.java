import java.util.Scanner;

/**
 * Create a new Java project to model temperature by storing a temperature value in Celsius.
 * Your code should be able to return the Celsius temperature as well as return it in Fahrenheit.
 * To convert to Fahrenheit from Celsius, here's the formula: F = C * 9/5 + 32.
 * After you first create the project, do the necessary step to make it a local git repository and commit the initial files.
 * Then, create a new remote repository and link your local repository to the remote repository and push the first commits.
 *      Commit 1: Project initialization and basic class skeleton.
 *      Commit 2: Implementation of Celsius fields and getter/setter methods.
 *      Commit 3: Addition of the Fahrenheit conversion logic and main method tests.
 */

public class Main{
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // have a scanner

        // hold the temps and unit
        double temp;
        double newTemp;
        String unit;

        //ask user for a temperature
        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        //ask if they want it to be converted to Celsius or Fahrenheit
        System.out.print("Do you want to convert to Celsius of Fahrenheit? (C or F)");
        unit = scanner.next();

        //math portion of how to convert it
        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;

        //then giving the new converted temperature
        System.out.printf("%.1f°%s", newTemp, unit);

        scanner.close();
    }
}














