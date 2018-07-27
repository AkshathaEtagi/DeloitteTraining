package com.deloitte.cui;

public class Subtraction extends Arithmetic {

	public Subtraction(int var1, int var2) {
		// TODO Auto-generated constructor stub
		this.num1= var1;
		this.num2=var2;
	}

	@Override
	void calculate() {
		// TODO Auto-generated method stub
		num3= num1-num2;
		System.out.println("Subtraction of" +num1+ " and " +num2+ " = " +num3);

	}

}
