package com.javaex.ex03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����:");
		int num = sc.nextInt();
		
		if(num>=60) { //�Է��� ���� 60�� �̻����� �Ǵ�
			//������ true �϶��� ����Ǵ� ����
			System.out.println("�հ��Դϴ�.");
		}
		
		sc.close();
	}
}
