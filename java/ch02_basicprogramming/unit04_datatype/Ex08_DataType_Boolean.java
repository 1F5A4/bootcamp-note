package ch02_basicprogramming.unit04_datatype;

/*
    - boolean 
        : 1byte, true와 false만 가능
*/

public class Ex08_DataType_Boolean {
	public static void main(String[] args) {
		boolean a;
		a = true;
		System.out.println(a);
		
		// a = "true"; // 컴파일 오류
	}
}


/* CONCEPT -------------------------------------------------------------------------------------------------------------

    1. boolean 타입
        - 크기: 1 byte (논리형)
        - 값: 오직 `true` 또는 `false`만 가능
        - 조건문, 반복문에서 자주 사용됨
    
    2. 사용 예
        - 조건 판단: if (조건), while (조건) 등에 사용
        - 변수에 직접 true/false 저장 가능
    
    3. 주의
        - 문자열 "true"는 boolean 타입 아님 -> 오류 발생
        - 숫자 1, 0을 boolean으로 사용할 수 없음 (C 언어와 다름)

--------------------------------------------------------------------------------------------------------------------- */
