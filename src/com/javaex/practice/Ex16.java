package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final double TAX_RATE = 0.1;
		double price, receive, tax, bounce;
		
		System.out.print("��ǰ����: ");
		price = sc.nextDouble();
		
		System.out.print("������: ");
		receive = sc.nextDouble();
		
		tax = price * TAX_RATE; 
		bounce = receive - price;
		
		System.out.println("������: " + receive);
		System.out.println("��ǰ����: " + price);
		System.out.println("�ΰ���: " + tax);
		System.out.println("�ܾ�: " + bounce);
		
		sc.close();
	}
}
