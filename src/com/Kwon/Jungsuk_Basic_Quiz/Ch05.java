package com.Kwon.Jungsuk_Basic_Quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

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
		
		
		//1번
		int[] arr[];
		int[] arr1 = {1,2,3};
		int[] arr2 = new int[5];
//		int[] arr3 = new int[5] {1,2,3,4,5};
		//배열 값을 넣어서 선언 할 땐 배열크기를 직접 정하면 에러발생한다
		//배열 값에 따라 공간이 자동으로 생성되기 때문
//		int arr[5];
		//배열 크기를 객체 생성없이 크기를 지정하면서 선언할 수 없다.
		int[] arr4[] = new int [3][]; //2차원 배열
		
		//2번
		int[][] krr = {
				{5,5,5,5,5},
				{10,10,10},
				{20,20,20,20},
				{30,30}
		};//int[3].length = 3행의 배열 크기이니 2
		
		//3번
		int[] jrr = {10,20,30,40,50};
		int sum = 0;
		
		for (int i = 0; i < jrr.length; i++) {
			int j = jrr[i];
			sum += j;
		}
		System.out.println("sum = " + sum);
		
		
		//4번
		int[][] xrr = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		
		int total = 0;
		float average = 0;
		
		for (int i = 0; i < xrr.length; i++) {
			for (int j = 0; j < xrr[i].length; j++) {
				total += xrr[i][j];
			}
		}
		average = total /(float)(xrr.length*xrr[0].length);
		System.out.printf("total = %d, average = %s%n",total,average);
		
		
		//5번
		int ballArr[] = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		for (int i = 0; i < ballArr.length; i++) {
			int j = (int)(Math.random()*ballArr.length);
			int tmp =0;
			
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
		}
		System.out.println(Arrays.toString(ballArr));
		
		ball3[0] = ballArr[0];
		ball3[1] = ballArr[1];
		ball3[2] = ballArr[2];
		
		for (int i = 0; i < ball3.length; i++) {
			int j = ball3[i];
			System.out.print(j);
		}
		System.out.println();
		
		//6번
		String [] words = {"television","computer","mouse","phone"};
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < words.length; i++) {
			
			char[] question = words[i].toCharArray();
			int tmp = 0;
			int k = (int)(Math.random()*words[i].toCharArray().length);
			
			tmp = question[i];
			question[i] = question[k];
			question[k] = (char) tmp;
			
			System.out.printf("Q%d. %s의 정답을 입력하세요. > ",i + 1, new String(question));
			String answer = scanner.nextLine();
			
			if (words[i].equals(answer.trim())) {
				System.out.println("정답입니다.");
			} else {
				System.out.println("오답입니다");
			}
			
		}//for;
		
		
	}//main method;
}//main class;
