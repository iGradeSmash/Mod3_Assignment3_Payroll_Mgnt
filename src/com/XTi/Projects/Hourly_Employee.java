package com.XTi.Projects;

public abstract class Hourly_Employee extends Employee {
    private double Wage;
    private double Hours;

    public Hourly_Employee(String firstname, String lastname, String socialsecuritynum, double Wage, double Hours) {
        super(firstname, lastname, socialsecuritynum);

        if (Wage < 0.0)
            throw new IllegalArgumentException("Hourly Should Be <= 0.0");

        if (Hours < 0.0 || (Hours > 168.0))
            throw new IllegalArgumentException("Hours Worked Should Be >= 0.0 and <= 168.0");

        this.Wage = Wage;
        this.Hours = Hours;
    }

    public void setWage(double wage)
    {
        if (Wage < 0.0)
            throw new IllegalArgumentException("Hourly Wage Should Be >= 0.0");
        this.Wage = wage;
    }

    public double getWage() {
        return Wage;
    }
    public void setHours(double Hours)
    {
        if (Hours < 0.0 || (Hours > 168.0))
            throw new IllegalArgumentException("Hours Worked Should Be >= 0.0 and <=168.0");
        this.Hours = Hours;
    }

    public double getHours() {
        return Hours;
    }

    @Override
    public String toString(){
        return String.format("Hourly Employee: %s%n%s: $%, .2f: %s: %, .2f",super.toString(),
                "Hourly Wage", getWage(), "Hours Worked", getHours());
    }
}

