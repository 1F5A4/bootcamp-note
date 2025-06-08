package ch02_basicprogramming.unit03_iostream;

/* 
	- System.out.printf("출력서식", 출력할값, 출력할값)
    	: 출력 서식에 따라 값을 출력
    	: 출력 후 라인을 넘기지 않는다
    	: System.out.format("출력서식", 출력할값, 출력할값)와 동일
*/

public class Ex03_Printf {
	public static void main(String[] args) {
		int a, b, c; // 정수형 변수
		a = 13;
		b = 4;
		c = a + b;
		
		System.out.println(a + " + " + b + " = " + c);
		System.out.printf("%d + %d = %d\n", a, b, c);
		System.out.format("%d + %d = %d\n", a, b, c);
		System.out.println();
		
		System.out.printf("%d + %d = %d\t", a, b, a + b); // 합
		System.out.printf("%d - %d = %d\n", a, b, a - b); // 차
		System.out.printf("%d * %d = %d\t", a, b, a * b); // 곱
		System.out.printf("%d / %d = %d\n", a, b, a / b); // 몫
		System.out.printf("%d %% %d = %d\n", a, b, a % b); // 나머지
		// %: 형식지정 제어문자의 시작
    		// %d: 정수를 출력
    		// \n, %n: 라인을 넘김, C에서 %n 안 되는 거 알지?
    		// %%: %가 형식문자가 아닌 %를 출력할 경우 사용
	}
}


/* CONCEPT -------------------------------------------------------------------------------------------------------------

    - System.out.printf(format, arguments);
        : 출력 서식에 따라 값을 출력
        : 출력 후 라인을 넘기지 않음
        : System.out.format("출력서식", 출력할값, 출력할값)와 동일
    
    - %: 형식지정 제어문자의 시작
        - %d: 정수를 출력
        - \n, %n: 라인을 넘김 (C언어와 달리 가능함)
        - %%: %가 형식문자가 아닌 %를 출력할 경우 사용

--------------------------------------------------------------------------------------------------------------------- */
