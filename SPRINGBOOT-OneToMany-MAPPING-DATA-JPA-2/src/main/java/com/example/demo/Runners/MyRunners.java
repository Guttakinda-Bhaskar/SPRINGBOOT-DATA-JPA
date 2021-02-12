package com.example.demo.Runners;

import java.util.List;

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

		Employee e1=new Employee(1001,"Vinay");
		Employee e2=new Employee(1002,"Bhaskar");
		Employee e3=new Employee(1003,"Harish");
		Employee e4=new Employee(1004,"Ramu");
		Employee e5=new Employee(1005,"Rani");
		Employee e6=new Employee(1006,"Raju");
		List<Employee> saveAll = repo2.saveAll(List.of(e1,e2,e3,e4,e5,e6));
		saveAll.forEach(System.err::println);
		
		Deparment d1=new Deparment(10, "DEV",List.of(e1,e2));
		Deparment d2=new Deparment(11, "QA",List.of(e3,e4,e5,e6));
		List<Deparment> saveAll2 = repo1.saveAll(List.of(d1,d2));
		saveAll2.forEach(System.err::println);
		
		
		
		/*Employee employee=new Employee(10, "Bhaskar", deparment);
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
		System.out.println("MyRunners.run()"+save);*/
	}

}
