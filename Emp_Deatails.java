package sample;

interface Employee{
	abstract void EmployeeDetails();
	
}
class Empid implements Employee {
	public void EmployeeDetails(){
		System.out.println("Empid:shivangipathak988@gmail.com");
	}
}

class Empname implements Employee{
	public void EmployeeDetails() {
		System.out.println("Empname:Shivangi Pathak");
	}
	
}

class EmpSal implements Employee{
	public void EmployeeDetails() {
	System.out.println("EmpSal:80000");	
	}
}

class EmpLoc implements Employee{
	public void EmployeeDetails() {
	System.out.println("EmpLoc:State-Uttar pradesh,District- Gorakhpur,Village- Sahadodar,Pincode-273413");	
	}
}

class EmpPhone implements Employee{
	public void EmployeeDetails() {
		System.out.println("EmpPhone:8853466939");	
		
	}

}


public class Emp_Deatails {

	public static void main(String[] args) {
		Empid a = new Empid();
		a.EmployeeDetails();
		Empname b = new Empname();
		b.EmployeeDetails();
        EmpSal c = new EmpSal();
        c.EmployeeDetails();
        EmpLoc d = new EmpLoc();
        d.EmployeeDetails();
        EmpPhone e = new EmpPhone();
        e.EmployeeDetails();


	}

}
