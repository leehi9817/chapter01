package com.javaex.practice01;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int coin500, coin100, coin50, coin10, total;
		
		System.out.print("500�� ����: ");
		coin500 = sc.nextInt();
		
		System.out.print("100�� ����: ");
		coin100 = sc.nextInt();
		
		System.out.print("50�� ����: ");
		coin50 = sc.nextInt();
		
		System.out.print("10�� ����: ");
		coin10 = sc.nextInt();
		
		total = (coin500 * 500) + (coin100 * 100) + (coin50 * 50) + (coin10 * 10);
		
		System.out.println("������ ������ " + total + " �� �Դϴ�.");
		
		sc.close();
	}
}
