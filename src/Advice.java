public class Advice extends ExpenseCalculator{
    private double wants; //15%


    public void positiveCritique(){
        double check = (getIncome() * getSavings());
        if((getIncome() - getSavings()) >= 0.20){
            System.out.println("\nIt is recommended that your savings be at least 20% of your monthly income. \nYou are currently putting away " +check+ "% of your income every month so keep up the great work!");
        }
        double check2 = (getIncome() * getGroceries());
        if((getIncome() - getGroceries()) <= 0.15) {
            System.out.println("\nIt is recommended that your groceries be no more than 15% of your monthly income. \nYou are spending " + check2 + "% of your income every month on groceries, so you're doing a great job!");
        }
        double check3 = (getIncome() * getGas());
        if((getIncome() - getGas()) <= 0.10) {
            System.out.println("\nIt is recommended that your gas be around 10% of your monthly income. \nYou are spending " + check3 + "% of your income every month on gas, so our experts would say you're doing a great job staying within a smart range!");
        }
        double check4 = (getIncome() * getInsurance());
        if((getIncome() - getInsurance()) <= 0.10) {
            System.out.println("\nIt is recommended that your insurance (health/car) be around 10% of your monthly income. \nYou are spending " + check4 + "% of your income every month on gas, so it appears that you have choosen the right insurance carrier!");
        }
        double check5 = (getIncome() * getRent());
        if((getIncome() - getRent()) <= 0.30) {
            System.out.println("\nIt is recommended that your rent be around 30% of your monthly income. \nYou are spending " + check5 + "% of your income every month on rent, so you are well within the normal range of what you should be spending every month");
        }
    }
    public void negativeCritique(){
        double check = (getIncome() * getSavings());
        if((getIncome() - getSavings()) < 0.20){
            double monthly_savings = (getIncome() * 0.20);
            System.out.println("\nIt is recommended that your savings be at least 20% of your monthly income. \nYou are only putting away " +check+ "% of your income every month so we at Budget Builder Pro would recommend you \nprioritize your savings more and put $" +monthly_savings + "into your savings account every month");
        }
        double check2 = (getIncome() * getGroceries());
        if((getIncome() - getGroceries()) > 0.15) {
            double monthly_savings2 = (getIncome() * 0.15);
            System.out.println("\nIt is recommended that your groceries be no more than 15% of your monthly income. \nYou are spending " + check2 + "% of your income every month on groceries, so our experts would recommend \nspending around $" +monthly_savings2+ " a month on groceries instead");
        }
        double checkGas = gasCalc(getGas());
        if(checkGas > 0.10) {
            double monthly_savings3 = (getIncome() * 0.10);
            System.out.println("\nIt is recommended that your gas be around 10% of your monthly income. \nYou are spending " + checkGas + "% of your income every month on gas, so our experts would recommend \nspending an estimated $" +monthly_savings3+ " a month on gas/public transportation instead");
        }
        double check4 = (getIncome() * getInsurance());
        if((getIncome() - getInsurance()) > 0.10) {
            double monthly_savings4 = (getIncome() * 0.10);
            System.out.println("\nIt is recommended that your insurance (health/car) be around 10% of your monthly income. \nYou are spending " + check4 + "% of your income every month on gas, so our experts would recommend \nspending an estimated $" +monthly_savings4+ " a month on insurance through a less expensive provider instead");
        }
        double check5 = (getIncome() * getRent());
        if((getIncome() - getRent()) > 0.30) {
            double monthly_savings5 = (getIncome() * 0.30);
            System.out.println("\nIt is recommended that your rent be around 30% of your monthly income. \nYou are spending " + check5 + "% of your income every month on rent, so instead, our experts would recommend \nspending $" +monthly_savings5+ " a month on rent through a less expensive apartment/house instead to help build your future");
        }
    }
    public void print_wants_amount(){
        wants = (getIncome() - (getRent() + getGroceries() + getInsurance() + getSavings() + getGas()));
        double temp = (getIncome() * 0.15);
        if(wants > temp){
            System.out.println("After all of our calculations it looks like you have "+wants+" left over for you any extra expenses/wants you might have. \nour experts recommend spending around 15% of your monthly income on these extra expenses which is around " +temp+ "$ for you. \nMeaning that it looks like you are spending a bit more than what is recommended on non-essential costs and should be more mindful about your spending.");
        }
        else if(wants <= temp && wants > 0){
            System.out.println("After all of our calculations it looks like you have "+wants+" left over for you any extra expenses/wants you might have. \nour experts recommend spending around 15% of your monthly income on these extra expenses which is around " +temp+ "$ for you. \nMeaning that it looks like you are within range of these recommendations. \nKeep up the great work!");
        }
    }
}
