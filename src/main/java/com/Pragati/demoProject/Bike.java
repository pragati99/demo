package com.Pragati.demoProject;

import org.springframework.stereotype.Component;

@Component
public class Bike  implements Vehicle {
	
	public void drive()
	{
		System.out.print("Bike is riding");
	}

}
