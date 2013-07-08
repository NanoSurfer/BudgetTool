/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package budgettool;

/**
 *
 * @author Shawn
 */
public class BudgetMain {
    
    public static void main(String args[])
    {
//        BudgetGUI myGui = new BudgetGUI();
//        myGui.setVisible(true);
        MonthlyBudget myBudget = new MonthlyBudget();
        
        double myIncome = myBudget.setIncome(20000);
        myBudget.setWorkDays(20);
        
        System.out.println("The monthly income with TAX is : " + myBudget.calculateTax(myIncome));
        System.out.println("The daily income per day with TAX : " + myBudget.incomePerDay());
    }
    
}
