package com.demo;

import java.util.function.Consumer;

public class ConsumerInterfaceEx2 {

	static void printMessage(String name){  

		System.out.println("Hello "+name);  

	}  
	static void printValue(int val){  

		System.out.println(val);  
	}  


	public static void main(String[] args) {
		
		Consumer<String> consumer1 = ConsumerInterfaceEx2 :: printMessage ; 
		
		consumer1.accept("AA");
		
		Consumer<Integer> consumer2 = ConsumerInterfaceEx2 :: printValue ; 

		consumer2.accept(2);

	}

}
