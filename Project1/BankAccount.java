package Project1;

import java.util.Scanner;

public class BankAccount {
    private double balance;

    
    public BankAccount(){
        balance = 0;
    }

    public BankAccount(double initalBalance){
        balance = initalBalance;
    }


    public double getBalance(){
        return balance;
    }

 //test
    public void deposit(double amount){
        balance = balance + amount;
    }

    public void withdraw(double amount){
        balance = balance - amount;
    }


    public void monthlyfee(){
        withdraw(10);
    }

    // P(1+ R/n)^(nt) - P 
    // P = principal
    // t = years
    // R = annual interest rate
    // n = # of times its compunded
    // PEMDAS 
    public void calcInterest(double p, int t, double r, int n){
        double amount =  p * Math.pow(1 + (r/n), n*t);
        double compinterest = amount - p;
        System.out.println("Compund Interest after "+ t + " years: "+ compinterest);
        System.out.println("Amount after "+ t +" years: "+ amount);
    }

    public static int menu(){
        int selection;
        Scanner input = new Scanner(System.in);

        /************************ */
        System.out.println("Please select and option:");
        System.out.println("-------------------------");
        System.out.println("1: Get Balance");
        System.out.println("2: Deposit");
        System.out.println("3: Withdraw");
        System.out.println("4: Compund Interest");
        System.out.println("0: Quit");
        System.out.println("-------------------------");

        selection = input.nextInt();


        return selection;


    }





}
