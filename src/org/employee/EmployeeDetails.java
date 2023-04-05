package org.employee;


public class EmployeeDetails {
	
	private void empName() {
		// Business logic
		System.out.println("Employee name: anand");
	}
	
	private void empMobile() {
		System.out.println("Employee mobile: 8939278836");
	}
	
	private void empID() {
		System.out.println("Employee id: 111");
	}
	
	private void empStatus() {
		System.out.println("Working");
	}
	private void empLocation() {
		System.out.println("OMR");
	}
//<<<<<<< HEAD
//=======
//>>>>>>> fb35a4e4f9d7068a65e6c60e30ca2afd8bc3f443
	
	public static void main(String[] args) {
		
		EmployeeDetails e = new EmployeeDetails();
		
		// method call
		e.empName();
		e.empMobile();
		e.empID();
		
	}
	
	
	

}
