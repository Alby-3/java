import java.util.Scanner;
class Employee1{
	double salary,DA,HRA,salary1;
	Employee1(double salary,double DA,double HRA)
	{
		this.salary=salary;
		this.DA=DA;
		this.HRA=HRA;
		
	}
	void display()
	{
		System.out.println("employee");
	}
	void Calculatesalary() {
		salary1=salary+salary*(DA/100)+salary*(HRA/100);
		System.out.println("gross salary="+salary1);
	}
}
class Enginner extends Employee1
{
	Enginner(double salary,double DA,double HRA){
		super(salary,DA,HRA);
	}
	void display()
	{
		super.display();
		super.Calculatesalary();
		System.out.println("Enginner");
	}
	void Calculatesalary()
	{
		System.out.println("Gross salary of the Enginners = "+salary1*2);
	}
}

public class Workers {

	public static void main(String[] args) {
double salary,DA,HRA;
Scanner Sc =new Scanner(System.in);
System.out.println("Enter the basic salary of the employee");
salary=Sc.nextDouble();
System.out.println("Enter the DA% of the employee ");
DA=Sc.nextDouble();
System.out.println("enter the HRA% of the employee");
HRA=Sc.nextDouble();
Enginner e=new Enginner(salary,DA,HRA);
e.display();
e.Calculatesalary();
Sc.close();

	}

}
