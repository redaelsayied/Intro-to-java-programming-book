package Ch_04;

import java.util.Scanner;

/*Financial application: payroll) Write a program that reads the following information and prints a payroll statement:
Employee’s name (e.g., Smith)
Number of hours worked in a week (e.g., 10)
Hourly pay rate (e.g., 9.75)
Federal tax withholding rate (e.g., 20%)
State tax withholding rate (e.g., 9%)
A sample run is as follows:
Enter employee’s name: Smith
Enter number of hours worked in a week: 10
Enter hourly pay rate: 9.75
Enter federal tax withholding rate: 0.20
Enter state tax withholding rate: 0.09
Employee Name: Smith
Hours Worked: 10.0
Pay Rate: $9.75
Gross Pay: $97.50
Deductions:
 Federal Withholding (20.0%): $19.50
 State Withholding (9.0%): $8.77
 Total Deduction: $28.27
Net Pay: $69.22*/
public class Problem04_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String name = input.nextLine();

        System.out.print("Enter number of hours worked in a week: ");
        double hoursWorked = input.nextDouble();

        System.out.print("Enter hourly pay rate: ");
        double hourlyPayRate = input.nextDouble();

        System.out.print("Enter federal tax withholding rate (e.g., 0.20 for 20%): ");
        double federalTaxWithholdingRate = input.nextDouble();

        System.out.print("Enter state tax withholding rate (e.g., 0.09 for 9%): ");
        double stateTaxWithholdingRate = input.nextDouble();

        double grossPay = hoursWorked * hourlyPayRate;

        double federalWithholding = grossPay * federalTaxWithholdingRate;
        double stateWithholding = grossPay * stateTaxWithholdingRate;
        double totalDeduction = federalWithholding + stateWithholding;

        double netPay = grossPay - totalDeduction;

        System.out.println("\nEmployee Name: " + name);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Pay Rate: $" + hourlyPayRate);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions:");
        System.out.println(" Federal Withholding (" + (federalTaxWithholdingRate * 100) + "%): $" + federalWithholding);
        System.out.println(" State Withholding (" + (stateTaxWithholdingRate * 100) + "%): $" + stateWithholding);
        System.out.println(" Total Deduction: $" + totalDeduction);
        System.out.println("Net Pay: $" + netPay);

    }
}
