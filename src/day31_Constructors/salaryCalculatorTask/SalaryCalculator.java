package day31_Constructors.salaryCalculatorTask;

public class SalaryCalculator {

    public double hourlyRate, stateTaxRate, federalTaxRate;
    public int weeklyHour;

    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHour) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate/100;
        this.federalTaxRate = federalTaxRate/100;
        this.weeklyHour = weeklyHour;
    }

    //salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
    public double salary(){
        return hourlyRate * weeklyHour * 52;
    }

    //stateTax(): calculates the totalStateTax
    public double totalStateTax(){
        return salary() * stateTaxRate;
    }

    //federalTax(): calculates the total federal tax
    public double totalFederalTax(){
        return salary() * federalTaxRate;
    }

    //salaryAfterTax(): calculates the salary after tax
    public double salaryAfterTax(){
        return salary() - federalTaxRate - stateTaxRate;
    }

    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", weeklyHour=" + weeklyHour +
                ", salary= $" + salary() +
                ", stateTax= $" + totalStateTax() +
                ", federalTax= $" + totalFederalTax() +
                ", salaryAfterTax= $" + salaryAfterTax() +
                '}';
    }
}
/*
1.1 Create a class named Salary calculator:
		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

	            Add a constructor to set all the fields

		        Actions:
		            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		            stateTax(): calculates the totalStateTax
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */