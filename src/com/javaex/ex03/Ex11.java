package com.javaex.ex03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("���� �Է��ϼ���");
		
		int month = sc.nextInt();
		
		switch (month) {
			case 2:
				System.out.println("28�� �Դϴ�.");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30�� �Դϴ�.");
				break;
			default:
				System.out.println("31�� �Դϴ�.");
				break;
		}

		sc.close();
	}

}
