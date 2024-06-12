package com.spring.jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.entities.Student;
import com.spring.queries.QueryClass;
 class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program started..........." );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        QueryClass template=context.getBean("qc",QueryClass.class);
        Student st=new Student();
        int choice;
        Scanner sc=new Scanner(System.in);
//        st.setId(5);
//        st.setName("Bibek");
//        st.setCity("Kathmandu");
//        
//        System.out.println("Inserted:"+template.insert(st)+" record");
        //Insert query
//        String query="Insert into student values (?,?,?)";
//        
//        // fire query
//        int result=template.update(query,3,"Harish","Belauri");
//        System.out.println("Number of rows affected:"+result);
        
        do {
        	System.out.println("Enter your choice:");
        	System.out.println("/**************************************************************");
        	System.out.println("1.Insert into database:");
        	System.out.println("2.Update record:");
        	System.out.println("3.Delete record");
        	System.out.println("4.Show specific student");
        	System.out.println("5.Show All students");
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
        		st.setCity(sc.nextLine());
        		System.out.println("Inserted records:"+template.insert(st));
        		break;
        	case 2:
        		System.out.println("Enter id:");
        		st.setId(sc.nextInt());
        		sc.nextLine();
        		System.out.println("Enter name:");
        		st.setName(sc.nextLine());
        		System.out.println("Enter city");
        		st.setCity(sc.nextLine());
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
        		System.out.println("Record of student is::"+template.getStudent(st.getId()));
        		break;
        		
        	case 5:
        		List<Student> students=template.getAllStudents();
        		for(Student s:students) {
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

