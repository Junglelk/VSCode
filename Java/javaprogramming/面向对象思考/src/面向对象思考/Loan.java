package 面向对象思考;

import java.sql.Date;

public class Loan {
	
	private double annualInterestRate;
	
	private int numberOfYear;
	
	private double loanAmount;
	
	private java.util.Date loanDate;				//创建时间类型变量方法 
	
	public Loan() {
		this(2.5 , 1 ,100);                         //默认数值
	}
	
	public Loan(double annualInterestRate , int numberOfYear, double loanAmount ){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYear       = numberOfYear;
        this.loanAmount         = loanAmount;
    }

    /**
     * @return the annualInterestRate
     */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /**
     * @return the numberOfYear
     */
    public int getNumberOfYear() {
        return numberOfYear;
    }

    /**
     * @return the loanAmount
     */
    public double getLoanAmount() {
        return loanAmount;
    }

    /**
     * @param annualInterestRate the annualInterestRate to set
     */
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /**
     * @param loanAmount the loanAmount to set
     */
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    /**
     * @param numberOfYear the numberOfYear to set
     */
    public void setNumberOfYear(int numberOfYear) {
        this.numberOfYear = numberOfYear;
    }

    public double getMonthlyPayment(){
        double monthlyInterestRate = annualInterestRate/1200;
        double MonthlyPayment      = loanAmount*monthlyInterestRate/(1-(1/Math.pow(1+monthlyInterestRate,numberOfYear*12)));
        return MonthlyPayment;

    }

    public double getTotallyPayment(){
        double totallyPayment      = getMonthlyPayment()*numberOfYear*12;
        return totallyPayment;
    }

    /**
     * @return the loanDate
     */
    public java.util.Date getLoanDate(Date loandDate) {
        loanDate = new java.util.Date();
        return loanDate;
    }


}