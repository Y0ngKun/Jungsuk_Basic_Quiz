package com.Kwon.Jungsuk_Basic_Quiz;

public class Ch04 {

	public static void main(String[] args) {
		
	int x = 0;
	boolean x1 = ((x>10) && (x<20))? true : false;
	//4_1_1;
	char ch = ' ';
	if(!(ch==' ') || (ch=='	')) {}
	//4_1_2;
	
	if(ch=='x' || ch=='X') {}
	//4_1_3;
	
	if(ch>='0' || ch<='9'){}
	//4_1_4;
	
	if((ch>='A'|| ch<='Z') || (ch>='a' || ch<='z')) {}
	//4_1_5;
	int year = 0;
	
	if ((year%400==0 || year%4==0) && (year%100!=0)) {}
	//4_1_6;
	
	boolean powerOn = false;
	if(powerOn) {}
	//4_1_7;
	
	String str = "";
	if(str=="yes") {}
	//4_1_8;
	
	for(int i = 1; i <= 20 ; i++) {
		if((i%2!=0) && (i%3!=0)) {
			System.out.println(i);
			//System.out.println("2또는 3의 배수가 아닌 수의 합 : "+ i);
		}
	}//4_2;
	
	for (int i = 1, sum =0,totalsum=0; i <= 10; i++) {
		sum += i;
		totalsum += sum;
		System.out.println("totalsum = "+totalsum);
	}//4_3;
	
	int sum = 0;
	int sum2 = 0;
	int s = 1;
	for(int i = 1; true; i++,s=-s) {
		sum = i*s;
		sum2 += sum;
		if(sum2>=100) {break;}
	}
	System.out.println(sum);
	System.out.println(sum2);
	//4_4;
	
	
	for (int i = 0; i <= 10; i++) {
		for(int j = 0; j <= i ; j++)
			{System.out.print("*");}
		System.out.println();	
	}//4_5;
	
	System.out.println("==구분선==");

	int z = 0;
	
	while(z<=10) {
		int z1 = 0;
		
		while(z1<=z) {System.out.print("*");z1++;}
		System.out.println();
		z++;
	}
	
/*	char [] ch3 = {'a','b','c','d','e'};
	char [] ch4 = new char[ch3.length];
	
	for (int i = 0; (i < ch3.length); i++) {
	    ch4[i] = ch3[ch3.length-1-i];
	}
	System.out.println(ch4);
*
*/
	
	
	
	}//main method;
}//main class;
