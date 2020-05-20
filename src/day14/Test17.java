package day14;

import java.util.Scanner;

class Calculator{
	public  void modCalc(int su1, int su2) {
		System.out.println(su1 + "  % " + su2 + " = " + su1%su2);
	}
}

class Money extends Calculator{
	public void modCalc(int money, int bundle) {
		System.out.println(money / bundle + " ¹­À½");
		System.out.println(money % bundle + " ³ª¸ÓÁö°³¼ö");
	}
}
public class Test17 {

	public static void main(String[] args) {
		
		Calculator ca = new Calculator();
		ca.modCalc(10, 3);
		
		Scanner input = new Scanner(System.in);
		System.out.print("µ· ÀÔ·Â : ");
		int money = input.nextInt();
		System.out.print("¹­À» µ· ÀÔ·Â : ");
		int bundle = input.nextInt();
		
		Money mo = new Money();
		mo.modCalc(money, bundle);
	}

}
