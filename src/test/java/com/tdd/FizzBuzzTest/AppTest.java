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
	
	@Test
	public void shouldChangedValuesWhichAreDivisibleBy5toBuzz() {
		String[] expectedList= {"4","Buzz","Fizz","7"};
		assertArrayEquals(expectedList,obj.filter(4, 7));
	}
	
	@Test
	public void shouldChangedValuesWhichAreDivisibleBy3and5toFizzBuzz() {
		String[] expectedList= {"14","FizzBuzz","16","17","Fizz"};
		assertArrayEquals(expectedList,obj.filter(14, 18));
	}
	
}
