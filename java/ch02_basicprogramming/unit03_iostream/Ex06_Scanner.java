package ch02_basicprogramming.unit03_iostream;

import java.util.Scanner; // 외부에 있는 걸 가져오는 것 = import

/*
    - Scanner: 사용자 입력 도구 (java.util)
        - 사용법: Scanner sc = new Scanner(System.in);
        - 공백을 기준으로 나눔 (nextLine())
        - 닫으면 재사용 불가
*/

public class Ex06_Scanner {
    public static void main(String[] args) {
        // 데이터를 입력 받을 수 있는 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        String name; // 문자열, "Seoul"
        int age; // 정수
        char gender; // 문자 'S' 'E' 'O' 'U' 'L' '\0'
        double height; // 실수

        System.out.print("이름? ");
        name = sc.next();
        // 문자열 입력 (공백 전까지)

        System.out.print("나이? ");
        age = sc.nextInt();
        // 정수 입력 

        System.out.print("성별(M/F)? ");
        gender = sc.next().charAt(0);
        // 문자 입력: 문자열을 입력 받아 앞에 한글자 추출

        System.out.print("키? ");
        height = sc.nextDouble();
        // 실수 입력

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("성별: " + gender);
        System.out.println("키: " + height);

        sc.close(); 
        // Scanner 객체 닫음
    }
}


/* CONCEPT -------------------------------------------------------------------------------------------------------------

    - Scanner sc = new Scanner(System.in);
        : java.util 패키지에서 제공하는 입력 도구 (import 필요)
        : 키보드로부터 데이터를 입력받는 객체
        : 공백을 기준으로 나눔 -> 공백 포함 문자열 입력은 nextLine() 사용

    - sc.close();
        : 입력 스트림(System.in)을 닫음
            1. 메모리 누수 방지
            2. 더 이상 입력을 받지 않겠다는 의도 전달
                - System.in은 한 번 닫으면 재사용 불가 *****
                - 반복 입력이 필요하다면 닫지 않아야 함

--------------------------------------------------------------------------------------------------------------------- */
