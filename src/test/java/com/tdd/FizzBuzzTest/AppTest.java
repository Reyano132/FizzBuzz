package com.tdd.FizzBuzzTest;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class AppTest {

	private App obj;
	
	@Before
	public void createObject() {
		obj=new App();
	}
	
	@Test
	public void shouldChangedValuesWhichAreDivisibleBy3toFizz() {
		String[] expectedList= {"2","Fizz","4"};
		assertArrayEquals(expectedList,obj.filter(2, 4));
	}
	
}
