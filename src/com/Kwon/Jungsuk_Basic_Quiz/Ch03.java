package com.Kwon.Jungsuk_Basic_Quiz;

public class Ch03 {

	public static void main(String[] args) {
		
		byte a =10;
		byte b =10;
		byte c = (byte)(a*b); // (byte)a*b 혹은 (byte)a*(byte)b 와 같은 방식은 되지 않는다.
		System.out.println(c);
		
		int x = 1_000_000;
		int y = 1_000_000;
		long z = (long)(x*y);
		System.out.println(z); // 이미 x*y가 int*int로 계산을 해서 -727379968라는 값을 계산한 뒤이기 때문에 long으로 형변환해도 값이 바뀌지 않는다.
		long y2 = 1_000_000;
		System.out.println(x*y2); //이항 연산자중 피연산자 하나를 long형으로 선택해야지만 10의 12승을 재대로 출력가능하다.
		
		long result = Math.round(4.52); //Math.round()는 기본값으로 소수점 첫번째 자리에서 반올림한다. 즉 여기서는 5가 출력됨 Math.round()는 인트형으로 형변환됨
		System.out.println(result);
		
		double pi = 3.141592;
//		pi = (pi*1000);
//		pi = (Math.round(pi));
//		pi = pi/1000;
//		System.out.println(pi); // 내가 푼 풀이;
		System.out.println("double형 pi(3.141592)를 Math.round했을 때 : "+Math.round(pi)); // Math.round()는 소수점 첫번째 자리에서 반올림하고 인트형으로 형변환됨
		double shortPi = Math.round(pi*1000)/1000.0;
		System.out.println(shortPi);
		
		System.out.println("10/-8 = "+10%-8);
		System.out.printf("10/-8의 몫은 %.3f 이고 나머지는 : %.1f 입니다 %n",(10.0/-8),(10.0%-8)); //printf %.3f 처럼 실수 지시자를 쓰고 .n번째 자리수를 표시하면 반올림을 하고 소수점 자리수를 표현한다(!!)  

		String str = new String("abc");
		boolean result2 = str.equals("abc");
		System.out.println(result2);
		
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1==str2);
		System.out.println(str1=="abc"); //"abc"; 로 값만 넣어서 만든 변수는 true;
		System.out.println(str2=="abc"); // new String("abc")로 객체 생성 후 만든 변수는 false(!!!)
		System.out.println(str1.equals("abc"));
		System.out.println(str2.equals("abc"));
		System.out.println(str2.equalsIgnoreCase("ABC")); // equalsIgnoreCase = 문자열 비교시 대소문자 안따지고 같은 문자면 true
		
		
		boolean k = (x%2==0 || x%3==0)&& x%6!=0; 
		// k는 (2의 배수 또는 3의 배수) 그리고 6의 배수는 아니다, 
		//괄호를 붙인 이유는 논리연산자 &&, ||을 같이 쓰면 &&가 우선순위가 높아서 의도와 달라질 수 있다.
		//논리 연산자는 &&가 먼저 계산되어야 하는 경우라도
		//괄호를 사용해 우선 순위를 명확히 하는 것을 권장한다(!!!)
		System.out.println(k);
		
		
	}//main method;
}// main class;

