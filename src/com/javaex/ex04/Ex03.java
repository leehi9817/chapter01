package com.javaex.ex04;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		int dan;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է��ϼ���");
		System.out.print("�� : ");
		
		dan = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
		
		sc.close();

	}

}
