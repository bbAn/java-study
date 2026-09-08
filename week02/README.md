# Week 02

## 학습 기간
2026-09-07 ~ 2026-09-14

## 과제 내용
### 2-1. 자료형 5개
아래 다섯 개를 각각 알맞은 자료형으로 선언하고 출력하세요.   
```
이름      남진경
나이      20
키        174.5
학점      A
재학여부   true
```
힌트: 다섯 개가 전부 다른 자료형입니다.

#### - 실행 결과
![2-1 실행 결과](./images/2-1.png)

### 2-2. int 의 한계
int 변수에 21억보다 큰 수를 넣고 실행하세요.   
오류 메시지를 그대로 적고, 어떻게 고쳤는지 쓰세요.    

#### - 실행 결과
2200000000을 지정 하였고 아래와 같이 오류가 발생 (6줄)   
long value = 2200000000L;로 수정하여 오류 해결

![2-2 실행 결과](./images/2-2.png)

### 2-3. char 에 두 글자
char 변수에 글자 두 개를 넣어 보고 오류 메시지를 적으세요.   
char 와 String 이 뭐가 다른지 한 줄로 정리하세요.   

오류 메시지 아래 실행 결과 이미지 참고 (6줄)   
char는 ' ' 안에 한 글자만을 담고 String은 " " 안에 여러 문자를 담음

#### - 실행 결과
![2-3 실행 결과](./images/2-3.png)

### 2-4. final
final로 선언한 변수의 값을 바꿔 보고 오류 메시지를 적으세요.   
final 이 왜 필요한지 한 줄로 쓰세요.    

오류 메시지 아래 실행 결과 이미지 참고 (7줄)    
final은 값이 바뀌면 안되는 중요한 데이터나 값을 고정하여 안정성을 높이고 실수를 방지

#### - 실행 결과
![2-4 실행 결과](./images/2-4.png)

### 2-5. 값 돌려 바꾸기
변수 3개의 값을 서로 돌려 바꾸세요.   
a -> b,  b -> c,  c -> a   
바꾸기 전과 후를 각각 출력해서 확인하세요.   

#### - 실행 결과   
바꾸기 전   

![2-5-1 실행 결과](./images/2-5-1.png)

바꾼 후   

![2-5-2 실행 결과](./images/2-5-2.png)

## 도전 과제
### 도전 1. 흔한 실수 4개 직접 내보기
아래 네 줄을 그대로 쳐서 오류를 확인하고, 각각 어떻게 고치는지 적으세요.   
```
  char c = "A";
  String s = 'abc';
  long n = 10000000000;
  float f = 3.14;
```
이 네 개가 이번 주 오류 실험입니다.   

#### - 실행 결과
![도전 1 실행 결과](./images/challenge-1.png)

오류 수정 방법 
``` java
char c = 'A'; // ''를 ""로 수정
String s = "abc"; // ''을 ""로 수정
long n = 10000000000L; // 뒤에 L 붙임
float f = 3.14f; // 뒤에 f 붙임
```

### 도전 2. 변수 이름 규칙
아래 이름들을 직접 선언해 보고, 안 되는 것과 그 이유를 적으세요.      
```
 userName    2age    my-name    int    Age    MAX_SIZE
```

```java
    String userName = "홍길동"; // 변수 선언 가능
    int 2age = 20; // 변수명이 숫자로 시작 할 수 없음
    String my-name = "홍길동"; // 변수명에 - 을 포함 할 수 없음
    float int = 3.14f; // 변수명에 예약어 사용할 수 없음
    long Age = 10L; // 변수 선언 가능
    int MAX_SIZE = 100; // 변수 선언가능
```

### 도전 3. 성적표 출력
- 이름, 국어, 영어, 수학을 변수에 넣고 총점과 평균을 계산해 출력하세요.   
조건: 점수를 바꿀 때 맨 위 4줄만 고치면 되도록 만들 것.   
println 안에 숫자를 직접 쓰면 안 됩니다.   

#### - 작성 코드 
```java
        String studentName = "홍길동";
        double kor = 90;
        double eng = 95.5;
        double mat = 100;
        final int SUBJECT_COUNT = 3;
        double total = kor + eng + mat;
        double avg = total / SUBJECT_COUNT;
        System.out.println("이름 " + studentName);
        System.out.println("총점 " + total);
        System.out.println("평균 " + avg);
```
#### - 실행 결과
  ![도전 3 실행 결과](./images/challenge-3.png)

## 제출 전 확인
- [x] public static void main 이 맞는가
- [x] 파일명과 클래스명이 같은가
- [x] 모든 문장 끝에 세미콜론이 있는가
- [x] char 는 작은따옴표, String 은 큰따옴표인가
- [x] long 뒤에 L, float 뒤에 f 를 붙였는가
- [x] 변수 이름이 카멜 표기법인가
- [x] 오류 메시지를 줄 번호까지 적었는가
