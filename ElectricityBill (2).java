import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int units;
        
        // Prompt the user to enter the number of units consumed
        System.out.print("Enter the number of electricity units consumed: ");
        units = input.nextInt();
        
        // Calculate the bill amount based on the number of units consumed
        if (units <= 50) {
            double bill = units * 0.5;
            bill = bill + (bill * 0.2);
            System.out.println("Total electricity bill: " + bill);
        } else if (units <= 150) {
            double bill = 25 + ((units - 50) * 0.75);
            bill = bill + (bill * 0.2);
            System.out.println("Total electricity bill: " + bill);
        } else if (units <= 250) {
            double bill = 100 + ((units - 150) * 1.2);
            bill = bill + (bill * 0.2);
            System.out.println("Total electricity bill: " + bill);
        } else {
            double bill = 220 + ((units - 250) * 1.5);
            bill = bill + (bill * 0.2);
            System.out.println("Total electricity bill: " + bill);
        }
    }
}
