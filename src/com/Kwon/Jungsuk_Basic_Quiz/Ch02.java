package com.Kwon.Jungsuk_Basic_Quiz;

public class Ch02 {

	public static void main(String[] args) {
		
		/*2-1
		 *         1바이트    2바이트    4바이트    8바이트 
		 *	논리형  boolean
		 *	문자형            char     
		 * 	정수형    byte    short     int      long
		 *	실수형                     float    double
		 */ 
		
		/*2-2
		*다음중 키워드가 아닌 것은?
		*1. if 2. True 3.NULL 4.Class 5.System
		*
		*키워드 란 특정 용도로 사용하기 위해서 자바 프로그램에서 미리 예약되어 있는 명령으로,
		*이미 선언된 명령, 즉 다른 변수나 클래스, 메소드명 등으로 
		*사용할 수 없는 제한된 단어라고 생각하시면 됩니다.
		*/ 
		
		/*2-3
		* char타입(2 byte)의 변수에 저장될 수 있는 정수 값의 범위는?(10진수로 적으시오)
		* 정답 : -128~127
		*/
		
		/*2-4
		 * 다음 중 변수를 잘못 초기화 한 것은? (모두 고르시오)
		 * 1.byte b = 256;
		 * 2.char c = '';
		 * 3.char answer = 'no';
		 * 4.float f = 3.14
		 * 5.double d = 1.4e3f;
		 */
		
		/*2-5
		 * 다음의 문장에서 리터럴, 변수, 상수, 키워드를 적으시오
		 * int i = 100;
		 * long l = 100L;
		 * final float PI = 3.14f;
		 */
		
		/*2-6
		 * 다음 중 기본형(primitive type)이 아닌 것은?
		 * 1.int
		 * 2.Byte
		 * 3.double
		 * 4.boolean
		 */
		
		/*2-7
		 * 다음 문장들의 출력결과를 적으시오. 오류가 있는 문장의 경우 괄호 안에 '오류'라고 적으시오.
		 * System.out.println ("1" + "2")
		 * System.out.println (true + "")
		 * System.out.println ('A' + 'B')
		 * System.out.println ('1' + 2)
		 * System.out.println ('1' + '2')
		 * System.out.println ('J' + "AVA")
		 * System.out.println (true + null)
		 */
		
		/*2-8
		 * 아래는 변수 x,y,z의 값을 서로 바꾸는 예제이다. 결과와 같이 출력되도록 (1)에 알맞은 코드를 넣으시오
		 * int x = 1;
		 * int y = 2;
		 * int z = 3;
		 * 
		 * 
		 * (1) 알맞은 코드를 넣어 완성 하시오
		 * 
		 * System.out.println("x = " + x);
		 * System.out.println("y = " + y);
		 * System.out.println("z = " + z);
		 * 
		 */
		
		
		
		byte b =10;
		char ch = 'A';
		int i = 100;
		long l = 1000L;
		
		
		System.out.println('1'+2);
		System.out.println('1'+'2');
		System.out.println('J'+"AVA");

		int x = 1;
		int y = 2;
		int z = 3;
		
		int tmp = x;
		x = y;
		y = z;
		z = tmp;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
}
}