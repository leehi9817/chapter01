package com.javaex.ex01;

public class Ex09 {
	public static void main(String[] args) {
		//��������
		int a = 5;
		int b = 7;
		
		//�������� &&
		System.out.println("&&������");
		System.out.println(true && true);   //true
		System.out.println(true && false);  //false
		System.out.println(false && true);  //false
		System.out.println(false && false); //true
		
		//�������� && ����
		System.out.println("&&������ ����");
		System.out.println( (a>b)&&(a<b) ); //F&&T --> F
		System.out.println( (a>b)&&(a>b) ); //F&&F --> T
		
		//�������� ||
		System.out.println("||������");
		System.out.println(true || true);   //true
		System.out.println(true || false);  //true
		System.out.println(false || true);  //true
		System.out.println(false || false); //false
		
		//�������� || ����
		System.out.println("||������ ����");
		System.out.println( (a>b)||(a<b) ); //F&&T --> T
		
		//�������� !
		System.out.println("!������");
		System.out.println(!true);
		System.out.println(!false);
		
		//�������� ! ����
		System.out.println("!������ ����");
		System.out.println(a>b); //5>7 F
		System.out.println(!(a>b)); //!F --> T
	}
}
