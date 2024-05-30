package org.InterviewQ;
import java.util.Scanner;

public class Gmailrgex {
    public static void main(String[] args) {
        String Email;

        Scanner nw=new Scanner(System.in);
        System.out.println("Enter your Email");
        Email=nw.nextLine();
        int ind=Email.indexOf("@");
        String userN=Email.substring(0, ind);
        String domain=Email.substring(ind+1, Email.length());
        String DOM="Gmail.com";


        if (Email.matches(".{2,40}[@]{1}[a-zA-Z]{2,30}[.]{1}[a-zA-Z]{2,10}")) {

            System.out.println("Email ID is Valid");

            if(Email.contains("gmail")||Email.contains("Yahoo")) {
                System.out.println("Domain is: "+domain);
                if(domain.equalsIgnoreCase(DOM)){
                    System.out.println("Gmail");
                }else {
                    System.out.println("other than local");
                }
            }else {
                System.out.println("NOK");
            }
        }else {
            System.out.println("Not-Match");
        }
    }
    }

