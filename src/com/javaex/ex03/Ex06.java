package com.javaex.ex03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���");
		int score = sc.nextInt();
		
		if( (score%3) == 0) {
			System.out.println(score + "��(��) 3�� ��� �Դϴ�.");
		}else {
			System.out.println(score + "��(��) 3�� ����� �ƴմϴ�.");
		}
		
		sc.close();
	}
}
