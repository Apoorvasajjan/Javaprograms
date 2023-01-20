package demo;

public class Testemployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an object
		employee employee;//creating employee variable
		employee=new employee();//initializing the employee
		employee.empName="Apoorva";
		employee.setEmpId(98);
		employee.empSalary=40000;
		employee.empAddress="bidar";
		employee.empDesignation="software testing";
		employee.mobileNo="6488686598";
		System.out.println("name of employee"+employee.empName);
		System.out.println("Id of employee"+employee.empId);
		System.out.println("salary of employee"+employee.empSalary);
		System.out.println("address of employee"+employee.empAddress);
		System.out.println("Designation of employee"+employee.empDesignation);
		System.out.println("mobileNo of employee"+employee.mobileNo);
		
		

	}

}
