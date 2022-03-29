package com.igradedesignz.LearnJava;

public abstract class Employee implements Payable {
    private String Firstname;
    private String Lastname;
    private String SocialSecurityNum;


    public Employee(String firstname, String lastname, String socialsecuritynum){
        this.Firstname = firstname;
        this.Lastname = lastname;
        this.SocialSecurityNum = socialsecuritynum;

    }
    public String getFirstname()
    {
        return Firstname;
    }

    public String getLastname()
    {
        return Lastname;
    }
    public String getSocialSecurityNum()
    {
        return SocialSecurityNum;
    }

    @Override
    public String toString()
    {
        return String.format("%s %s%nSocial Security Number: %s", getFirstname(), getLastname(), getSocialSecurityNum());
    }

    public abstract double earnings();

}
