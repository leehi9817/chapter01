package com.javaex.practice01;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final double RATE = 1.609;
		double mile, km;
		
		System.out.print("������ �Է��ϼ���: ");
		mile = sc.nextDouble();
		
		km = mile * RATE;
		
		System.out.println(mile + "������ " + km + "ų�ι��� �Դϴ�.");
		
		sc.close();
	}
}
