# 자바 플레이그라운드 #2 구구단 만들기

## 요구 사항

* OpenJDK 17
* Git 2.34.1
* IntelliJ 혹은 그에 준하는 IDE

## 프로젝트를 통해서 얻는 것

* 사용자 값을 입/출력하는 방법
* 변수 데이터 타입 반복문 조건문 등의 기초 문법
* 콜렉션(배열), 메소드, 클래스를 활용한 리팩토링
* IDE 단축키

## 힌트

### 힌트 1. 

* 구글에서 "프로그래밍 4칙 연산"과 같은 키워드로 검색해 곱셈 방법을 찾아 구현한다.
* 계싼 결과를 System.out.println()을 활요해 화면에 출력한다.

Mac + IntelliJ 사용 시, 단축키
* 실행: ctrl + shift + r 
* 한 줄 복사: cmd + d
* 한 줄 이동: alt + shift + 위/아래 방향키 

### 힌트 2.

* 변수 선언 및 할당
```java
public class Gugudan {
    public static void main(String[] args) {
        int result = 4 * 1;
        System.out.println(result);

        result = 4 * 2;
        System.out.println(result);
    }
}
```
* 사용자 지정 입력 방법
```java
import java.util.Scanner;

public class Gugudan {
public static void main(String[] args) {
  System.out.println("구구단 중 출력할 단은? : ");
  Scanner scanner = new Scanner(System.in);
  int number = scanner.nextInt();
  System.out.println("number : " + number);
  int result = number * 1;                
  // 구구단 출력하는 예제 구현        
}
}
```

### 힌트 3.

* while 문
```java
public class Gugudan {
    public static void main(String[] args) {
        int i = 1;
        while (i < 10) {
            // 곱셈 결과 출력
            // i 값을 1 증가
        }
    }
}
```

* for 문
```java
public class Gugudan {
    public static void main(String[] args) {
        for(int i = 1; i < 10; i++) {
            // 곱셈 결과 출력
        }
    }
}
```

### 힌트 4.

* if 문
```java
public class Gugudan {
    public static void main(String[] args) {
        int number = 1;
        if (number < 2) {
            // 에러 메세지
        } else if (number > 9) {
            // 에러 메세지
        } else {
            // 구구단 출력
        }
    }
}
```

### 힌트 5.

* 배열
```java
public class Gugudan {
    public static void main(String[] args) {
        int[] result = new int[9];

        for(int j=2; j < 10; j++) {
            // 앞 단계 실습을 참고해 반복문을 활용해 result 배열에 결과 값을 담고 출력
        }
    }
}
```
