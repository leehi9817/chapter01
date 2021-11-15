package com.javaex.ex01;

public class Ex06 {
	public static void main(String[] args) {
		//int형과 int형의 연산
		//5 / 4
		//자연수끼리의 연산은 몫과 나머지로 계산
		double v01 = 5 / 4; //1 --> 1.0
		System.out.println(v01);
				
		//double형과 int형의 연산
		//5.0 / 4
		double v02 = (double)5 / 4; //1.25
		System.out.println(v02);
		
		//5.3 + 4
		double v02_1 = (double)5.3 + 4; //9.3
		System.out.println(v02_1);
				
		//int형과 double형의 연산
		//5 / 4.0
		double v03 = 5 / (double)4; //1.25
		System.out.println(v03);
				
		//double형과 double형의 연산
		//5.0 / 4.0
		double v04 = (double)5 / (double)4; //1.25
		System.out.println(v04);
				
		//int형과 int형의 연산
		//1 + 1
		int v05 = (int)1.3 + (int)1.8; //2
		System.out.println(v05);
		
		//(int)3.1
		int v06 = (int)(1.3 + 1.8); //3
	}
}
