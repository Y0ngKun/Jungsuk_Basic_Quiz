package com.Kwon.Jungsuk_Basic_Quiz;

import java.util.Scanner;

public class Ch04 {

	public static void main(String[] args) {
		
		/*	char [] ch3 = {'a','b','c','d','e'};
	char [] ch4 = new char[ch3.length];
	
	for (int i = 0; (i < ch3.length); i++) {
	    ch4[i] = ch3[ch3.length-1-i];
	}
	System.out.println(ch4);
		 *
		 */
		
		
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
	
	while (z<=10) {
		int z1 = 0;
		while(z1<=z) {
			System.out.print("*");
			z1++;
		}
		System.out.println();
		z++;
	}//4_5 while으로 변경;
	
	for(int i = 1; i <= 6; i++) {
		for(int j = 1; j<=6; j++) {
			if(i+j==6) {System.out.println(i + "+" + j +"= " + (i+j));}
		}
	}//4_6;

	String str1 = "12345";
	int sum3 = 0;
	
	for (int i = 0; i < str1.length(); i++) {
		sum3 += str1.charAt(i)-'0';
	}
	System.out.println(sum3);
	
	//4_7;
	
	int value = (int)(Math.random()*6)+1;
	System.out.println("value : " + value);
	//4_8;
	
	int num = 12345;
	int sum1 = 0;
//	float sum13 = (int)((((float)(sum12*0.1f))-((int)(sum12*0.1f)))*10);
//	float sum14 = (int)((((float)(sum12*0.01f))-((int)(sum12*0.01f)))*10);
//	float sum15 = (int)((((float)(sum12*0.001f))-((int)(sum12*0.001f)))*10);
//	float sum16 = (int)((((float)(sum12*0.0001f))-((int)(sum12*0.0001f)))*10);
//	float sum17 = (int)((((float)(sum12*0.00001f))-((int)(sum12*0.00001f)))*10);
//	
//	System.out.println(sum13);
//	System.out.println(sum14);
//	System.out.println(sum15);
//	System.out.println(sum16);
//	System.out.println(sum17);
//	
//	System.out.println("sum12의 각 자리수 총합은 : " + (int)(sum13+sum14+sum15+sum16+sum17));
	
	for(int i = 1; i<100; i++) {
		sum1 += num%10;
		num = num/10;
	}System.out.println("12345 sum : "+sum1);
	//4_9;
	
	int answer = (int)(Math.random()*100)+1;
	//1~100사이 임의의 값을 얻어서 answer에 저장한다.
	int input = 0; //사용자 입력을 저장할 공간
	int count = 0; //시도 횟수를 세기 위한 공간
	
	Scanner sc = new Scanner(System.in);
	
	do {
		count++;
		System.out.println("1에서 100사이 정수를 입력하세요 : ");
		input = sc.nextInt(); //입력 받은 정수를 input에 저장한다
		
		if(answer==input) {System.out.println("정답입니다");break;}
		else if(answer>input) {System.out.println("더 큰 수를 입력하세요");}
		else if(answer<input) {System.out.println("더 작은 수를 입력하세요");}
	}
	while(true);
	
	
	
	
	}//main method;
}//main class;
