package ch02_basicprogramming.unit04_datatype;

/*
    - float와 double
        - float(단정도형 실수, single precision) 
            : 4byte
            : 약 7자리 정밀도 -> 큰 수 저장 시 오차 발생 가능
        - double(배정도형 실수, Exponential notation)
            : 8byte
            : 약 15~16자리 정밀도 -> 상대적으로 더 정확하게 표현
        - 둘 다 부동소수점 방식 -> 오차 발생 가능
*/

public class Ex04_DataType_FloatDouble {
    public static void main(String[] args) {
        // byte < short < int < long < float < double
        //         char < int < long < float < double

        // float: 단정도형 실수
        float f1 = 0; // int 리터널을 float 자료형에 대입
        // float f2 = 0.5; // 컴파일 오류. 0.5는 double 리터널
        float f2 = 0.5f; // 0.5f: 단정도형 실수
        float f3 = 1.2e04f; // 1.2 * 10의 4승
        float f4;
        f4 = 'A';
        System.out.println(f1 + ", " + f2 + ", " + f3 + ", " + f4);

        // double: 배정도형 실수
        double d1 = 0.5; // 0.5: 배정도형 리터널
        double d2 = 3.14D; // 3.14d와 동일, 배정도형 리터널
        double d3 = 1.2e-04;
        System.out.println(d1 + ", " + d2 + ", " + d3);

        f4 = (float) d2; // double를 float로 형변환
        System.out.println(f4);
    }
}


/* CONCEPT -------------------------------------------------------------------------------------------------------------

    1. 실수형 데이터 타입
        - float (4byte, 단정도형: single precision)
            - 소수점 이하 약 7자리의 십진수 정밀도
            - 기본 실수 리터럴은 double이므로 f 또는 F 접미사를 붙여야 함
            - 상대적으로 메모리를 적게 사용하지만, 정밀도가 낮음
            - 문자형(char)을 float에 대입하면 ASCII 코드값으로 변환되어 저장
    
        - double (8 byte, 배정도형: double precision)
            - 소수점 이하 약 15~16자리 십진수 정밀도
            - 실수형의 '기본' 타입 (0.5, 3.14 등은 자동으로 double로 처리)
            - D 또는 d 접미사 사용 가능 (생략해도 됨)
            - float보다 정밀도가 높고, 더 큰 실수 표현 가능
    
    2. 지수 표기법 (Exponential notation)
        - 1.2e04 -> 1.2 * 10^4 = 12000.0
        - 1.2e-04 -> 1.2 * 10^{-4} = 0.00012
    
    3. 부동소수점의 오차
        - float, double은 IEEE 754 표준에 따라 부동소수점으로 표현됨
            - 부동소수점 = 지수부와 가수부로 수를 표현하는 방식
        - 일부 소수는 정확히 표현 불가 -> 반올림, 근삿값이 사용됨
        - 계산 시 오차가 발생할 수 있으므로 금융/정밀 계산에는 BigDecimal 사용을 추천
     
    4. 형변환 (Casting)
        - double -> float: 명시적 형변환 필요
            - float f = (float) 3.14;

    5. 정수형과 실수형 범위 비교
        - 메모리 크기: byte < short, char < int < long < float < double
        - 표현 범위: byte < short < int < long < float < double 
        - long은 '정수의 최대 표현 범위, 정확도 보장
        - double은 더 큰 수 표현 가능, 하지만 '정밀도 손실 가능성 존재 
        
          | 타입      | 바이트   | 표현 범위 예시                    | 특징                        |
          |----------|--------|--------------------------------|----------------------------|
          | long     | 8      | ±9,223,372,036,854,775,807     | 큰 정수 정확하게 표현           |
          | double   | 8      | ±1.7976931348623157 x 10^{308} | 소수·과학적 표기 가능, 오차 있음  |  
        
--------------------------------------------------------------------------------------------------------------------- */
