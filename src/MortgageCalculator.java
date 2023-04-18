import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int principal = 0;
        int period = 0;
        int annualRate = 0;
        boolean validInput1 = false;
        boolean validInput2 = false;
        boolean validInput3 = false;
        int PERCENTAGE = 100;
        int MONTHS = 12;

        while (!validInput1) {
            System.out.print("Principal ($1k - $1M): ");
            principal = scanner.nextInt();

            if (principal >= 1000 && principal <= 1000000) {
                validInput1 = true;
            } else {
                System.out.print("Enter a value greater than 1000 and less than 1mln: ");
            }
        }

        while (!validInput2) {
            System.out.print("Annual Interest Rate: ");
            annualRate = scanner.nextInt();

            if (annualRate > 0 && annualRate <= 30) {
                validInput2 = true;
            } else {
                System.out.print("Enter a value greater than 0 and lesss than 30: ");
            }
        }

        while (!validInput3) {
            System.out.print("Period(Years): ");
            period = scanner.nextInt();

            if (period >= 1 && period <= 30) {
                validInput3 = true;
            } else {
                System.out.print("Enter a value between 1 and 30:  ");
            }
        }

            double monthlyRate = (double) annualRate / PERCENTAGE / MONTHS;
            double numberOfPayments = (double) (period) * MONTHS;
            double onePlusMonthlyRate = 1 + monthlyRate;
            double powerResult = Math.pow(onePlusMonthlyRate, numberOfPayments);
            double result = (double) (principal) * ((monthlyRate * powerResult) / (powerResult - 1));  // this is the formula for calculating mortgage
            String formattedResult = String.format("%.2f", result); // formatting the result to 2 decimals to have a clean answer
            System.out.print("Mortgage: " + formattedResult + "$ per month");
        }
}


