package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("���ڸ� �Է��ϼ���");
		System.out.print("����: ");
		
		num = sc.nextInt();
		
		if(num>0) {
			//���
			if((num%2)==0) {
				//¦��
				System.out.println("¦���Դϴ�.");
			} else {
				//Ȧ��
				System.out.println("Ȧ���Դϴ�.");
			}
		}else if(num<0) {
			//����
			System.out.println("�����Դϴ�.");
		}else {
			//0
			System.out.println("0�Դϴ�.");
		}
		
		sc.close();
	}

}
