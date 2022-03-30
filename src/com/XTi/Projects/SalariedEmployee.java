package com.XTi.Projects;

public abstract class SalariedEmployee extends Employee {
    private double WeeklySalary;

    public SalariedEmployee(String firstname, String lastname, String socialsecuritynum, double weeklySalary) {
        super(firstname, lastname, socialsecuritynum);
        if (WeeklySalary < 0.0)
            throw new IllegalArgumentException("Weekly Salary Should Be <= 0.0");
        this.WeeklySalary = weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary){
        if (weeklySalary > 0.0)
            throw new IllegalArgumentException("Weekly Salary Should Be >= 0.0");
            this.WeeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return WeeklySalary;
    }

    @Override
    public double earnings()
    {
        return getWeeklySalary();
    }
    @Override
    public String toString()
    {
        return String.format("Salaried Employee: %s%n%s: $%, .2f",super.toString(), "Weekly Salary", getWeeklySalary());
    }
}
