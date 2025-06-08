package ch02_basicprogramming.unit03_iostream;

/*
    - System.out.print(인수)
        : 인수의 내용을 출력 장치를 통해 출력하고, 라인을 넘기지 않는다
        : 인수는 생략할 수 없다
*/

public class Ex01_Print {
    public static void main(String[] args) {
        // System.out.print();
        // === Compile error ===
        //     - print()는 괄호 안 인수 필수!

        System.out.print("HTML5, ");
        System.out.print("javascript, ");
        System.out.print("CSS3\n"); // \n: 라인 넘김

        System.out.print("Java\nJSP\n");
        System.out.print("Spring");
        System.out.print("\nOracle\n\n");

        System.out.print("국어\t"); // \t: 탭간격
        System.out.print("영어\t");
        System.out.print("수학\n");

        System.out.print(80 + "\t");
        System.out.print(90 + "\t");
        System.out.print(100 + "\n");
    }
}


/* CONCEPT -------------------------------------------------------------------------------------------------------------

    - System.out.print(argument) 
        : 라인을 넘기지 않음 
        : print()는 괄호안 인수(argument)가 필수 (생략 시 Compile Error)

--------------------------------------------------------------------------------------------------------------------- */
