package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double time, pay;
		
		System.out.print("�ٹ��ð�:");
		time = sc.nextInt();
		
		if(time<=8) {
			pay = time * 10000;
		}else {
			pay = (8 * 10000) + (time - 8) * 10000 * 1.5;
		}
		
		System.out.println("�ӱ��� " + (int)pay + "�� �Դϴ�.");
		
		sc.close();
	}

}
