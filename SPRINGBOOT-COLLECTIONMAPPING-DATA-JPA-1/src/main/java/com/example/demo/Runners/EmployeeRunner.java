package com.example.demo.Runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.Model.Employee;
import com.example.demo.Model.Product;
import com.example.demo.Repo.EmployeeRepository;
import com.example.demo.Repo.ProductRepositroy;

@Component
public class EmployeeRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;

	@Autowired
	private ProductRepositroy repo1;

	@Override
	public void run(String... args) throws Exception {
		
		Product p1=	new Product(10, "Iphone", "Apple0", 137102.00, 278.00f);
		Product p2=new Product(11, "Iphone", "Apple1", 137102.00, 278.00f);
		Product p3=new Product(12, "Iphone", "Apple2", 137102.00, 278.00f);
		Product p4=new Product(13, "Iphone", "Apple3", 137102.00, 278.00f);
		
		Iterable<Product> save = repo1.saveAll(List.of(p1,p2,p3,p4));
		save.forEach(System.err::println);
		
		
		
		Employee employee=new Employee(101,"Bhaskar","JavaDeveloper",285.00,List.of(p1,p2));
		Employee save2 = repo.save(employee);
		System.out.println("EmployeeRunner.run()"+save2);
		
		
		
		
		
		
		/*List<Employee> list1=new ArrayList<>();
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
		*/
		
		
}
}