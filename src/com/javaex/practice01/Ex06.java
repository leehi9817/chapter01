package com.javaex.practice01;

public class Ex06 {
	public static void main(String[] args) {
	
		int i = 10;
		
		//(1)i%2 ����, (2)n�� ����, (3)i�� 1 ����
		int n = i++ % 2;
		
		System.out.println(i); //11
		System.out.println(n); //0
	}
}
