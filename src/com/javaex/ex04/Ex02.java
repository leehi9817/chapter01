package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int dan;
		int i = 1;
		
		System.out.println("���� �Է����ּ���");
		System.out.print("�� : ");
		dan = sc.nextInt();
		
		while(i<=9) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
			
			i++;
		}
		
		sc.close();
	}

}
