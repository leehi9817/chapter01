package com.javaex.ex01;

public class Ex07 {
	public static void main(String[] args) {
		//���Կ�����
		int a = 7;
		int b = 2;
		
		//���������
		System.out.println("���������");
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		
		System.out.println(a / b); //��
		System.out.println(a % b); //������
		
		//��������� / % �ڼ���
		System.out.println("��������� �ڼ���");
		System.out.println(7.0/2.0); //3.5
		System.out.println(7.0%2.0); //1.0
		
		//��ȣ������
		System.out.println("��ȣ������");
		int var = -3;
		int pVar = +var;
		int mVar = -var;
		
		System.out.println(pVar); //+(-3)
		System.out.println(mVar); //-(-3)
		
		//����������
		System.out.println("����������");
		System.out.println(a); //7
		System.out.println(++a); //(1)a�� �ø��� --> 7->8, (2)a�� ����Ѵ� --> 8
		System.out.println(a); //8
		
		System.out.println(b); //2
		System.out.println(--b); //(1)b�� 1������ --> 2->1, (2)b�� ����Ѵ� --> 1
		System.out.println(b); //1
		
		System.out.println(a); //8
		System.out.println(a++); //(1)a�� ����Ѵ�, (2)a�� �ø��� --> 8->9
		System.out.println(a); //9
		
		System.out.println(b); //1
		System.out.println(b--); //(1)b�� ����Ѵ�, (2)b�� ������ --> 1->0
		System.out.println(b); //0
	}
}
