package com.javaex.practice01;

public class Ex19 {
	public static void main(String[] args) {
		final int YEAR = 365;
		final int HOUR = 24;
		final int MINUTE = 60;
		final int SECOND = 60;
		long distance, speed;
		
		speed = 300000;
		
		distance = speed * YEAR * HOUR * MINUTE * SECOND;
		
		System.out.println("���� 1�� ���� ���� �Ÿ��� " + distance + " km �Դϴ�.");
	}
}
