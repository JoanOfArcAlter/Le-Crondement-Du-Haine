package test;

import java.util.Scanner;

public class Operator {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("第一个整数:"+a);
		int b = s.nextInt();
		System.out.println("第二个整数:"+b);
		System.out.println("两数之和等于:"+(a+b));
	}
}
