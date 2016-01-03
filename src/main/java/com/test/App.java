package com.test;


class A {

	int i, j;

	void showij() {

		System.out.println("i and j:" + i +" "+j);

	}

}

class B extends A

{

	int k;

	void showk()

	{

		System.out.println("k: "+ k);

	}

	void sum() {

		System.out.println("i + j + k:" + (i + j + k));

	}

}  

class App {

	public static void main(String args[]) 

	{     

		B subob = new B();

		subob.i = 5;

		subob.j = 6;

		subob.k = 9;

		System.out.println("The contents are");

		subob.showk();

		subob.sum();

	}

}
