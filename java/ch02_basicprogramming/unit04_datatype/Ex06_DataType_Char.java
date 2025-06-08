package ch02_basicprogramming.unit04_datatype;

/*
    - char: 2byte, 부호없는 정수형
        - 'A': 65(~90), 'a': 97(~122), '0': 48, 엔터: 10  
*/

public class Ex06_DataType_Char {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = 65;
        char c3 = '\u0041'; // 유니코드(16진수)
        // 16진수 41은 10진수 65이므로 'A'
        System.out.println(c1 + ", " + c2 + ", " + c3);

        c1 = '대';
        System.out.println(c1);

        // c1 = ' '; 
        // === Compile error === 
        //     - 빈문자는 없음 (js에는 있음!)
        
        // c1 = 'AB'; 
        // === Compile error ===
        //     - 문자는 한 글자로 구성
        
        // c1 = "A"; 
        // === Compile error ===
        //     - 문자열은 char에 대입 불가

        int a = '대';
        System.out.println(a); // 한글 '대'의 유니코드

        double b;
        b = 'C';
        System.out.println(b); // 67.0

        int c, d;
        c = 0;
        d = '0';
        System.out.println(c + ", " + d);
    }
}


/* CONCEPT -------------------------------------------------------------------------------------------------------------

    1. char 자료형
        - 크기: 2 byte
        - 부호 없는 정수형 (0 ~ 65535)
        - 내부적으로는 문자도 숫자로 저장됨 (유니코드 기반)
        - ASCII 문자 ('A', 'a', '0' 등)의 경우 유니코드와 일치
            - 'A' -> 65, 'a' -> 97, '0' -> 48, '\n' -> 10 (줄바꿈), '\r' -> 13 (캐리지 리턴)
            - 한글 등 확장 문자는 더 큰 유니코드 값으로 표현됨
    
    2. 리터럴 대입 방법
        - 문자 리터럴: 'A'
        - 정수 값으로 직접 대입: char c = 65;
        - 유니코드(16진수): `char c = '\u0041'; -> u + 4자리 16진수
    
    3. char <-> 숫자형 변환  
        - char는 int, double 등 숫자형으로 자동 형변환 가능
            - int a = '대'; -> '대'의 유니코드(대한민국 글자 영역)를 숫자로 저장
        - double 등에도 자동 변환되어 저장됨 ('C' → 67.0)
    
    4. 참고: 줄바꿈 문자 (Newline character)
        - '\n' (Line Feed, 10): 줄바꿈
        - '\r' (Carriage Return, 13): 커서 맨 앞으로 이동
        - 운영체제마다 줄바꿈 방식이 다름
            - Windows: \r\n
            - macOS/Linux: \n

--------------------------------------------------------------------------------------------------------------------- */
