package com.javaex.practice01;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int salary, saving;
		
		System.out.print("������ �Է��ϼ���: ");
		
		salary = sc.nextInt();
		
		saving = salary * 12;
		
		System.out.println("10�⵿�� �ִ� ������� " + saving + "�� �Դϴ�.");
		
		sc.close();
	}
}
