package com.sri.model;

public class Main {

	public static void main(String[] args) 
	{
		Employee[] salesElist = new Employee[3];

        salesElist[0] = new Employee(101,"Raju",2000,new Address("7-8-6","MG Street", "Bangalore","Karnataka"));

        salesElist[1] = new Employee(102,"Rani",3000,new Address("1-2-3","Anna Street","Chennai","TamilNadu"));

        salesElist[2] = new Employee(103,"Ravi",1000,new Address("3-2-1","Bank Street","Hyedrbad","Telangana"));

 

 

        Employee[] marketingElist = new Employee[3];

        marketingElist[0] = new Employee(104,"Hari",2000,new Address("7-8-6","MG Street", "Bangalore","Karnataka"));

        marketingElist[1] = new Employee(105,"Hema",3000,new Address("1-2-3","Anna Street","Chennai","TamilNadu"));

        marketingElist[2] = new Employee(106,"Henry",1000,new Address("3-2-1","Bank Street","Hyedrbad","Telangana"));

 

        Employee[] developmentElist = new Employee[3];

        developmentElist[0] = new Employee(107,"Sai",2000,new Address("7-8-6","MG Street", "Bangalore","Karnataka"));

        developmentElist[1] = new Employee(108,"Shiva",3000,new Address("1-2-3","Anna Street","Chennai","TamilNadu"));

        developmentElist[2] = new Employee(109,"Satish",1000,new Address("3-2-1","Bank Street","Hyedrbad","Telangana"));

        

        

        Department[] dl = new Department[3];

        dl[0] = new Department(1,"Sales","Mumbai",salesElist);

        dl[1] = new Department(2,"Marketing","Hyderbad",marketingElist);

        dl[2] = new Department(3,"Development","Delhi",developmentElist);

        

//        Department d = new Department(10,"Sales","Mumai",elist);

        

        Organization o = new Organization("Prolifics","Hyderbad",dl);

        

        System.out.println("------------------Company Details---------------------");

        System.out.println("Comapny Name           :" + o.getOrgName());

        System.out.println("Company Location       :" + o.getLocation());

        

        for(Department d : dl) {

            System.out.println("------------------Department Details------------------");

            

            System.out.println("Department Number      :" + d.getDepartmentNo());

            System.out.println("Department Name        :" + d.getName());

            System.out.println("Department Location    :" + d.getLocation());

            System.out.println();

            System.out.println("-----Employee Details-----");

            for(Employee e :salesElist ) {

                

                System.out.println("Emplyee id     :"+e.getEmployeeId());

                System.out.println("Employee Name  :"+e.getEmployeeName());

                System.out.println("Salary         :" + e.getSalary());

//                System.out.println();

                System.out.println("---Address---");

                System.out.println("Hno     :" + e.getAddress().getHno());

                System.out.println("Street  :" + e.getAddress().getStreet());

                System.out.println("City    :" + e.getAddress().getCity());

                System.out.println("State   :" + e.getAddress().getState());

                System.out.println();

            }

        }

	}

}
