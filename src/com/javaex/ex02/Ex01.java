package com.javaex.ex02;

public class Ex01 {
	public static void main(String[] args) {
		//println() print() Â÷ÀÌÁ¡
		System.out.print("¾È³ç");
		System.out.println("ÇÏ¼¼¿ä");
		System.out.println("¾È³çÇÏ¼¼¿ä");
		
		//println() »ç¿ë¹ı
		int i = 2345;
		double d = 3.14;
		String str = "±Â¸ğ´×";
		char c = 'ÇÑ';
		String str2 = "ÇÑ";
		String name = "ÀÌÇıÀÎ";
		
		System.out.println("¾È³çÇÏ¼¼¿ä");	//¾È³çÇÏ¼¼¿ä
		System.out.println(str);		//±Â¸ğ´×
		System.out.println(i);			//2345
		System.out.println(d);			//3.14
		
		System.out.println(str+str);	//±Â¸ğ´×±Â¸ğ´×
		System.out.println(str+i);		//±Â¸ğ´×2345
		System.out.println(str+d);		//±Â¸ğ´×3.14
		System.out.println(str+c);		//±Â¸ğ´×ÇÑ
		System.out.println(str+"ÀÌ¶û "+i);//±Â¸ğ´×ÀÌ¶û ÇÑ
		
		System.out.println(i+i); 		//4690
		System.out.println(i+d);		//2348.14
		System.out.println(i-i);		//0
		System.out.println(i*i);		//5499025
		
		System.out.println(c+c);		//ÇÑÇÑ
		System.out.println(c+str2);		//ÇÑÇÑ
		
		System.out.println("Á¦ ÀÌ¸§Àº " + name + " ÀÔ´Ï´Ù.");	//Á¦ ÀÌ¸§Àº ÀÌÇıÀÎ ÀÔ´Ï´Ù.
		System.out.println("¾È³ç\"ÇÏ\"¼¼¿ä");	//¾È³ç"ÇÏ"¼¼¿ä
		System.out.println("¾È³ç\\ÇÏ\\¼¼¿ä");	//¾È³ç\ÇÏ\¼¼¿ä
		System.out.println("¾È³ç\tÇÏ¼¼¿ä");		//¾È³ç	ÇÏ¼¼¿ä
		System.out.print("¾È³ç\n");			//ÁÙ¹Ù²Ş
		System.out.println("ÇÏ¼¼¿ä");
		
	}
}
