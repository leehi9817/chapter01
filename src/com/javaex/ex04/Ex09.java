package com.javaex.ex04;

public class Ex09 {

	public static void main(String[] args) {

		int i = 0;	// ���� ���� �ʱⰪ
		 
		while(true) {
			
			i = i + 1; //i++
			
			if((i%6==0) && (i%14==0)) {	
				//6�� ��� �̸鼭 14�� ��� �Դϱ�?
				//yes --> ���� ��� �ݺ��� Ż��
				System.out.println(i);
				break;
			}
		}

	}

}
