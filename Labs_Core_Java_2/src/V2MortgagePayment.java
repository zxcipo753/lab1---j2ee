public class V2MortgagePayment {

    public static void main(String[] args) {
        // Hardcoded values
        final double LOAN_AMOUNT = 200000.00;
        
        // Define an 2-D array of 3 different types of loan details: terms and interest rates
        double[][] diffLoans = {
            {7, 5.35},
            {15, 5.5},
            {30, 5.75}
        };

        for (int i = 0; i < diffLoans.length; i++) {
            int TERM_YEARS = (int) diffLoans[i][0];
            double ANNUAL_INTEREST_RATE = diffLoans[i][1];
            double monthlyInterestRate = ANNUAL_INTEREST_RATE / 12 / 100;
            int totalPayments = TERM_YEARS * 12;
            
            double loanNumerator = LOAN_AMOUNT * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalPayments);
            double loanDenominator = Math.pow(1 + monthlyInterestRate, totalPayments) - 1;
            double monthlyPayment = loanNumerator / loanDenominator;

            System.out.format("\n\n\tDetails for %d years loan at %4.2f%% annual interest rate:\n", TERM_YEARS, ANNUAL_INTEREST_RATE);
            System.out.format("\n\tMONTHLY MORTGAGE PAYMENT = $%.2f\n", monthlyPayment);
            System.out.println("\nPayment\tPrev Balance\tInterest Paid\tNew Balance");
            System.out.println("-------\t------------\t-------------\t-----------");

            double prevBal = LOAN_AMOUNT;

            for (int pmtNum = 1; pmtNum <= totalPayments; pmtNum++) {
                double monthlyInterest = prevBal * monthlyInterestRate;
                double principal = monthlyPayment - monthlyInterest;
                double newBal = prevBal - principal;

                System.out.format("\n%3d\t$%,.2f\t$%,.2f\t\t$%,.2f", pmtNum, prevBal, monthlyInterest, newBal);
                
                prevBal = newBal;

                 // 36 paymentNumber as one round, then pause for 1 second. Loop over until the newBalance reach to 0$.
                if (pmtNum % 36 == 0) { 
                    try {
                        Thread.sleep(1000); // Pause for 1 second
                    } catch (InterruptedException e) {
                        System.out.println("Exception Occurred, exiting");
                        System.exit(0);
                    }
                }
            }
            System.out.format("\n(Based on a loan of $%,.2f for %d months at an annual rate of %4.2f%%)\n", LOAN_AMOUNT, totalPayments, ANNUAL_INTEREST_RATE);
        }
    }
}



