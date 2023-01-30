package com.Kwon.Jungsuk_Basic_Quiz;

import java.util.Arrays;

public class Ch05 {
	public static void main(String[] args) {
		int[] numArr = new int[] {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
		
		for (int i = 0; i < 100; i++) {
			int n = (int)(Math.random()*10);
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
			}
		System.out.println(Arrays.toString(numArr));
		
		
		String[] name4 = new String[] {"Kim","Park","Lee","Kwon"};
		String[] name5 = {"kk","ll","leee"};
		System.out.println(Arrays.toString(name4));
		System.out.println(name5);
		
	}//main method;
}//main class;
