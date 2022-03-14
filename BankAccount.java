package com.ravi.apps;

import java.util.Scanner;

class BankAccount {
    public String AccountName;
    public long AccountNumber = 1234567891;
    public double AccountBalance;
}

class Bank extends BankAccount{

    double initialBalance = 0.0;

    public void Account_open(String AccountName, String  PhoneNo,String EmailId, String PanCardNo, String AadharNo)
    {
        System.out.println("\nPlease Wait, We Are Creating Your New Bank Account. \nThank Q For Having Patience!");
        System.out.println("\nYou're New Bank Account Has Been Created Successfully! Check The Given Details Below.");

        System.out.println("\nAccount Number: "+AccountNumber+"\nInitial Balance: "+initialBalance+"\nAccount Holder Name: "+AccountName+
                "\nMobile Number: "+PhoneNo+"\nEmail: "+EmailId+"\nAadhar Number: "+AadharNo+"\nPan Card: "+PanCardNo);

        System.out.println("\nDeposit Money To Activate Your Account And Enjoy The Benefits Of Digital World!");
    }

    public void Deposit(double D){
        AccountBalance = initialBalance+D;
        System.out.println("\nThe Amount Has Been Credited Into Your Account :)");
        System.out.println("Your Account Balance is Rs."+AccountBalance);
    }

    public void Withdraw(double W){
        if(AccountBalance>=W){
            System.out.println("Your Account Was Debited With Rs."+W);
            AccountBalance = AccountBalance-W;
            System.out.println("Your Account Balance is Rs."+AccountBalance);
        }
        else{
            System.out.println("Insufficient Balance Rs."+AccountBalance);
        }
    }

    public double BalanceCheck(){
        return AccountBalance;
    }
}

class TestBankAccount{
    public static void main(String[] args) {

        Bank B = new Bank();

        Scanner Input = new Scanner(System.in);
        System.out.println("Enter Your Details To Open A New Bank Account");
        System.out.print("\nEnter Your Name: ");                             String AccountName = Input.nextLine();
        System.out.print("Enter Your Mobile Number: ");                      String PhoneNo = Input.next();
        System.out.print("Enter Your Email id: ");                           String EmailId = Input.next();
        System.out.print("Enter Your PanCard Number: ");                     String PanCardNo = Input.next();
        System.out.print("Enter Your Aadhar Number: ");                      String AadharNo = Input.next();

        B.Account_open(AccountName, PhoneNo, EmailId, PanCardNo, AadharNo);

        System.out.print("\nPress 1 To Deposit Money Into Your Account: ");  int Button1 = Input.nextInt();
        System.out.print("Enter The Amount To Deposit: ");                   double D = Input.nextDouble();
        B.Deposit(D);

        System.out.println("\nPress ok To Continue");                        String Button2 = Input.next();
        System.out.println("Press 1 To Desposit Money" +
                "\nPress 2 To Withdraw Money" +
                "\nPress 3 To Check Balance");

        String Button3 = Input.next();

        do {
            switch (Button3) {
                case "1":
                    System.out.print("Enter Amount To Deposit: ");
                    D = Input.nextDouble();
                    B.Deposit(D);
                    break;

                case "2":
                    System.out.print("Enter Amount To Withdraw: ");
                    double W = Input.nextDouble();
                    B.Withdraw(W);
                    break;

                case "3":
                    System.out.print("Your Account Balance is Rs.:" + B.BalanceCheck());
                    break;

                default:
                    System.out.print("Thank Q \nVisit Again ");
                    break;
            }
        } while (Button3 == null);
        System.out.print("\n\nThank Q \nVisit Again ");
    }
}
