package com.XTi.Projects;

public abstract class Commission_Employee extends Employee{
    double GrossSales;
    double CommissionRate;

    public Commission_Employee(String firstname, String lastname, String socialsecuritynum,
                               double GrossSales, double CommissionRate) {
        super(firstname, lastname, socialsecuritynum);

        if ((CommissionRate <= 0.0) || (CommissionRate >= 1.0))
        throw new IllegalArgumentException("Commission Rate Should Be > 0.0 and < 1.0");

        if (GrossSales < 0.0)
        throw new IllegalArgumentException("Sales Should Be >= 0.0");

        this.CommissionRate = CommissionRate;
        this.GrossSales = GrossSales;
    }
    public void setGrossSales(double grossSales){
        if (GrossSales < 0.0)
            throw new IllegalArgumentException("Sales Should Be >= 0.0");

        this.GrossSales = GrossSales;
    }
    public double getGrossSales()
    {
       return GrossSales;
    }

    public void setCommissionRate(double commissionRate) {
        if (CommissionRate <= 0.0 || (CommissionRate >= 1.0))
        throw new IllegalArgumentException("Commission Rate Should Be > 0.0 and < 1.0");
        this.CommissionRate = CommissionRate;
    }

    public double getCommissionRate() {
        return CommissionRate;
    }

    @Override
    public double earnings()
    {
        return getCommissionRate() * getGrossSales();
    }
    @Override
    public String toString()
    {
        return String.format("%s: %s%n%s: $%, .2f; %s: %.2f", "Commission Employee",
                super.toString(), "Gross Sales",getGrossSales(),"Commission Rate", getCommissionRate());
    }
}
