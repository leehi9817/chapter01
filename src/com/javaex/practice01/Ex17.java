package com.javaex.practice01;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final double PI = 3.14;
		double v, r;
		
		System.out.print("������: ");
		r = sc.nextDouble();
		
		v = r * r * r * PI * 4/3;
		
		System.out.println("���Ǻ��Ǵ�: " + v);
		
		sc.close();
	}
}
