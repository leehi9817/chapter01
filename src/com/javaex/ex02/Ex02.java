package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("숫자를 입력하세요");
		 int num = sc.nextInt();
		 System.out.println("입력하신 숫자는 " + num + " 입니다.");
		 
		 sc.close();
	}
}
