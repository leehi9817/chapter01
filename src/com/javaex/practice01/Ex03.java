package com.javaex.practice01;

public class Ex03 {
	public static void main(String[] args) {
		
		int x = 1;
		int y = 1;
		
		//(1)x�� 1 ����, (2)x�� 2 ���ϱ�, (3)a�� ����
		int a = ++x * 2; //x:2, a:4
		//(1)y�� 2 ���ϱ�, (2)b�� ����, (3)y�� 1 ����
		int b = y++ * 2; //y:2, b:2
		
		System.out.println("a=" + a); //4
		System.out.println("b=" + b); //2
		System.out.println("x=" + x); //2
		System.out.println("y=" + y); //2
	}
}
