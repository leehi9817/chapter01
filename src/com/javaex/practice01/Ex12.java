package com.javaex.practice01;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final double PI = 3.14;
		double area, radius;
		
		System.out.print("�������� �Է��ϼ���: ");
		
		radius = sc.nextDouble();
		
		area = radius * radius * PI;
		
		System.out.println("���� ���̴� " + area);
		
		sc.close();
	}
}
