package com.deloitte.cui;

public class Addition extends Arithmetic {

	public Addition(int var1, int var2) {
		// TODO Auto-generated constructor stub
		this.num1=var1;
		this.num2=var2;
	}

	@Override
	void calculate() {
		num3= num1+num2;
		System.out.println("Addition of" +num1+ " and " +num2+ " = " +num3);

	}

}
