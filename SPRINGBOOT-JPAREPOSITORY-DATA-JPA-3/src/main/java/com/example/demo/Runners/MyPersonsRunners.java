package com.example.demo.Runners;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.Model.Person;
import com.example.demo.Repo.PersonInfoRepo;

@Component
public class MyPersonsRunners implements CommandLineRunner {

	@Autowired
	private PersonInfoRepo personInfoRepo;

	@Override
	public void run(String... args) throws Exception {
		List<String> list=new ArrayList<String>();
		list.add("Gk");
		list.add("JK");
		list.add("RK");
		list.add("MK");

		Set<String> set=new HashSet<>();
		set.add("9999999999999");
		set.add("8888888888888");
		set.add("7777777777777");
		set.add("6666666666666");
		
		Map<String, Integer> map=new HashMap<>();
		map.put("Vinay", 269886);
		map.put("Kanchi", 4817);
		map.put("Bhaskar", 847);
		map.put("Shashank", 46856);
		map.put("Lakshmi", 65666);
		
		
		Person person=new Person(101, "bhaskar", "GuttakindaPalli", "AndhraPradesh", list, set, map);
		personInfoRepo.save(person);
	}

}
