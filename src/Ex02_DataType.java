
public class Ex02_DataType {

	public static void main(String[] args) {
		//int (-21~21)
		int num = 1000000000;
		System.out.println("num = "+num);
		
		// int num2 = 10000000000; 
		// The literal 10000000000 of type int is out of range 
		// literal : 개발자가 직접 입력한 값(있는 그대로의 값)
		
		// long num2 = 10000000000;
		// The literal 10000000000 of type int is out of range
		// 왜??
		// 개발자가 입력한 literal 범위를 자바는 int로 잡음
		// 해결 방법
		long num2 = 10000000000L; //접미사 L을 붙임으로써 더 큰 그릇에 담겠다는 의미
		
		long num3 = 100; //이 100은 사실 int에 담겨있는 것.
		// 속지 않으려면 값을 보지 말고 타입을 보자.(리터럴값에 대해서)
		// long num3 = (long)100; 암시적 형변환, 컴파일러가 알아서 데이터 타입을 변화시켜 주는 것
		// 작은 타입 값을 큰 타입에 넣는 것은 문제가 되지 않음
		
		// 주의할 점
		//int num4 = 10000000000L;
		// Type mismatch: cannot convert from long to int
		// long -> int를 강제로 바꿀 수 없다
		
		//툴이 제시한 해결방법 1
		//큰 타입 -> 작은 타입으로 할 경우
		//int num4 = (int) 10000000000L;
		//System.out.println(num4); //1410065408, 쓰레기 값
		// 쓰레기 값이 나오거나 데이터 손실 발생, 정상적인 방법은 아님
		
		//툴이 제시한 해결방법 2
		long num4 = 10000000000L;
		//담는 그릇을 변화시킨다. 리터럴 크기에 맞게.
		System.out.println("num4 = "+num4);
		
		//int num5 = 1000L;
		int num5 = (int) 1000L;
		//작은 값이었기 때문에 문제가 발생x
		//-> 강제적 형변환
		System.out.println("num5 = "+num5);
		
		// 강제적 형변환
		// 1. 데이터의 손실이나 쓰레기값의 발생을 감안해야 한다.
		// 2. 받는 타입(그릇)을 크게 하자.
		
		
		
		// char
		// 2byte >> 16bit > 유니코드 > 아스키 코드 표 > 
		// 유니코드표는 표준 전산 처리 방식
		
		char ch = '가';
		//char ch2 = '가나'; Invalid character constant
		ch = 'a';
		ch = 'A';
		
		// char는 정수 타입과 호환 가능
		// char -> int
		int charint = ch;
		System.out.println("십진수 : "+charint);
		
		//int -> char
		char charint2 = 'a';
		System.out.println(charint2);
		int intchar = (int)charint2; //개발자가 직접 형변환을 해줘도 상관 없다.
		System.out.println(intchar);
		//A = 65, a = 97
		
		/*
		 1. 할당에 있어서 값을 보지말고 값이 가지는 타입을 보자
		 1.1 리터럴 값에 대해서
		 1.1.1 정수 리터럴의 기본 타입은 int >   100000 , 1000000 , 10000000000L
		 1.1.2 실수 리터럴의 기본 타입은 double
		 
		 2. 암시적 형변환 , 명시적 형변환
		 2.1 큰타입에 작은 타입의 값을 넣는 것은 암시적 형변환를 하기에 개발자 ...그냥 ...사용
		 2.2 작은 타입에 큰타입을 넣고자 한다면 자동 형변환을 지원하지 않기 때문제 강제적(명시적) 형변환
		 2.2.1  접미사 L , l ,   (int)정수 , (long)정수
		 KEY POINT 강제적 형변환  데이터 손실을 감수 .....  책임은 개발자가 져야 한다 .....
		 ex) char c = (char) int 범위값 .... 손실 발생... 
		 */
		
		// 일단 8가지 기본 타입 + String (기본타입)으로 생각하자
		// 원시 타입으로 문자열을 담을 수 없기 때문
		// String은 값 타입처럼 사용해도 문제가 없음. 단, 성능이 좀 떨어짐
		String name = "홍길동";
		name = "홍길동바보";
		
		String color = "red";		
		color = color + "방가방가";
		//자바 + : 산술, 결합
		//오라클 + : 산술만. 결합연산자는 ||
		System.out.println(color);
		
		
		/* js -> 타입을 강제하지 않음
		 * let i;
		 * console.log(i); //undifined
		 * 
		 * i = 100 //값이 들어오면 타입이 정해짐
		 * const c;
		 * 
		 * 요즘 var 쓰지 않음! const나 let 사용
		 * 
		 * let j=10;
		 * console.log(j); //10
		 */
		
		//자바에서 특수문자 처리하기
		char sing = ' ';
		
		//이스케이프 시퀀스 문자 : 특정 문자 앞에 \를 붙이면 다음 값은 데이터로 인정함
		//char sing2 = '\'; Invalid character constant
		char sing2 = '\'';
		
		//quiz
		//홍"길"동
		//이라는 문자열 출력
		String user_name = "홍\"길\"동";
		System.out.println(user_name);
		
		System.out.println("100"+100); //100100 자바에서의 문자열 결합
		
		//quiz
		//"C:\Temp" 문자열을 출력하고 싶음 (String)변수에 담아서
		String str = "\"C:\\Temp\"";
		System.out.println(str);
		
		
		// byte 네트워크 데이터 교환, 파일 처리, 이미지 업로드 >> Array 처리
		// long 화폐
		
		
		// 실수형
		// float : 4byte
		// double : 8byte
		// 실수 리터럴의 기본 타입은 double
		
		// float f = 3.14; //Type mismatch: cannot convert from double to float
		// 3.14라는 리터럴 값은 double에 담겨져 있음.
		
		// 해결 방법 
		// 1. 접미사 추가
		float f = 3.14f;
		System.out.println("f="+f);
		// 감수해야 할 점 -> 데이터의 손실
		
		// 2. 캐스팅
		float f1 = (float) 3.14;
		System.out.println("f1="+f1);
		
		// 받는 그릇을 크게 하자
		// float f = 3.14;
		double d = 3.14;
		
		float data = 1.123456789f;
		System.out.println(data);//1.1234568, 반올림
		
		double data2 = 1.123456789123456789;
		System.out.println(data2); //1.1234567891234568, 반올림
		
		//★중요!!
		//BigDecimal
		//검색해서 정리하기
		//double의 문제점, BigDecimal을 이용해서 크고 정밀한 수를 표현할 수 있다.
		
		double data3 = 100;
		System.out.println(data3); //100.0
		
		double data4 = 100;
		int number = 100;
		//data4+number
		//큰타입 + 작은타입 = 큰타입 => double
		
		//방법1--xxxxx
		//int result = (int)(data4 + number) // 큰 타입을 작은 타입으로 변환했으므로 데이터 손실 발생
		
		//방법2--ooooo
		double result = data4 + number; // 손실x
		System.out.println(result);
		
		/*
		 1. 큰 타입 + 작은 타입 연산 >> 큰 타입
		 2. 타입 간 변환 >> 변수가 가지고 있는 타입을 보자.(암시적, 명시적)
		 3. 명시적(강제적) 데이터 손실을 감안하자.
		 */
		int data5 = 100;
		byte b3 = (byte)data5; //명시적 강제적 형변환
		
		byte b4 = 20;
		int data6 = b4; //컴파일러가 내부적으로 형변환 해줌
		//int data6 = (int)b4; -> 암시적 형변환
		
	}
	
}
