package com.javaex.ex02;

public class Ex01 {
	public static void main(String[] args) {
		//println() print() ������
		System.out.print("�ȳ�");
		System.out.println("�ϼ���");
		System.out.println("�ȳ��ϼ���");
		
		//println() ����
		int i = 2345;
		double d = 3.14;
		String str = "�¸��";
		char c = '��';
		String str2 = "��";
		String name = "������";
		
		System.out.println("�ȳ��ϼ���");	//�ȳ��ϼ���
		System.out.println(str);		//�¸��
		System.out.println(i);			//2345
		System.out.println(d);			//3.14
		
		System.out.println(str+str);	//�¸�ױ¸��
		System.out.println(str+i);		//�¸��2345
		System.out.println(str+d);		//�¸��3.14
		System.out.println(str+c);		//�¸����
		System.out.println(str+"�̶� "+i);//�¸���̶� ��
		
		System.out.println(i+i); 		//4690
		System.out.println(i+d);		//2348.14
		System.out.println(i-i);		//0
		System.out.println(i*i);		//5499025
		
		System.out.println(c+c);		//����
		System.out.println(c+str2);		//����
		
		System.out.println("�� �̸��� " + name + " �Դϴ�.");	//�� �̸��� ������ �Դϴ�.
		System.out.println("�ȳ�\"��\"����");	//�ȳ�"��"����
		System.out.println("�ȳ�\\��\\����");	//�ȳ�\��\����
		System.out.println("�ȳ�\t�ϼ���");		//�ȳ�	�ϼ���
		System.out.print("�ȳ�\n");			//�ٹٲ�
		System.out.println("�ϼ���");
		
	}
}
