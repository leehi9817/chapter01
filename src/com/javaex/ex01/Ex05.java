package com.javaex.ex01;

public class Ex05 {
	public static void main(String[] args) {
		//�ڵ�����ȯ
		System.out.println(2+3.4);
		
		double var01 = 2+3.4;   //2.0(�ڵ�����ȯ) + 3.4
		System.out.println(var01);
		
		//�ڵ�����ȯ(long + float)
		long var02 = 12345L;
		float var03 = 1.1F;

		System.out.println(var02+var03);
		
		float result = var02+var03;
		System.out.println(result);
		
		/////////////////////////////////////////////
		
		//���� ����ȯ
		int i = (int)11112.3232322; //int ���ض�
		System.out.println(i);
		
		float f01 = 12.5f;
		int i01 = (int)f01;
		System.out.println(i01);
		System.out.println(f01);
		
		
		//���� ����ȯ -->Ȯ�� ����ȯ
		byte v01 = 10;
		int v02 = (int)v01;
		System.out.println(v01);
		System.out.println(v02);
		
		//���� ����ȯ -->��� ����ȯ(����)
		int v03 = 10;  //4byte => 32bit
		byte v04 = (byte)v03;
		System.out.println(v03); //-->10
		System.out.println(v04); //-->10
		
		//���� ����ȯ -->��� ����ȯ(������)
		int v05 = 34324324;
		byte v06 = (byte)v05;
		System.out.println(v05); //-->103029770
		System.out.println(v06); //-->10
		
		//�Ǽ�-->���� : �Ҽ��κ��� ������
		double v07 = 53342.572313213;
		int v08 = (int)v07;
		System.out.println(v08);
		
		//����-->�Ǽ� : .0�� ���δ�
		int v09 = 7;
		double v10 = (double)v09;
		System.out.println(v10);
		
	}
}
