package com.javaex.ex02;

import java.util.Scanner;

public class Ex04_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���̸� �Է����ּ���");
		System.out.print("����:");
		
		int age = sc.nextInt();
		
		sc.nextLine();	//<--���๮�ڸ� �޾� ó��
		
		System.out.println("�̸��� �Է����ּ���");
		System.out.print("�̸�:");
		
		String name = sc.nextLine();
		
		System.out.println("����� �̸��� " + name + " ���̴� " + age + " �Դϴ�.");
		
		sc.close();
	}
}
