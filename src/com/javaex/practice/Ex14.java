package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double h, v, area, round;
		
		System.out.print("���θ� �Է��ϼ���: ");
		h = sc.nextDouble();
		
		System.out.print("���θ� �Է��ϼ���: ");
		v = sc.nextDouble();
		
		area = h * v;
		round = 2 * (h + v);
		
		System.out.println("�簢���� ���̴� " + area);
		System.out.println("�簢���� �ѷ��� " + round);
		
		sc.close();
	}
}
