package com.javaex.ex01;

public class Ex07 {
	public static void main(String[] args) {
		//대입연산자
		int a = 7;
		int b = 2;
		
		//산술연산자
		System.out.println("산술연산자");
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		
		System.out.println(a / b); //몫
		System.out.println(a % b); //나머지
		
		//산술연산자 / % 자세히
		System.out.println("산술연산자 자세히");
		System.out.println(7.0/2.0); //3.5
		System.out.println(7.0%2.0); //1.0
		
		//부호연산자
		System.out.println("부호연산자");
		int var = -3;
		int pVar = +var;
		int mVar = -var;
		
		System.out.println(pVar); //+(-3)
		System.out.println(mVar); //-(-3)
		
		//증감연산자
		System.out.println("증감연산자");
		System.out.println(a); //7
		System.out.println(++a); //(1)a를 올린다 --> 7->8, (2)a를 출력한다 --> 8
		System.out.println(a); //8
		
		System.out.println(b); //2
		System.out.println(--b); //(1)b를 1내린다 --> 2->1, (2)b를 출력한다 --> 1
		System.out.println(b); //1
		
		System.out.println(a); //8
		System.out.println(a++); //(1)a를 출력한다, (2)a를 올린다 --> 8->9
		System.out.println(a); //9
		
		System.out.println(b); //1
		System.out.println(b--); //(1)b를 출력한다, (2)b를 내린다 --> 1->0
		System.out.println(b); //0
	}
}
