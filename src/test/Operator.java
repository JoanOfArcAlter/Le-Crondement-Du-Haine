package test;

import java.util.Scanner;

public class Operator {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("��һ������:"+a);
		int b = s.nextInt();
		System.out.println("�ڶ�������:"+b);
		System.out.println("����֮�͵���:"+(a+b));
	}
}
