# CONTENTS
- [CONTENTS](#contents)
	- [1. 자바의 기본 입출력](#1-자바의-기본-입출력)
		- [1) 표준 입출력 스트림](#1-표준-입출력-스트림)
		- [2) java.util.Scanner 클래스](#2-javautilscanner-클래스)
	- [2. 자바의 기본 입출력 예제](#2-자바의-기본-입출력-예제)
		- [예제 1 System.out.print(), System.out.println() 예제](#예제-1-systemoutprint-systemoutprintln-예제)
		- [예제 2 System.out.printf() / System.out.format() 예제](#예제-2-systemoutprintf--systemoutformat-예제)
			- [예제 2-1. System.out.printf() / System.out.format() 기본 사용](#예제-2-1-systemoutprintf--systemoutformat-기본-사용)
			- [예제 2-2. long 타입 출력](#예제-2-2-long-타입-출력)
			- [예제 2-3. 자리수 지정 출력](#예제-2-3-자리수-지정-출력)
			- [예제 2-4. 부호 및 괄호 사용](#예제-2-4-부호-및-괄호-사용)
			- [예제 2-5. % 기호 출력](#예제-2-5--기호-출력)
			- [예제 2-6. boolean, hash 출력](#예제-2-6-boolean-hash-출력)
			- [예제 2-7. 실수 출력 (f format)](#예제-2-7-실수-출력-f-format)
			- [예제 2-8. 실수 출력 (g format)](#예제-2-8-실수-출력-g-format)
			- [예제 2-9. 지수 표현 (e format)](#예제-2-9-지수-표현-e-format)
			- [예제 2-10. 16진수 출력](#예제-2-10-16진수-출력)
			- [예제 2-11. 8진수 출력](#예제-2-11-8진수-출력)
			- [예제 2-12. 문자 출력](#예제-2-12-문자-출력)
			- [예제 2-13. 문자열 출력](#예제-2-13-문자열-출력)
			- [예제 2-14. 숫자에 쉼표 넣기](#예제-2-14-숫자에-쉼표-넣기)
			- [예제 2-15. 위치 지정 출력](#예제-2-15-위치-지정-출력)
			- [예제 2-16. 날짜 및 시간 출력](#예제-2-16-날짜-및-시간-출력)
		- [예제 3 Scanner 클래스를 이용한 입력 예제 1](#예제-3-scanner-클래스를-이용한-입력-예제-1)
				- [java.util.Scanner 클래스](#javautilscanner-클래스)
		- [예제 3 Scanner 클래스를 이용한 입력 예제 2 (nextLine() 메소드)](#예제-3-scanner-클래스를-이용한-입력-예제-2-nextline-메소드)
				- [String nextLine() 메소드](#string-nextline-메소드)

<br/>

---

<br/>

## 1. 자바의 기본 입출력
### 1) 표준 입출력 스트림
- 표준 입력 스트림: System.in 
	- 「표준」입력 스트림으로, 열려 있어 바로 사용 가능하다
- 표준 출력 스트림: System.out 
	- 「표준」출력 스트림으로, 열려 있어 바로 사용 가능하다

### 2) java.util.Scanner 클래스
- Scanner 클래스는 System.in을 이용하여 키보드로 입력을 받은 바이트를 문자 단위로 변환하여 원하는 자료형으로 리턴 받을 수 있다

<br/>

---

<br/>

## 2. 자바의 기본 입출력 예제
### 예제 1 System.out.print(), System.out.println() 예제
```java title:"System.out.print(), System.out.println() 예제"
// System.out.print(); 
// 컴파일 에러(괄호 안에 출력 값이 반드시 존재해야 한다.)
System.out.print("HTML, "); // 출력 후 라인을 넘기지 않는다.
System.out.print("CSS, ");
System.out.print("Javascript\n"); // \n(ASCII 코드 값:10) : 라인을 넘김

System.out.println(); // 라인을 넘김. System.out.print("\n"); 와 동일하다. 
System.out.println("JAVA"); // 출력 후 라인을 넘긴다. System.out.println("WEB"); 
System.out.println("Servlet\n"); 
System.out.println("Framework");
```

▶ 출력 결과
```
HTML, CSS, Javascript

JAVA
WEB
Servlet

Framework
```

<br/><br/>

### 예제 2 System.out.printf() / System.out.format() 예제
#### 예제 2-1. System.out.printf() / System.out.format() 기본 사용
```java title:"System.out.printf() / System.out.format() 예제"
System.out.printf("%d\n", 365);
System.out.printf("%d\n", -365);
System.out.format("%d\n", 365);
```

▶ 출력 결과
```
365
-365
365
```

<br/>

#### 예제 2-2. long 타입 출력
```java
// System.out.printf("%d\n", 2200000000);
	// 컴파일 오류(정수의 범위를 벗어남)
System.out.printf("%d\n", 2200000000L);
	//2200000000L: long형 상수
```

▶ 출력 결과
```
2200000000
```

<br/>

#### 예제 2-3. 자리수 지정 출력 
```java
System.out.printf("%10d\n", 123);
System.out.printf("%010d%n", 123);
System.out.printf("%2d\n", 1250);
	// 정수는 자리수가 부족하면 자리수를 무시함 
System.out.printf("%-10d*\n", 123);
```

▶ 출력 결과
```
       123
0000000123
1250
123       *
```

<br/>

#### 예제 2-4. 부호 및 괄호 사용
```java
System.out.printf("%+d\n", 365);
System.out.printf("%+d\n", -365);
System.out.printf("%(d\n", 365);
System.out.printf("%(d\n", -365); (365) 
// System.out.printf("%d\n", 'A'); 
	// 런타임 오류. java.util.IllegalFormatConversionException 
```

▶ 출력 결과
```
+365
-365
365
(365)
```

<br/>

#### 예제 2-5. % 기호 출력
```java
System.out.printf("%d %% %d = %d\n", 10, 3, 10%3);
```

▶ 출력 결과
```
10 % 3 = 1
```

<br/>

#### 예제 2-6. boolean, hash 출력 
```java
System.out.printf("%b\n", true);
System.out.printf("%h\n", 365);
```

▶ 출력 결과
```
true
16d
```

<br/>

#### 예제 2-7. 실수 출력 (f format)
```java
System.out.printf("%f\n", 123.23);
System.out.printf("%8.2f\n", 123.236);
System.out.printf("%.2f\n", 123.236);
System.out.printf("%4.2f\n", 123.236);
System.out.printf("%f\n", 12345.0e-03);
```

▶ 출력 결과
```
123.230000
  123.24
123.24
123.24
12.345000
```

<br/>

#### 예제 2-8. 실수 출력 (g format)
```java
System.out.printf("%g\n", 123.2);
System.out.printf("%10.5g\n", 123.567);
System.out.printf("%10.3g\n", 123.567);
System.out.printf("%10.2g\n", 123.567);
```

▶ 출력 결과
```
123.200
    123.57
       124
   1.2e+02
```

<br/>

#### 예제 2-9. 지수 표현 (e format)
```java
System.out.printf("%e\n", 12345.0e-03);
System.out.printf("%10.3e\n", 123.456);
```

▶ 출력 결과
```
1.234500e+01
 1.235e+02
```

<br/>

#### 예제 2-10. 16진수 출력
```java
System.out.printf("%x\n", 437);
System.out.printf("%X\n", 437);
System.out.printf("%#X\n", 437);
System.out.printf("%#8X\n", 437);
```

▶ 출력 결과
```
1b5
1B5
0X1B5
   0X1B5
```

<br/>

#### 예제 2-11. 8진수 출력 
```java
System.out.printf("%o\n", 10);
System.out.printf("%#o\n", 10);
```

▶ 출력 결과
```
12
012
```

<br/>

#### 예제 2-12. 문자 출력
```java
System.out.printf("%c\n", '\u0041');
System.out.printf("%c\n", 'a');
System.out.printf("%c\n", 'A');
System.out.printf("%C\n", 'a');
System.out.printf("%C\n", 'A');
System.out.printf("%c\n", 65);
```

▶ 출력 결과
```
A
a
A
A
A
A
```

<br/>

#### 예제 2-13. 문자열 출력
```java
System.out.printf("%s\n", "Korea");
System.out.printf("%10s\n", "Korea");
System.out.printf("%10.3s\n", "Korea");
System.out.printf("%S\n", "Korea");
```

▶ 출력 결과
```
Korea
     Korea
       Kor
KOREA
```

<br/>

#### 예제 2-14. 숫자에 쉼표 넣기
```java
System.out.printf("%,d\n", 1234567);
System.out.printf("%,d\n", -1234567);
System.out.printf("%(,d\n", -1234567);
System.out.printf("%(,.2f\n", 1234567.557);
```

▶ 출력 결과
```
1,234,567
-1,234,567
(1,234,567)
1,234,567,56
```

<br/>

#### 예제 2-15. 위치 지정 출력 

```java
System.out.printf("%2$2s %1$2s %1$2s\n", "a", "b");
```

▶ 출력 결과
```
 b  a  a
```

<br/>

#### 예제 2-16. 날짜 및 시간 출력 

```java
System.out.printf("시간: %tT\n", java.util.Calendar.getInstance());
System.out.printf("시간 오전/오후: %tr\n", java.util.Calendar.getInstance());
System.out.printf("날짜: %tF\n", java.util.Calendar.getInstance());
System.out.printf("날짜 요일: %1$tF %1$tA\n", java.util.Calendar.getInstance());
```

▶ 출력 결과
```
시간: 09:18:12
시간 오전/오후: 09:18:12 오전
날짜: 2017-09-18
2017-09-18 월요일
```

<br/><br/>

### 예제 3 Scanner 클래스를 이용한 입력 예제 1
```java
Scanner sc = new Scanner(System.in);

String name;

int age;
char gender;
double height;

System.out.print("이름: ");
name = sc.next(); // 문자열 입력, 공백이 구분 기호이므로 공백은 입력 불가

System.out.print("나이: ");
age = sc.nextInt(); // 정수 입력.

System.out.print("성별(남:M, 여:F): ");
gender = sc.next().charAt(0); // 문자 입력

System.out.print("키: ");
height = sc.nextDouble(); // 실수 입력

System.out.println("이름: " + name);
System.out.println("나이: " + age);
System.out.println("성별: " + gender);
System.out.println("키: " + height);

sc.close();
```

▶ 출력 결과
```
이름: 홍길동
나이: 25
성별: M
키: 178.5
```

##### java.util.Scanner 클래스
- JDK 5.0부터 제공하는 java.util 패키지의 Scanner 클래스를 이용하면 쉽게 키 입력을 받 을 수 있다.
- Scanner 클래스는 System.in을 이용하여 키보드로 입력을 받은 바이트를 문자 단위로 변환하여 원하는 자료형으로 리턴 받을 수 있다.
- Scanner 클래스를 이용하여 키 입력을 받기 위해서는 먼저 java.util.Scanner 클래스를 import 하고 Scanner 클래스의 생성자에 System.in 객체를 인자로 넘겨 Scanner 객체를 생성 한 후에 키 입력을 받는다. 
- 그리고 Scanner 사용이 완료 된 후에는 close() 메소드를 이용하여 Scanner를 닫아 준다.

```java
import java.util.Scanner;
public class ScannerEx{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 소스
		
		sc.close();
	}
}
```

<br/>

> #### String next() 메소드
> - 다음 아이템을 문자열 타입으로 리턴 한다. 기본적인 항목 구분자는 공백(또는 엔터나 탭) 이다.
> 
> #### int nextInt() 메소드 
> - 다음 아이템을 int 타입으로 리턴 한다. 기본적인 항목 구분자는 공백(또는 엔터나 탭)이다.
> 
> #### long nextLong() 메소드
> - 다음 아이템을 long 타입으로 리턴 한다. 기본적인 항목 구분자는 공백(또는 엔터나 탭)이다.
> 
> #### double nextDouble() 메소드
> - 다음 아이템을 double 타입으로 리턴 한다. 기본적인 항목 구분자는 공백(또는 엔터나 탭)이다.
> 
> #### char next().char(0) 메소드
> - Scanner 클래스는 문자를 입력하는 메소드는 없다. 따라서 문자열을 입력 받아 첫글자만 문자로 리턴 한다.

<br/><br/>

### 예제 3 Scanner 클래스를 이용한 입력 예제 2 (nextLine() 메소드)

```java
Scanner sc = new Scanner(System.in);

String name;
int age;
String birth, tel;

System.out.print("이름 ? ");
name = sc.nextLine(); // 중간에 공백도 입력 가능

System.out.print("나이 ? ");
age = sc.nextInt();
sc.nextLine(); // 버퍼의 엔터를 버림

System.out.print("생년월일 ? ");
birth = sc.nextLine();

System.out.print("전화번호 ? ");
tel = sc.nextLine();

System.out.println("이름: " + name);
System.out.println("나이: " + age);
System.out.println("생년월일: " + birth);
System.out.println("전화: " + tel);

sc.close();
```

▶ 출력 결과
```
이름: 홍길동
나이: 25
생년월일: 1993-10-10
전화: 010-1111-1111
```

##### String nextLine() 메소드
- 한 라인 전체(\n 포함)를 문자열 타입 입력받아 마지막 행 단락 문자(\n)를 버린 문자 열을 리턴 한다.
	- 공백도 입력 가능하다.
- sc.nextInt() 메소드로 정수를 입력 받고 바로 sc.nextLine()으로 문자열을 입력 받으면 sc.nextInt()에서 입력되지 않은 엔터(\n)가 sc.nextLine()에 의해 입력되어 아무것도 돌려받지 못한다. 
- 따라서 sc.nextInt()를 사용하여 입력할 경우 sc.nextLine()를 호출하여 엔터(\n)을 버 려야 다음에서 정상적으로 입력이 가능하다.
