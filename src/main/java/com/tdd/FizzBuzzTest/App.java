package com.tdd.FizzBuzzTest;


/**
 * Filter the range of int to produce FizzBuzz pattern 
 *
 */
public class App 
{
	public String[] filter(int start,int end){
		String[] result=new String[end-start+1];
		for(int i=start,k=0;i<end+1;i++,k++) {
			result[k]= i%3==0 ? "Fizz" : String.valueOf(i);
		}
		return result;
	}
}
