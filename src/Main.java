import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //create new object

        //inputs
        System.out.print("Principal: ");
        String principal = scanner.nextLine();

        System.out.print("Annual Interest Rate: ");
        String annualRate = scanner.nextLine();

        System.out.print("Period: ");
        String period = scanner.nextLine();


        double monthlyRate = (Double.parseDouble(annualRate))/100/12;
        double numberOfPayments = Double.parseDouble(period) * 12;
        double onePlusMonthlyRate = 1 + monthlyRate;
        double powerResult = Math.pow(onePlusMonthlyRate, numberOfPayments);
        double result = Double.parseDouble(principal) * ((monthlyRate * powerResult) / (powerResult - 1));  // this is the formula for calculating mortgage
        String formattedResult = String.format("%.2f", result); // formatting the result to 2 decimals to have a clean answer
         System.out.print("Mortgage: " + formattedResult + "$ per month");
    }
}


