package com.javaex.ex04;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		int num;
		int sum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("���ڸ� �Է��ϼ���[0�̸� ����]");

		/// �ݺ�����
		/*
		 * do { num = sc.nextInt(); sum = sum + num; System.out.println("�հ�: " + sum);
		 * 
		 * }while(num != 0); // 0�� �ƴϸ� ��� ���
		 */
		// �ݺ�����

		while (true) {

			num = sc.nextInt();
			sum = sum + num;
			System.out.println("�հ�: " + sum);

			if (num == 0) { // num 0 �̸� �� --> while���� ������ -->break
				break;
			}

		}

		System.out.println("����");

		sc.close();

	}

}
