package com.javaex.ex04;

public class Ex11 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {

			// 2�� ��� �̸鼭 3�� ����̳�? -->6�̳�?
			if ((i % 2 == 0) && (i % 3 == 0)) {
				// break;
				continue;
			}

			System.out.println(i);
		} // for���� ��

	}

}
