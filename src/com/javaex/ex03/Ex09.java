package com.javaex.ex03;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int code;
		
		System.out.println("������ �����ϼ���");
		System.out.println("(1.�ڹ� 2.C 3.C++ 4.���̽�)");
		System.out.print("�����ȣ: ");
		
		code = sc.nextInt();
		
		if(code==1) {
			System.out.println("R101ȣ");
		}else if(code==2) {
			System.out.println("R202ȣ");
		}else if(code==3) {
			System.out.println("R303ȣ");
		}else if(code==4) {
			System.out.println("R404ȣ");
		}else {
			System.out.println("�������� �����ϼ���");
		}
		
		sc.close();
	}
}
