package com.example.demo.Runners;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.Model.Employee;
import com.example.demo.Repo.EmployeeRepository;

@Component
public class EmployeeRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;
	

	@Override
	public void run(String... args) throws Exception {
		
		List<Employee> list1=new ArrayList<>();
		list1.add(new Employee(101,"Bhaskar","Java-Developer",915255.00));
		list1.add(new Employee(102,"A","Java-Developer",915255.00));
		list1.add(new Employee(103,"B","Java-Developer",45.00));
		list1.add(new Employee(104,"C","Java-Developer",6875.00));
		list1.add(new Employee(105,"D","Java-Developer",544.00));
		list1.add(new Employee(106,"E","Java-Developer",3454.00));
		list1.add(new Employee(107,"F","Java-Developer",4857.00));
		list1.add(new Employee(108,"G","Java-Developer",5464.00));
		list1.add(new Employee(109,"H","Java-Developer",78778.00));
		list1.add(new Employee(1010,"J","Java-Developer",78698.00));
		
		//SaveAll
		Iterable<Employee> saveAll = repo.saveAll(list1);
		saveAll.forEach(System.err::println);
		
		//Save()-one
		Employee save = repo.save(new Employee(1010,"J","Java-Developer",78698.00));
		System.err.println("EmployeeRunner.run(save):::"+save);
		
		//count
		long count = repo.count();
		System.err.println("Employee:::count"+count);

		//normal Delete
		//repo.delete(new Employee(110,"J","Java-Developer",78698.00));
		
		//deleteAll
		//repo.deleteAll();
		
		//deleteAll-Iterable
		//repo.deleteAll(List.of(101,102,103,104,105));
		
		//deleteById
		//repo.deleteById(110);
		
		//existsById-one
		boolean existsById = repo.existsById(101);
		System.err.println("existsById:::"+existsById);
		
		//findAll-Iterable
		Iterable<Employee> findAll = repo.findAll();
		findAll.forEach(all -> System.err.println("EmployeeRunner.run(findAll):::"+all));
		
		//findById-one
		Optional<Employee> findById = repo.findById(1011);
		if(findById.isPresent())
		{
			System.err.println("EmployeeRunner.run(findById)::"+findById);
		}
		else 
		{
			System.err.println("findById:::: Hey!!! Here no matching records Available in the Database");
		}
		
		//findAllById - list
		Iterable<Employee> findAllById = repo.findAllById(List.of(101,102,103,104,105));
		findAllById.forEach(a -> System.err.println("findAllById - list"+a));
		
		
		
}
}