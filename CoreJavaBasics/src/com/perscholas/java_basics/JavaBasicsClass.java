package com.perscholas.java_basics;

public class JavaBasicsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addIntegers();
		addDoubles();
		addIntDub();
		divisInt();
		twoResultDoubleDivis();
		variableChallenge();
		constantEquation();
		calculateSalesTax();
	}
	public static void addIntegers(){
		int num1 = 5;
		int num2 = 4;
		int result = num1 + num2;
		System.out.println(result);
	}
	public static void addDoubles() {
		double num3 = 6;
		double num4 = 8;
		double result = num3 + num4;
		System.out.println(result);
	}
	public static void addIntDub() {
		int num5 = 7;
		double num6 = 3;
		double result = num5 + num6;
		System.out.println(result);
	}
	public static void divisInt() {
		int num7 = 12;
		int num8 = 2;
		int result = num7/num8;
		System.out.println(result);
	}
	public static void twoResultDoubleDivis() {
		double num9 = 18;
		double num10 = 36;
		double result = num10/num9;
		System.out.println(result);
		result = (int)result;
		System.out.println(result);
	}
	public static void variableChallenge() {
		int x = 5;
		double y = 6;
		double q = x/y;
		System.out.println(q);
		
	}
	public static void constantEquation() {
		final double THIS_IS_PI = 3.14;
		double radiusSquared = 16;
		double result = THIS_IS_PI * radiusSquared;
		System.out.println(result);
				
	}
	public static void calculateSalesTax() {
		final double SALES_TAX = 2; 
		double muffin = 1.50;
		double coffee = 4.99;
		double greenTea = 2.99;
		double order1 = (3* muffin) + (4* coffee) + (2* greenTea);
		double subTotal = order1;
		double totalSale= order1 + SALES_TAX;
		System.out.println(totalSale);
		
	}
}
