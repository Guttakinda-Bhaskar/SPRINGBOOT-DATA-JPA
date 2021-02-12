package com.example.demo.Runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.Model.Deparment;
import com.example.demo.Model.Employee;
import com.example.demo.Repo.DepartmentRepository;
import com.example.demo.Repo.EmployeeRepository;

@Component
public class MyRunners implements CommandLineRunner {
	@Autowired
	private DepartmentRepository repo1;

	@Autowired	
	private EmployeeRepository repo2;

	@Override
	public void run(String... args) throws Exception {

		Deparment deparment=new Deparment(1001,"Gofounders");
		Deparment deparment1=new Deparment(1002,"Onpassive");
		Deparment save1=repo1.save(deparment);
		Deparment save2 = repo1.save(deparment1);
		System.err.println("MyRunners.run():::"+save1+":::"+save2);
		
		Employee employee=new Employee(10, "Bhaskar", deparment);
		Employee employee1=new Employee(11, "Vinay", deparment);
		Employee employee2=new Employee(12, "Kanchi", deparment);
		
		Employee employee3=new Employee(13, "saujith", deparment1);
		Employee employee4=new Employee(14, "Tanmoy", deparment1);
		Employee employee5=new Employee(15, "Bappa", deparment1);
		
		repo2.save(employee);
		repo2.save(employee1);
		repo2.save(employee2);
		repo2.save(employee3);
		repo2.save(employee4);
		Employee save = repo2.save(employee5);
		System.out.println("MyRunners.run()"+save);
	}

}
