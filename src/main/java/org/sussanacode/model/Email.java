package org.sussanacode.model;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private String alternativeEmail;


    private final int defaultPassowrdLength = 8;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        //call department method
        this.department = setDepartment();


        //generated email
        this.email = this.firstName.toLowerCase() + this.lastName.toLowerCase()+"@" + this.department.toLowerCase()+".com.org";

        //set password
        this.password = randomPassword(defaultPassowrdLength);
        //System.out.println("your password is: " + this.password);

    }

    //Ask for department
    public String setDepartment() {
        //department choices
        System.out.println("Department code; \n1 for Business\n2. for I.T\n3. for Accounting\n1 for none\nEnter department code: ");

        Scanner scanner = new Scanner(System.in);
        int deptChoice = scanner.nextInt();
        if(deptChoice == 1){return "Business";}
        else if(deptChoice == 2){return "I.T";}
        else if(deptChoice == 3){return "Accounting";}
        else {return "";}

    }

    //generate generic password
    private String randomPassword(int length){

        String setPassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for(int i=0; i<length; i++){
            int randPass = (int) (Math.random() * setPassword.length());
            password[i] = setPassword.charAt(randPass);
        }
        return new String(password);

    }


    public String getAlternativeEmail(){return alternativeEmail;}

    //set mailbox capacity
    public void setAlternativeEmail(String altEmail){
        this.alternativeEmail = altEmail;
    }

    public String getPassword(){return password;}

    public void changePassword(String password){
        this.password = password;
    }


    public int getMailboxCapacity(){return mailboxCapacity;}



    public String displayEmpInfo(){

        return "Employee Name: " +firstName+ " " +lastName+
                "\nEmployee Email: " +email+
                "\nEmployee Generic Password: " +password;

    }





}
