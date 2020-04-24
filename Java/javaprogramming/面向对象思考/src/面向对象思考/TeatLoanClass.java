package 面向对象思考;

import java.util.Scanner;

public class TeatLoanClass {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("输入每年的贷款利率(比如：8.25)：");

        double annualInterestRate = input.nextDouble();

        System.out.println("输入贷款年限(整数)：");

        int numberOfYears = input.nextInt();

        System.out.println("输入贷款金额，单位圆(例如：12000.95)：");

        double loanAmount = input.nextDouble();

        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        System.out.printf("这个贷款创建于%s\n"+"月还款为%.2f\n"+"总还款为%.2f\n",loan.getLoanDate(null).toString(),loan.getMonthlyPayment(),loan.getTotallyPayment());

    }
}