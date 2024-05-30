package org.oops;

public class SelectBank extends DataP{

    public static void main(String[] args) {
        BankDetails ICIC=new BankDetails("ICIC", "ICIC00293", 544,2931222);
        ICIC.Accountdetails();
        System.out.println("\n");
        BankDetails IDFC=new BankDetails(BankName,BankCode,Balance,AccNo);
        IDFC.Accountdetails();
        System.out.println("\n");
        DataP ee=new DataP();
        BankDetails UNI=new BankDetails(ee.BankName1,ee.BankCode1,ee.Balance1,ee.AccNo1);
        UNI.Accountdetails();
        BankDetails City=new BankDetails(ee.getBankName2(),ee.getBankCode2(),ee.getBalance2(),ee.getAccNo2());
        City.Accountdetails();


    }
}
