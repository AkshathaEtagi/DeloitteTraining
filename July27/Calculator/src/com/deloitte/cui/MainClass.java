package com.deloitte.cui;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Input first number");
		int var1= sc.nextInt(); //num1
		System.out.println("Input second number");
		int var2= sc.nextInt(); //num2
		System.out.println("Input choice: 0->Addition 1->Subtraction 2->Multiplication 3->Division");
		int var3=sc.nextInt();  //choice
		
		
		Arithmetic[] arr= new Arithmetic[4];
		
		arr[0]= new Addition(var1, var2);
		arr[1]= new Subtraction(var1, var2);
		arr[2]= new Multiplication(var1, var2);
		arr[3]= new Division(var1, var2);
		
		arr[var3].calculate();
		
		
		
		}

}
