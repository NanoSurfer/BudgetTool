/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package budgettool;

/**
 *
 * @author Shawn
 */
public class MonthlyBudget {
    
    private double income;
    private int workDays;
    private double tax = 0.14;
    
    public MonthlyBudget() // Default constructor
    {
    }

    /**
     * @return the income
     */
    public double getIncome() {
        return income;
    }

    /**
     * @param income the income to set
     */
    public double setIncome(double income) {
        this.income = income;
        return income;
    }

    /**
     * @return the workDays
     */
    public int getWorkDays() {
        return workDays;
    }

    /**
     * @param workDays the workDays to set
     */
    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }
    
    public double calculateTax(double aIncome) 
    {
        double withTax;
        withTax = aIncome * tax;
        aIncome = aIncome - withTax;
        return aIncome;
    }
    
    public double incomePerDay()
    {
        double dailyIncome;
        double withTax;
        dailyIncome = income / workDays;
        withTax = calculateTax(dailyIncome);
        return withTax;
    }   
}
