package com.javaex.ex04;

public class Ex12 {

	public static void main(String[] args) {
		// 20���� �����߿� 2�ǹ�����X 3������X ������ �� ������ּ���
		/*
		 * for(int i=1; i<=20; i++) {
		 * 
		 * 	if( i%2==0 || i%3==0 ) { 
		 * 	//�ƹ��ϵ� ���ؾߵȴ� 
		 * 		continue; 
		 * 	}
		 * 
		 * 	System.out.println(i); 
		 * }
		 */

		/*
		 * for(int i=1; i<=20; i++) {
		 * 
		 * 	if( i%2==0 || i%3==0 ) { 
		 * 		// 2�ǹ�� �Ǵ� 3�� ����� ����
		 * 	}else { 
		 * 		// 2�ǹ�� �Ǵ� 3�� ����� �ƴϸ� 
		 * 		System.out.println(i); 
		 * 	}
		 * }
		 */

		for (int i = 1; i <= 20; i++) {

			if (!(i % 2 == 0 || i % 3 == 0)) { // 2�ǹ�� �Ǵ� 3�� ��� �� �ƴϸ� ����
				System.out.println(i);
			}
		}

	}

}
