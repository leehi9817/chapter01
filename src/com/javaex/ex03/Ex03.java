package com.javaex.ex03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��� �ּ���");
		System.out.print("����:");
		
		//12 -5 0
		int point = sc.nextInt();
		
		if(point>0) {
			//12
			System.out.println("���");
		} else if(point<0) {
			//-5 0
			System.out.println("����");
		} else {
			//0
			System.out.println("0");
		}
		
		sc.close();
	}

}
