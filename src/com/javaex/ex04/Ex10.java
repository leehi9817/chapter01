package com.javaex.ex04;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("���ڸ� �Է��ϼ���");
			int num = sc.nextInt();

			if (num == 0) { // 0�̸� ����
				System.out.println("����");
				break;
			} else if (num % 3 == 0) {
				System.out.println("3�� ��� �Դϴ�.");
			} else {
				System.out.println("3�� ����� �ƴմϴ�.");
			}

		}

		sc.close();

	}

}
