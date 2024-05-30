package org.oops;

public class BankDetails extends SelectBank{

    String Bankname;
     String Bankcode;

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
       this.Balance = balance;
    }

    public int getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(int accountNo) {
        this.AccountNo = accountNo;
    }

    private int Balance;
    private int AccountNo;

BankDetails(){

}
public void Accountdetails(){
    System.out.println("Name of Bank: "+Bankname);
    System.out.println("Code of Bank: "+Bankcode);
    System.out.println("Balace in Bank: "+Balance);
    System.out.println("Bank Account No: "+AccountNo);
}

//    Parameterized constructor
    BankDetails(String name, String Code,int Balance, int AccNo){
        this.Bankname=name;
        this.Bankcode=Code;
        this.Balance=Balance;
        this.AccountNo=AccNo;
    }

    public static void main(String[] args) {

    }
}
