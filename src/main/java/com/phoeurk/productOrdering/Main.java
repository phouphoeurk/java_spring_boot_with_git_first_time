package com.phoeurk.productOrdering;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws IllegalAccessException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Bank dep = new Bank();
        dep.desposit(230.20);
        System.out.println("The amount in your bank: $" + dep.getBalance());



        PaymentMethod payment1 = new AclidaPayment();
        PaymentMethod payment2 = new ABAPayment();

        payment1.processPayment(200);
        payment2.processPayment(300);

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        fullTimeEmployee.setBaseSalary(350);
        System.out.println("The base salary of full time employee is $" + fullTimeEmployee.calculateSalary());

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
        partTimeEmployee.setHourlyRate(10);
        partTimeEmployee.setHoursWorked(8);
        System.out.println("The salary of part time employee is $" + partTimeEmployee.calculateSalary());


        FullTimeEmployee newEmp1 = new FullTimeEmployee();
        FullTimeEmployee newEmp2 = new FullTimeEmployee();
        FullTimeEmployee newEmp3 = new FullTimeEmployee();
        FullTimeEmployee newEmp4 = new FullTimeEmployee();
        FullTimeEmployee newEmp5 = new FullTimeEmployee();
        FullTimeEmployee newEmp6 = new FullTimeEmployee();
        FullTimeEmployee newEmp7 = new FullTimeEmployee();
        FullTimeEmployee newEmp8 = new FullTimeEmployee();
        FullTimeEmployee newEmp9 = new FullTimeEmployee();

        newEmp1.setBaseSalary(400);
        newEmp2.setBaseSalary(220);
        newEmp3.setBaseSalary(210);
        newEmp4.setBaseSalary(370);
        newEmp5.setBaseSalary(600);
        newEmp6.setBaseSalary(100);
        newEmp7.setBaseSalary(120);
        newEmp8.setBaseSalary(430);
        newEmp9.setBaseSalary(450);

        PartTimeEmployee newPEmp1 = new PartTimeEmployee();
        PartTimeEmployee newPEmp2 = new PartTimeEmployee();
        PartTimeEmployee newPEmp3 = new PartTimeEmployee();
        PartTimeEmployee newPEmp4 = new PartTimeEmployee();
        PartTimeEmployee newPEmp5 = new PartTimeEmployee();
        PartTimeEmployee newPEmp6 = new PartTimeEmployee();
        PartTimeEmployee newPEmp7 = new PartTimeEmployee();
        PartTimeEmployee newPEmp8 = new PartTimeEmployee();
        PartTimeEmployee newPEmp9 = new PartTimeEmployee();

        newPEmp1.setHourlyRate(5);
        newPEmp1.setHoursWorked(4);

        newPEmp2.setHourlyRate(6);
        newPEmp2.setHoursWorked(4);

        newPEmp3.setHourlyRate(10);
        newPEmp3.setHoursWorked(4);

        newPEmp4.setHourlyRate(11);
        newPEmp4.setHoursWorked(4);

        newPEmp5.setHourlyRate(7);
        newPEmp5.setHoursWorked(4);

        newPEmp6.setHourlyRate(2);
        newPEmp6.setHoursWorked(4);

        newPEmp7.setHourlyRate(5);
        newPEmp7.setHoursWorked(4);

        newPEmp8.setHourlyRate(5);
        newPEmp8.setHoursWorked(6);

        newPEmp9.setHourlyRate(5);
        newPEmp9.setHoursWorked(7);






        List<Employee> stuffList = new ArrayList<>();
        stuffList.add(partTimeEmployee);
        stuffList.add(fullTimeEmployee);
        stuffList.add(newEmp1);
        stuffList.add(newEmp2);
        stuffList.add(newEmp3);
        stuffList.add(newEmp4);
        stuffList.add(newEmp5);
        stuffList.add(newEmp6);
        stuffList.add(newEmp7);
        stuffList.add(newEmp8);
        stuffList.add(newEmp9);


        Map<String, Employee> stuffMap = new HashMap();
        stuffMap.put("EM001", fullTimeEmployee);
        stuffMap.put("EM002", partTimeEmployee);
        stuffMap.put("EM003", newPEmp1);
        stuffMap.put("EM004", newPEmp2);
        stuffMap.put("EM005", newPEmp3);
        stuffMap.put("EM006", newPEmp4);
        stuffMap.put("EM007", newPEmp5);
        stuffMap.put("EM008", newPEmp6);
        stuffMap.put("EM009", newPEmp7);
        stuffMap.put("EM010", newPEmp8);
        stuffMap.put("EM011", newPEmp9);



        double totalSalaryOfStuffList = 0;
        for(Employee emp: stuffList){
            System.out.println("Employee salary: $" + emp.calculateSalary());
            totalSalaryOfStuffList += emp.calculateSalary();
        }
        System.out.println("Total salary of employee(stuff list) : $"+ totalSalaryOfStuffList);


        double totalSalaryOfStuffMap = 0;
        for(Map.Entry<String, Employee> emp: stuffMap.entrySet()){
            System.out.println("Empoyee ID: " + emp.getKey() + "\tEmployee Salary: $" + emp.getValue().calculateSalary());
            totalSalaryOfStuffMap += emp.getValue().calculateSalary();
        }
        System.out.println("Total salary of employee(stuff Map) : $"+ totalSalaryOfStuffMap) ;


        //Lamda expression(->) && Stream API
        //calculate total salary in stuffList
        double totalL = stuffList.stream()
                .mapToDouble(emp -> emp.calculateSalary())
                .sum();
        System.out.println("Total salary(Stream API + Lamda Expression): $" + totalL);




        //calculate number of employee who has salary lower than 300
        double numberSalaryLowerThan300 = stuffList.stream()
                .filter(emp -> emp.calculateSalary() < 300)
                .count();
        System.out.println("Number of employee who has salary lower than 300$  is : " + numberSalaryLowerThan300);
        System.out.println("==============================< Detail about employee salary >============================");
        //showing salary each employee using forEach
        stuffList.forEach(e -> System.out.println("Salary: " +e.calculateSalary()));



        System.out.println("\n");

        //create list of employee who has salary more than 300$ and show their salary
        List<Employee> newList = stuffList.stream()
                .filter(emp -> emp.calculateSalary() > 300)
                .toList();
        newList.forEach(e-> System.out.println("Employee salary: " + e.calculateSalary()));

        //.map() & .collect() of STREAM API
        List<String> studentNameInDorm = List.of("Phou Phoeurk", "Pho Pov", "Tep Makhon", "Toch Vy",
                "Bros Rotha", "Vert Hengleap","Keo Sophanny", "Poleak Jirehvichea", "Poleak Jirehvisot");
        List<String> upperNames =
                studentNameInDorm.stream()
                                 .map(name -> "Student: " + name.toUpperCase())
                                 .collect(Collectors.toList());//java version8 can use toList() instead
        upperNames.forEach(System.out::println);




        PartTimeEmployee testException = new PartTimeEmployee();
        try{
            testException.setHourlyRate(15);
            testException.setHoursWorked(-8);
        }catch (InvalidWokHoursException e){
            System.out.println("Error: Invalid data input!!: "+e.getMessage());
        }


        try {
            System.out.println("Connecting to database....");
            int invalid = 10/0; //error
        }catch (ArithmeticException e){
            System.out.println("Error : " + e.getMessage());
        }finally {// this block alway run
            System.out.println("Database was closing....");
        }




        OrderSystem order = new OrderSystem();
        try{
            order.checkStock(-5);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Transaction Finished.");
        }



        List<Student> studentsList = List.of(
                new Student(1, "Phou", "Phoeurk", "phouphoeurk@gmail.com", "Takeo"),
                new Student(2,"Tep", "Makhon", "tepmakhon@gmail.com","Takeo"),
                new Student(3,"Keo", "Sophanny", "phanny@123gmail.com","Bonteay Meanjey")
        );

        //ស្វែងរកនិស្សិតមកពីខេត្តតាកែវ
        List<Student> takeoStudents = studentsList
                .stream()
                .filter(adr -> Objects.equals(adr.address, "Takeo"))
                .toList();
        takeoStudents.forEach(e -> System.out.println("ID: " + e.id + "\tName: " + e.fname + " " + e.lname));

        //ស្សិតមកពីខេត្តបន្ទាយមានជ័យ
        List<String> allStuNames = studentsList
                .stream()
                .map(Student::getName)
                .collect(Collectors.toList());
        allStuNames.forEach(System.out::println);


        var product = new ProductRecord("Dell Precession 5500", 810);
        System.out.println("Class: " + product.toString() + "\nProduct Name: " + product.name() + "\nPrice: $" + product.name());

        var department = new Department("IT","Building B");
        System.out.println(department.location());







    }
}


