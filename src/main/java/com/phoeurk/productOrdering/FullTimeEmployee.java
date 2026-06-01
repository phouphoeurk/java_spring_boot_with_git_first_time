package com.phoeurk.productOrdering;

public class FullTimeEmployee implements Employee{
    private double baseSalary;

//    public FullTimeEmployee(double baseSalary){
//        this.baseSalary = baseSalary;
//    }

    //setter
    public void setBaseSalary(double baseSalary){
        if(baseSalary > 0){
            this.baseSalary = baseSalary;
        }else throw new InvalidSalaryException("The base salary must be positive");
    }


    //Override method / getter
    @Override
    public double calculateSalary(){
        return baseSalary;
    }



}
