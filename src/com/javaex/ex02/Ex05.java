package com.javaex.ex02;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸��� �Է����ּ���");
		System.out.print("�̸�:");
		
		String name = sc.nextLine();
		
		System.out.println("���̸� �Է����ּ���");
		System.out.print("����:");
		
		int age = sc.nextInt();
		
		System.out.println("Ű�� �Է����ּ���");
		System.out.print("Ű:");
		
		double height = sc.nextDouble();
		
		System.out.println("����� �̸��� " + name + " ���̴� " + age + " Ű�� " + height + " �Դϴ�.");
		
		sc.close();
	}
}
