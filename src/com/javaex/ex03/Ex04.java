package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int time, pay;
		
		System.out.print("�ٹ��ð�:");
		time = sc.nextInt();
		
		if(time<=8) {
			pay = time * 10000;
		} else {
			pay = (8 * 10000) + (time - 8) * 12000;
		}
		
		System.out.println("�Ա��� " + pay + "�� �Դϴ�.");
		
		sc.close();
	}

}
