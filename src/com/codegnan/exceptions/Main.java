package com.codegnan.exceptions;

public class Main {

	public static void main(String[] args) {
		try {
			System.out.println("Statement1");
			System.out.println(10/0);
			System.out.println("Statement3");
			//System.out.println(10/0);
		}catch(NullPointException e) {
			System.out.println("Statement4");

		}finally {
		System.out.println("Statement5");
		System.out.println("Statement6");

		
	}

	}
}

