package com.javaex.practice01;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final double RATE = 1230.95;
		double kor, dollar;
		
		System.out.print("ȯ���� ��ȭ�� �Է��ϼ���: ");
		
		kor = sc.nextDouble();
		
		dollar = kor / RATE;
		
		System.out.println("������ �޷��� " + dollar);
		
		
		sc.close();
	}
}
