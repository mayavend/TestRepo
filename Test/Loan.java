package Test;

public class Loan {
    public static void main(String[] args) {


        boolean criminal = false;
        boolean hasHighIncome = true;
        boolean hasLowDebt = false;
        boolean spendsAtCostco = true;
        boolean taxEvasionChibiFrosty= true;
        boolean loanEligible = !taxEvasionChibiFrosty&& !criminal && (hasHighIncome || hasLowDebt) && !spendsAtCostco;
        System.out.println(loanEligible);
    }
}
