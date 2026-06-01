package com.phoeurk.productOrdering;

public class Student{
    public int id;
    public String fname;
    public String lname;
    public String email;
    public String address;

    public Student(int id, String fname, String lname,String email, String address){
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.address = address;
    }

    public String getName(){
        return this.fname + " " + this.lname;
    }

    public String getEmail(){
        return this.email;
    }
    public String getAddress(){
        return this.address;
    }
    public int getId(){
        return this.id;
    }

    //set id students from 1-10
    public void updateName(int id, String fname, String lname) throws Exception{
        if(id>0 && id<=10){
            this.fname = fname;
            this.lname = lname;
        }else {
            throw new Exception("Error: Invalid id input!!");
        }
    }
}
