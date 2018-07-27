package com.deloitte.cui;

public class Division extends Arithmetic {

	public Division(int var1, int var2) {
		// TODO Auto-generated constructor stub
		this.num1=var1;
		this.num2=var2;
	}

	@Override
	void calculate() {
		// TODO Auto-generated method stub
		double val3=0;
		try {
		//	double val3;
			val3= (double)num1/num2;
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("Division by zero");
		}
		System.out.println("Division of" +num1+ " and " +num2+ " = " +val3);

	}

}
