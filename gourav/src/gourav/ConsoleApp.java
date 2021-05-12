

package gourav;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleApp {

	static Scanner in;
	
	public static List<Employee> add() {
		
		List<Employee> empList = new ArrayList<Employee>();
		System.out.println("Enter values in Employee list");
		System.out.println("Enter number of employee to add");
		int n = in.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("Enter value : "+(i+1));
			System.out.println("Employee id");
			long id = in.nextLong();
			in.nextLine();
			System.out.println("Enter employee name");
			String name = in.nextLine();
			System.out.println("Enter employee age");
			int age = in.nextInt();
			in.nextLine();
			System.out.println("Enter employee address");
			String adress = in.nextLine();

			empList.add(new Employee(id,name,age,adress));
		}
		return empList;
	}
	
	public static Employee getById(List<Employee> empList, int id) {
		
		boolean flag = false;
		if(empList == null){
			return null;
		}
		for(Employee e : empList) {
			if(id == e.getEmpId()) {
				flag = true;
				return e;
			}
		}
		if(flag == false)
			return null;
		
		return null;
		
	}
	
	public static List<Employee> getAll(List<Employee> empList) {
		if(empList == null)
			return null;
		else
			return empList;
	}
	
	public static void delete(List<Employee> empList, int id) {
		Employee emp = getById(empList, id);
		
		if(emp == null)
			System.out.println("Employee not found");
		else {
			empList.remove(id);
			System.out.println("Employee removed successfully");
		}
	}
	
	public static void update(List<Employee> empList, int id) {
		Employee emp = getById(empList, id);
		
		if(emp == null)
			System.out.println("Employee not found");
		else {
			
			System.out.println("");

		}
	}
	public static void main(String[] args) {

		 in = new Scanner(System.in);
		 //List<Employee> empList = add();
		 List<Employee> empList = null;
		 System.out.println("1. Add ");
		 System.out.println("2. Get single employee");
		 System.out.println("3  Get all employee");
		 System.out.println("4. Update employee data");
		 System.out.println("5. Delete employee data");
		 System.out.println("Enter choice : ");
		 
		 int choice = in.nextInt();
		 switch(choice) {
		 case 1: 
			 empList = add();
			 break;
			 
		 case 2:
			 System.out.println("Enter id of employee to get details");
			 int id = in.nextInt();
			 Employee emp = getById(empList, id);
			 if(emp == null) {
				 System.out.println("No employee data present");
			 }
			 else {
				 System.out.println("EmpId /t EmpName /t EmpAge /t EmpAddress");
				 System.out.println(emp.getEmpId()+"/t"+emp.getEmpName()+"/t"+emp.getEmpAge()+"/t"+emp.getEmpAddress());
			 }
			 break;
			 
		 case 3:
			 List<Employee> employeeList = getAll(empList);
			 if(employeeList == null)
				 System.out.println("No employee data present");
			 else {
				 System.out.println("EmpId /t EmpName /t EmpAge /t EmpAddress");
				 for(Employee e : employeeList) {
					 System.out.println(e.getEmpId()+"/t"+e.getEmpName()+"/t"+e.getEmpAge()+"/t"+e.getEmpAddress());
				 }
			 }
			 break;
			 
		 case 4:
			 System.out.println("Enter id of employee to update details");
			 int employeeId = in.nextInt();
			 
		 case 5:
			 System.out.println("Enter id of employee to be deleted");
			 int empId = in.nextInt();
			 delete(empList, empId);
			 break;
			
		 }
	}

}
