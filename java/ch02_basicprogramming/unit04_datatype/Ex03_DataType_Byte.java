package ch02_basicprogramming.unit04_datatype;

/*
    - byte 타입과 overflow
        : byte는 1 byte = 8 bit
        : 부호 있는 정수형이므로 표현 범위는 -128 ~ 127 (총 256개 값)
        : 범위를 넘는 값을 대입하면 overflow 발생 → 쓰레기 값이 저장됨
*/

public class Ex03_DataType_Byte {
    public static void main(String[] args) {
        // byte b1 = 129;
        // === Compile error ===
        //     - byte의 표현 범위: -128 ~ 127

        byte b1 = (byte) 129; // -127, overflow
        byte b2 = (byte) 385; // -127, overflow
        // 원 상태로 돌아갈 수는 없음 = 쓰레기 데이터

        System.out.println(b1 + ", " + b2);
        System.out.println(b1 == b2); // true

        short a = 350;
        short b = -350;

        System.out.printf("%X %X\n", a, b); // 15E FEA2
        System.out.printf("%04X %04X\n", a, b); // 15E FEA2
        // 0000 0001 0101 1110 => 350 (%04X => 4자리로 출력)
        // 1111 1110 1010 0010 => -350
    }
}


/* CONCEPT -------------------------------------------------------------------------------------------------------------

    1. byte의 표현 범위와 overflow
        - byte는 -128 ~ 127까지 표현 가능 (1 byte = 8bit)
        - 범위를 초과한 값을 강제로 대입하면 overflow 발생 -> 잘못된(예상치 못한) 값 저장
            - (byte)129 = -127, (byte)385 = -127
    
        - 같은 값이 나올 수 있음: 
            - (byte)129 == (byte)385 -> true
                - 이유: 넘친 결과가 같기 때문 (둘 다 -127로 변환됨)
            - 이러한 값은 '정확한 수치가 아님', 쓰레기 값으로 간주
    
    2. short 타입의 16진수 출력
        - %X: 정수값을 16진수로 대문자로 출력
        - %04X: 최소 네 자리로 출력하고, 자릿수가 부족하면 0으로 채움
    
    3. 2의 보수(음수 표현)
        - 자바는 음수를 메모리에 2의 보수로 저장
            - 음수로 바꾸기 = 1의 보수로 바꾼 후 +1

--------------------------------------------------------------------------------------------------------------------- */
