package com.example.demo.Runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.example.demo.Model.CompanyDto;
import com.example.demo.Repo.CompanyRepo;

@Component
public class ComapnyRunner implements CommandLineRunner {

	@Autowired
	private CompanyRepo repo;
	@Override
	public void run(String... args) throws Exception {
		
		Iterable<CompanyDto> saveAll = repo.saveAll(List.of(
				new CompanyDto(101, "Onpassive", "HYD"),
				new CompanyDto(102, "TCS", "T"),
				new CompanyDto(103, "HCL", "A"),
				new CompanyDto(104, "IHG", "F"),
				new CompanyDto(105, "ABCD", "F"),
				new CompanyDto(106, "JKFHF", "Z"),
				new CompanyDto(107, "ABCD", "F"),
				new CompanyDto(108, "JKFHF", "Z"),
				new CompanyDto(109, "GGGG", "Z"),
				new CompanyDto(110, "MAMA", "G")
				));
		
		saveAll.forEach(System.err::println);
		
		System.out.println("-------------------------------------------");
		
		
		
		
		/*Iterable<CompanyDto> findAll = repo.findAll();
		findAll.forEach(System.err::println);*/
		
		//Sort sort=Sort.by("companyName");
		//Sort sort=Sort.by("location");
		/*Sort sort=Sort.by(Direction.ASC,"id");
		Sort sort=Sort.by(Direction.DESC,"id");
		Iterable<CompanyDto> findAll = repo.findAll(sort);
		findAll.forEach(System.err::println);*/
		
		Pageable pageable=PageRequest.of(0, 2);
		Page<CompanyDto> findAll = repo.findAll(pageable);
		List<CompanyDto> content = findAll.getContent();
		content.forEach(x -> System.err.println("ComapnyRunner.run()"+x));
			
	}

}
