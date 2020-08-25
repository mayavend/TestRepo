package Test;

public class LogicalOperator {
    public static void main(String[] args) {
        int temperature = 82;
        //isWarm if temp is between 80 and 95; else hot or cold
        boolean isWarm = temperature > 80 && temperature < 95;
        System.out.println(isWarm);

        temperature = 79; // re-assign temp
        /* Java will evaluate this condition from left to right. If the temp is 75, java will ignore the second condition
        to check for < 95 because it is less than 80 */
        boolean isWarm1 = temperature > 80 && temperature < 95;
        System.out.println(isWarm1);

        /* This determines loan eligible based on either high income or low debt   */
        boolean hasHighIncome = true;
        boolean hasLowDebt = false;

        boolean isLoanEligible = hasHighIncome || hasLowDebt;
        /* because he has highIncome, the || condition won't even be evaluated */
        System.out.println(isLoanEligible);

        /* added one more condition for loan approval - must have no criminal record. use parenthesis for this */
        boolean hasCriminalRecord = true;
        isLoanEligible = !hasCriminalRecord && (hasHighIncome || hasLowDebt);
        /* the not operator ! reverses the value above */
        System.out.println(isLoanEligible);
    }
}
