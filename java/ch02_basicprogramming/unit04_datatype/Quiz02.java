package ch02_basicprogramming.unit04_datatype;

import java.util.Scanner;

/* 
    - 문자를 입력 받아 입력 받은 ASCII 코드 출력
    - 출력 예
      문자 ? A
      A -> 65
*/

public class Quiz02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;

        System.out.print("문자? ");
        ch = sc.next().charAt(0);

        // 여기 코딩
        System.out.printf("%c -> %d\n", ch, (int) ch);

        sc.close();
    }
}