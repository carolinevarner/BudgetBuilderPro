public class ExpenseCalculator {
    private float income;
    private float rent;
    private float groceries;
    private float insurance;
    private float savings;
    private float wants;
    private float gas;
    public ExpenseCalculator(){
    }
    public ExpenseCalculator(float income, float rent, float groceries, float insurance, float savings, float wants, float gas){
        this.income = income;
        this.rent = rent;
        this.groceries = groceries;
        this.insurance = insurance;
        this.savings = savings;
        this.wants = wants;
        this.gas = gas;
    }
    public float getIncome() {
        return income;
    }
    public void setIncome(float income) {
        this.income = income;
    }
    public float getRent() {
        return rent;
    }
    public void setRent(float rent) {
        this.rent = rent;
    }
    public float getGroceries() {
        return groceries;
    }
    public void setGroceries(float groceries) {
        this.groceries = groceries;
    }
    public float getInsurance() {
        return insurance;
    }
    public void setInsurance(float insurance) {
        this.insurance = insurance;
    }
    public float getGas() {
        return gas;
    }
    public void setGas(float gas) {
        this.gas = gas;
    }
    public float getSavings() {
        return savings;
    }
    public void setSavings(float savings) {
        this.savings = savings;
    }
    public float getWants() {
        return wants;
    }
    public void setWants(float wants) {
        this.wants = wants;
    }
    public double rentCalc(float rent){
        double rentPercentage = (rent / this.income) * 100;
        return rentPercentage ;
    }
    public double groceriesCalc(float groceries){
        double groceriesPercentage = (groceries / this.income) * 100;
        return groceriesPercentage;
    }
    public double gasCalc(float gas){
        double gasPercentage = (gas / this.income) * 100;
        return gasPercentage;
    }
    public double savingsCalc(float savings){
        double savingsPercentage = (savings / this.income) * 100;
        return savingsPercentage;
    }
    public double insuranceCalc(float insurance){
        double insurancePercentage = (insurance / this.income) * 100;
        return insurancePercentage;
    }
    public double wantsCalc(float wants){
        double wantsPercentage = (wants / this.income) * 100;
        return wantsPercentage;
    }
    @Override
    public String toString(){
        return  "Your calculated budget is as follows: "+
                "\nYour monthly budget is: " + income +
                "\nYou spend " + rentCalc(rent) + "% of your budget on your rent/mortgage" +
                "\nYou spend " + groceriesCalc(groceries) + "% of your budget on groceries" +
                "\nYou spend " + gasCalc(gas) + "% of your budget on gas" +
                "\nYou spend " + insuranceCalc(insurance) + "% of your budget on insurance for your car/health" +
                "\nYou spend " + savingsCalc(savings) + "% of your budget on your savings" +
                "\nThis means you will have " + wantsCalc(wants) + "$ left over to spend on any of your non-essential wants/experiences this month";
    }
}
