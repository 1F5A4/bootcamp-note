package ch02_basicprogramming.unit04_datatype;

/* 
    - 정수형 데이터 타입
        : byte, short, int, long이 있다.
*/

public class Ex01_DataType_Integral {
	public static void main(String[] args) {
		// byte: -128 ~ 127
		byte b1;
		byte b2 = 10;
		
		// byte b3 = 130; 
		// === Compile error === 
		//     - 표현 범위 벗어남
		
		// System.out.println(b1); 
		// === Compile error === 
		//     - 초기화되지 않은 변수는 연산할 수 없음
		
		b1 = 100;
		System.out.println(b1 + ", " + b2);
		
		b2 = 50; // 프로그램 실행 도중에 값을 변경할 수 있음
		System.out.println(b2);
		
		// short: 2byte(-32768 ~ 32767)
		short s1, s2 = 100;
		s1 = 'A'; // 문자는 컴퓨터에 ASCII 코드로 저장되므로 자료형에 대입 가능
		System.out.println(s1 + ", " + s2);
		
		// int: 4byte
		int i1 = 30;
		int i2 = 'a'; // ASCII 'a' = 97
		int i3 = '0'; // ASCII '0' = 48
		// 문자도 내부적으로는 숫자로 저장됨 (유니코드/ASCII)
		System.out.println(i1 + ", " + i2 + ", " + i3);
		
		i3 = '0' + 'A'; // 48 + 65
		System.out.println(i3); // 113
		
		i1 = 200;
		// b1 = i1; 
		// === Compile error === 
		//     - int > byte 이므로 int를 byte에 대입불가
		
		b1 = (byte)i1; // int를 byte로 '형변환'하여 대입
		System.out.println(b1); // -56
		// i1 = 200, 1100 1000 (2) 
		// byte로 변환 시 상위 비트 잘림
		// byte형은 8번째(가장 앞)가 부호비트 
		//     - 부호 0 -> 양수, 1 -> 음수
		//     - 1100 1000 = 음수 (부호비트 1)
		//     - 2's complement = 0011 1000 (2)
		//     - 32 + 16 + 8 = 56, 맨 앞1 = 음수, 따라서 최종값 = -56
			
		// long: 8byte
		long l1, l2;
		l1 = 100;
		
		// l2 = 2200000000; 
		// === Compile error ===
		//     - 22억은 int의 범위에 안 들어감
		
		l2 = 2200000000l;
		System.out.println(l1 + ", " + l2);
	}
}


/* CONCEPT -------------------------------------------------------------------------------------------------------------

    1. 정수형 데이터 타입
        - byte (1 byte = 8bit)
            - 표현 범위: -128 ~ 127
            - 메모리 절약이 필요할 때 사용
            - 초기화하지 않은 지역 변수는 사용할 수 없음 -> 컴파일 에러 발생

        - short (2 byte)
            - 표현 범위: -32,768 ~ 32,767
            - 문자를 정수형 변수에 대입할 수 있음 (ASCII 코드 값으로 변환됨)

        - int (4 byte)
            - 정수 기본형
            - 문자를 대입하면 ASCII 코드 값이 저장됨
            - 문자 연산도 가능

        - long (8 byte)
            - 매우 큰 정수 표현
            - 리터럴 뒤에 `L` 또는 `l`을 붙여야 함
            
    2. 형변환 (Casting)
        - 큰 자료형 -> 작은 자료형: 명시적 형변환 필요
            - 범위를 초과하면 oveflow 발생
            
    3. 초기화되지 않은 변수
        - 지역변수는 반드시 사용 전에 초기화해야 함

--------------------------------------------------------------------------------------------------------------------- */
