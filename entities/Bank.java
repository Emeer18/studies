package entities;
public class Bank {
    
    public String name;
    private int numberAccount;
    private double saldo;

    public double getSaldo(){

        return saldo;

    }

    public Bank(String name, int numberAccount, double saldo){

        this.name = name;
        this.numberAccount = numberAccount;
        this.saldo = saldo;

    }

    public Bank(String name, int numberAccount){

        this.name = name;
        this.numberAccount = numberAccount;

    }

    public double inittialDeposit(double deposit){

        saldo += saldo + deposit;
        return saldo;
    }

    public double deposit(double deposit){

        saldo += saldo + deposit;
        return saldo;

    }

    public double saque(double saque){

        saldo += saldo - saque - 5.0;
        return saldo;

    }

    public void showData(){

        System.out.println("Nome : " + name 
                                     + "\nConta : " 
                                     + numberAccount 
                                     + "\nSaldo : " 
                                     + saldo);

    }


    }