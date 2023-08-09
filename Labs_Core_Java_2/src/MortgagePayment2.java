package com.avtech.j2ee.lab2;

/*


        Display the mortgage payment amount and then list the loan balance and interest paid for each payment over the term of the loan.
        If the list would scroll off the screen, use loops to display a partial list, hesitate, and then display more of the list.
*/


public class MortgagePayment2
{
    public static void main(String[] args)
    {
        double initLoan = 200000.00;   // the initial amount of the loan
        int term = 360;                // the term of the loan in months
        double intRte = 0.0575 / 12;   // monthly interest rate
        double paymentAmt;             // monthly payment amount
        int pmtNum = 0;                // sequential payment number
        double prevBal, newBal;        // balances
        double monthlyInt;             // interest for them month

        double temp = Math.pow(1.0 + intRte,term); // intermediate calculation

        paymentAmt = initLoan * ((intRte * temp) / (temp - 1.0));

        // outupt
        System.out.println("\n\n\tMORTGAGE CALCULATION PROGRAM RESULTS");
        System.out.println("\nPayment\tPrev Balance\tInterest Paid\tNew Balance");
        System.out.println("\n-------\t------------\t-------------\t-----------");

        prevBal = initLoan;	// initialize previous balance

        while (pmtNum < term)   // loop as long as the payment # is less than the term
        {
            pmtNum++;		// increment payment # each time through loop

            monthlyInt = intRte * prevBal; // calculate interest for this period

            if (paymentAmt > prevBal)	// if balance is >= the payment amount, this is last payment
            {
                newBal = 0;
            }
            else
            {
                newBal = prevBal + monthlyInt - paymentAmt;	// calculate new balance
            }


            // output values
            System.out.format("\n%3d\t$%,.2f\t$%,.2f\t\t$%,.2f", pmtNum, prevBal, monthlyInt, newBal);

            prevBal = newBal; // set balance for next period

            if ((pmtNum % 20) == 0)  // check if period is evenly divisible by 20 (# of lines display before pausing)
            {
                try
                {
                    Thread.sleep(5000);		// pause for 1000 ms (one second)
                }
                catch (InterruptedException e)
                {
                    System.out.println("Exception Occurred, exiting");
                    System.exit(0);
                }
            }
        }

        System.out.format("\n\n\tMONTHLY MORTGAGE PAYMENT = $%.2f", paymentAmt);
        System.out.format("\n(Based on a loan of $%,.2f for %d months at an annual rate of %4.2f%%)\n", initLoan, term, (intRte * 12) * 100);
   }
}
