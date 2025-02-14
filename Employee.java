package learning.oops;

public class Employee {
String name; //instance variables
double salary;//global variable

void setEmployee(String nam,double sal) {   //nam and sal  they are formal parameter
	name=nam;
	salary=sal;
	
}

void employeeDetails()
{
	System.out.println("Employee Name is "+name);
	System.out.println("Employee Salary is "+salary);
	
}

void grossSal()
{
	double pf=salary*.12; //12% of the salary
	double hra=salary*.10; //10% of the salary
	double da=salary*.05;
	double gross=(salary+hra+da)-pf;
	
	System.out.println("Gross salary of "+name+ " is "+gross);
	
}

public static void main(String[] args) {
	Employee e=new Employee();
	//new keyword is used for dynamic memory allocation  
	// e is a reference variable of a class
    
	System.out.println("Employee Name is "+e.name);
	System.out.println("Employee Salary is "+e.salary);
	
	
	

	
;
	
System.out.println("------------After callling mathod -----------");
	
	e.setEmployee("Prakhar", 400000.0);//calling 
	e.employeeDetails(); //calling by instance
	e.grossSal();
	
	Employee e1;
	e1=new Employee();
	
	System.out.println("Employee Name is "+e1.name);
	System.out.println("Employee Salary is "+e1.salary);
	
System.out.println("------------After callling mathod -----------");
	
	
	e1.setEmployee("Ayush", 750000);
	e1.employeeDetails();
	
	
	e1.grossSal();
	
}
}
