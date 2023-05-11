package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.EmpDao;
import com.spring.orm.entities.Emp;


public class EmpTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context=
				new ClassPathXmlApplicationContext("EmpConfig.xml");
		
		EmpDao empDao = context.getBean("empDaoImpl",EmpDao.class);
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		boolean go=true;
		while(go)
		{
			System.out.println("Press 1 for insert new Emp");
			System.out.println("Press 2 for display all Emp");
			System.out.println("Press 3 for display single Emp");
			System.out.println("Press 4 for delete Emp");
			System.out.println("Press 5 for update Emp");
			System.out.println("Press 6 for Exit");
			
			try
			{
				int input = Integer.parseInt(br.readLine());
				
				switch(input)
				{
					case 1 :
						//insert new Emp
						
						System.out.println("Enter id");
						int id = Integer.parseInt(br.readLine());
						
						System.out.println("Enter name");
						String name = br.readLine();
						
						System.out.println("Enter salary");
						int salary = Integer.parseInt(br.readLine());
						
						Emp emp=new Emp(id,name,salary);
						int i = empDao.insertEmp(emp);
						System.out.println(i+" record is inserted in Emp table");
						
						System.out.println("----------------------------------------");
						System.out.println();
						
						break;
						
					case 2 :
						//display all Emp
						
						List<Emp> listEmp = empDao.selectAllEmp(); 
						for(Emp e : listEmp) 
						{
						  System.out.println(e); 
						  System.out.println("___________________________________________");
						}
						
						System.out.println("---------------------------------------------");
						System.out.println();
						
						break;
						
					case 3 :
						//display single Emp
						
						System.out.println("Enter id");
						int empId = Integer.parseInt(br.readLine());
						
						Emp e = empDao.selectEmp(empId); 
						System.out.println(e);
						
						System.out.println("--------------------------------------------");
						System.out.println();
						
						break;
						
					case 4 :
						//delete Emp
						
						System.out.println("Enter id");
						int Id = Integer.parseInt(br.readLine());
						
						int m = empDao.deleteEmp(Id);
						System.out.println(m+" record is deleted from Emp table");
						
						System.out.println("--------------------------------------------");
						System.out.println();
						
						break;
						
					case 5 :
						//update Emp
						
						System.out.println("Enter id");
						int Idd = Integer.parseInt(br.readLine());
						
						System.out.println("Enter name");
						String ename = br.readLine();
						
						int n = empDao.updateEmp(Idd,ename);
						System.out.println(n+" record is updated in Emp table");
						
						System.out.println("--------------------------------------------");
						System.out.println();
						
						break;
						
					case 6 :
						//Exit
						go=false;
						break;
						
					default :
						System.out.println("Enter valid input");
						System.out.println("--------------------------------------------");
						System.out.println();
							
						break;
				
				}
				
			}
			catch(Exception e)
			{
				System.out.println("Invalid input.....");
				System.out.println(e);
				
			}
			
		}
		System.out.println("Thank you.......");
		
	}

}
