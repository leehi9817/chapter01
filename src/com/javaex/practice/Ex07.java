package com.javaex.practice;

public class Ex07 {

	public static void main(String[] args) {
		
		int i = 10;
		
		//(1)i�� 1 ����, (2)i%2 ����, (3)n�� ����
		int n = ++i % 2;
		
		System.out.println(i); //11
		System.out.println(n); //1
	}
}
