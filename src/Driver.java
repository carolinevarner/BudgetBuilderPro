import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float income = 0, rent = 0, groceries = 0, gas = 0, insurance = 0, savings = 0;
        boolean income2 = false, rent2 = false, groceries2 = false, gas2 = false, insurance2 = false, savings2 = false;
        Advice calc = new Advice();


        System.out.println("BUDGET BUILDER PRO");
        System.out.println("\nHello User! Thank you for choosing the Budget Builder Pro Application for Budgeting needs today. " +
                "\nWe are a Budgetng tool made by the people, for the people and we understand how finding time and "+
                "\nhaving the knowledge to budget is hard so we have created this tool for you today to help you learn "+
                "\nhow to budget better and put those great habits into practice in your daily life. First we will ask "+
                "\nyou a couple questions about your projected monthly income and how you want to spend your money, "+
                "\nand then we will calculate a custom budget for you that details how you should plan to split your income! ");
        System.out.println("=============================================================");


        try {
            System.out.print("\nWhat is your predicted monthly income?: ($)");
            income = sc.nextFloat();
            if(income > 0) {
                do {
                    System.out.print("\nHow much of your monthly income needs to go to your rent/mortgage?: ($)");
                    rent = sc.nextFloat();
                    if (rent < 0 || rent > income) {
                        System.out.println("Please enter a valid amount!");
                        rent2 = false;
                    } else {
                        rent2 = true;
                    }


                    System.out.print("\nHow much of your monthly income needs to go to groceries?: ($)");
                    groceries = sc.nextFloat();
                    if (groceries < 0 || groceries > income) {
                        System.out.println("Please enter a valid amount!");
                        groceries2 = false;
                    } else {
                        groceries2 = true;
                    }


                    System.out.print("\nHow much of your monthly income needs to go to gas/transportation?: ($)");
                    gas = sc.nextFloat();
                    if (gas < 0 || gas > income) {
                        System.out.println("Please enter a valid amount!");
                        gas2 = false;
                    } else {
                        gas2 = true;
                    }


                    System.out.print("\nHow much of your monthly income needs to go to your insurance (car/health)?: ($)");
                    insurance = sc.nextFloat();
                    if (insurance < 0 || insurance > income) {
                        System.out.println("Please enter a valid amount!");
                        insurance2 = false;
                    } else {
                        insurance2 = true;
                    }


                    System.out.print("\nHow much of your monthly income would you like to put towards your savings?: ($)");
                    savings = sc.nextFloat();
                    if (savings < 0 || savings > income) {
                        System.out.println("Please enter a valid amount!");
                        savings2 = false;
                    } else {
                        savings2 = true;
                    }
                }while(savings2 == false && insurance2 == false && gas2 == false && groceries2 == false && rent2 == false);
            }
            else{
                System.out.println("Income entered is not valid!");
            }
            // set values
            calc.setIncome(income);
            calc.setRent(rent);
            calc.setGroceries(groceries);
            calc.setGas(gas);
            calc.setSavings(savings);


            // calculate items
            calc.rentCalc(rent);
            calc.groceriesCalc(groceries);
            calc.gasCalc(gas);
            calc.insuranceCalc(insurance);
            calc.savingsCalc(savings);
            calc.toString();


            calc.negativeCritique();
            calc.positiveCritique();
            calc.print_wants_amount();
        }catch(NumberFormatException e){
            System.out.println("Please enter a number!");
        }catch(Exception e){
            System.out.println("Please enter a number!");
        }
        System.out.println("Thank you for choosing Budget Builder Pro today for your budgeting needs and please do not hesitate to use our \nservices however many times you would like to find the budget that works best for your!");
    }
}
