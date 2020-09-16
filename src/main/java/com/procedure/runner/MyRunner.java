package com.procedure.runner;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.procedure.repository.EmployeeRepository;

@Component
public class MyRunner implements CommandLineRunner {
	 @Autowired
	 EmployeeRepository empRepo;

	@Override
	public void run(String... args) throws Exception {
		Map<String,Object> output= empRepo.readBonus(7525);
		System.out.println("Name = "+output.get("empname"));
		System.out.println("Bonus= "+output.get("bonus").toString());
		//System.out.println(output);

	}

}
