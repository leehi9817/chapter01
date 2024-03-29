package com.javaex.ex03;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int code;
		
		System.out.println("과목을 선택하세요");
		System.out.println("(1.자바 2.C 3.C++ 4.파이썬)");
		System.out.print("과목번호: ");
		
		code = sc.nextInt();
		
		//if-else의 모든 조건식이 ==일 경우 switch-case문 사용
		switch(code) {
			case 1:
				System.out.println("R101호");
				break;
			case 2:
				System.out.println("R202호");
				break;
			case 3:
				System.out.println("R303호");
				break;
			case 4: System.out.println("R404호");
				break;
			default: System.out.println("상담원에게 문의하세요");
				break;
		}
		
		sc.close();
	}
}
