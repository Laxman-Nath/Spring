package com.spring.crud;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.entities.Employee;
import com.spring.entities.Student;
import com.spring.queries.QueryClass;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig2.class);
        QueryClass template=context.getBean("queryClass",QueryClass.class);
        Employee st=new Employee();
        int choice;
        Scanner sc=new Scanner(System.in);
        do {
        	System.out.println("Enter your choice:");
        	System.out.println("/**************************************************************");
        	System.out.println("1.Insert into database:");
        	System.out.println("2.Update record:");
        	System.out.println("3.Delete record");
        	System.out.println("4.Show specific Employee");
        	System.out.println("5.Show All Employees");
        	System.out.println("6.Exit");
        	System.out.println("*****************************************************************/");
        	choice=sc.nextInt();
        	
        	switch(choice) {
        	case 1:
        		System.out.println("Enter id:");
        		st.setId(sc.nextInt());
        		sc.nextLine();
        		System.out.println("Enter name:");
        		st.setName(sc.nextLine());
        		System.out.println("Enter city");
        		st.setAddress(sc.nextLine());
        		System.out.println("Inserted records:"+template.insert(st));
        		break;
        	case 2:
        		System.out.println("Enter id:");
        		st.setId(sc.nextInt());
        		sc.nextLine();
        		System.out.println("Enter name:");
        		st.setName(sc.nextLine());
        		System.out.println("Enter city");
        		st.setAddress(sc.nextLine());
        		System.out.println("Updated records:"+template.update(st));
        		break;
        		
        	case 3:
        		System.out.println("Enter id:");
        		st.setId(sc.nextInt());
        		System.out.println("Records Deleted:"+template.delete(st.getId()));
        		break;
        	case 4:
        		System.out.println("Enter id:");
        		st.setId(sc.nextInt());
        		System.out.println("Record of employee is::"+template.getStudent(st.getId()));
        		break;
        		
        	case 5:
        		List<Employee> employees=template.getAllEmployees();
        		for(Employee s:employees) {
        			System.out.println(s);
        		}
        		break;
        	case 6:
        		System.out.println("Thanks for using the database:");
        		System.exit(0);
//        		
        	default:
        		System.out.println("Invalid input:");
        	}
        
        		
        }while(true);
        
      
    }
}
