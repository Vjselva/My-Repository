

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeMain2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Employee2> employee = new ArrayList<>(); 
		  
		  String str="";
		  int empId=001;
		  int ch1;
		  do{
				Employee2 emp=new Employee2();;
				System.out.println("Enter employee Name Age Salary & Address: ");
				str=sc.nextLine();
				String[] names = str.split(" ");
				if(names.length>1)
				{
					
						emp.setEmpId(empId++);
						emp.setName(names[0]);
						emp.setAge(Integer.parseInt(names[1]));
						emp.setSalary(Long.parseLong(names[2]));
						emp.setAddress(names[3]);
						employee.add(emp);
						
				}
				System.out.println("If you want to continue press 1. ");	
				ch1=sc.nextInt();
				
			}while(ch1==1);
		    
		   System.out.println("YOUR DETAILS");
		  for(Employee2 obj:employee) 
		  { 
			  System.out.println("|------------------------------|");
			  System.out.println("|Name   |"+obj.getName());     
			  System.out.println("|EmpID  |"+obj.getEmpId());
			  System.out.println("|Age    |"+obj.getAge());
			  System.out.println("|Salary |"+obj.getSalary());
			  System.out.println("|Address|"+obj.getAddress());
			  System.out.println("|------------------------------|");
		  }
		  
		  System.out.println("\n\nSearching details");
		  System.out.println("1.By Name");
		  System.out.println("2.By ID");
		  int choice=sc.nextInt();
		  switch(choice)
		  {
		  case 1:
			  System.out.println("Enter Employee Name:  ");
			  String Fname=sc.next(); 
			  for(Employee2 obj:employee) 
			  {
				  if(obj.getName().equals(Fname)) 
				  { 
					  System.out.println(obj.toString());
				  }
		      }
			  break;
		  case 2:
			  System.out.println("Enter Employee ID:  ");
			  int EID=sc.nextInt(); 
			  for(Employee2 obj:employee) 
			  {
				  if(obj.getEmpId()==(EID)) 
				  { 
					  System.out.println(obj.toString());
				  } 
			  }
			  break;
		  default:
			  System.out.println("Thanks for Registering this portal");
		  
		 
		  }
		  sc.close();
	}

}
