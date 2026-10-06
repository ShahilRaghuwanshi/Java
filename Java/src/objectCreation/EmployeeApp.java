package objectCreation;

public class EmployeeApp {
public static void main(String[] args) {
	//next line creates employee object
	Employee e1=new Employee();
	//next three lines access member function
	e1.work();
	e1.eat();
	e1.sleep();
	
	//next four lines will give value to data members of employee object
	e1.name="sohna";
	e1.id=123;
	e1.salary=90000;
	e1.company="google";
	
	//next four lines will print the values of data members of employee object
	System.out.println(e1.salary);
	System.out.println(e1.name);
	System.out.println(e1.id);
	System.out.println(e1.company);
}
}
