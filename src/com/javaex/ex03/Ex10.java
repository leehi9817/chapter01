package com.javaex.ex03;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int code;
		
		System.out.println("������ �����ϼ���");
		System.out.println("(1.�ڹ� 2.C 3.C++ 4.���̽�)");
		System.out.print("�����ȣ: ");
		
		code = sc.nextInt();
		
		//if-else�� ��� ���ǽ��� ==�� ��� switch-case�� ���
		switch(code) {
			case 1:
				System.out.println("R101ȣ");
				break;
			case 2:
				System.out.println("R202ȣ");
				break;
			case 3:
				System.out.println("R303ȣ");
				break;
			case 4: System.out.println("R404ȣ");
				break;
			default: System.out.println("�������� �����ϼ���");
		}
		
		sc.close();
	}
}
