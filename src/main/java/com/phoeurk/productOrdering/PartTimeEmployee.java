package com.phoeurk.productOrdering;

public class PartTimeEmployee implements Employee{
    private double hourlyRate;
    private double hoursWorked;

//    public PartTimeEmployee(double hourlyRate, double hoursWorked){
//        this.hourlyRate = hourlyRate;
//        this.hoursWorked = hoursWorked;
//    }


    //throw mean throw new object contain error message to screen suddenly

    //setter
    public void setHourlyRate(double hourlyRate){
        if(hourlyRate > 0){
            this.hourlyRate = hourlyRate;
        }else throw new IllegalArgumentException("The hourly rate must be positive");
    }
    public void setHoursWorked(double hoursWorked){
        if(hoursWorked > 0){
            this.hoursWorked = hoursWorked;
        }else throw  new InvalidWokHoursException("The hourly worked must be positive");
    }
    
    @Override
    public double calculateSalary(){
        return hourlyRate * hoursWorked;
    }
}
