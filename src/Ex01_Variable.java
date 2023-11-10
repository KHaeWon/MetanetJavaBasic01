import kr.or.kosa.Emp;

// 클래스 == 설계도
// 설계도 == 데이터 타입
class Test{
	int data; 
	// 인스턴스 변수
	// 초기화를 하지 않아도 됨
	// default 값을 가지고 있기 때문
	// 정수 -> 0
	// 객체마다 다른 값을 가질 수 있으므로 이렇게 만듦
}

public class Ex01_Variable {

	public static void main(String[] args) {

		int value;
		//System.out.println(value); 실행 시 error
		//초기화를 안 했기 때문
		
		//변수가 함수 안에 들어있음.
		//그런 변수를 지역변수라고 함
		//ctrl + f11로 run
		
		value = 100; //초기화, 즉 할당
		
		int age = 99; //선언과 할당을 동시에 하자.
		
		// 초기화의 정의
		// 변수의 초기화란?
		// 변수가 처음 값을 갖는 것(할당을 통해서)
		
		Test test = new Test(); //메모리에 올리기
		System.out.println(test.data); //.은 주소를 찾아가는 연산자, 힙 메모리에 감
		//data는 인스턴스 변수이므로 할당을 하지 않아도 0이라는 값이 나옴
		
		//Test도 참조 타입. 주소를 가지고 있음
		
		Emp emp; //즉 Emp클래스는 타입이 됨
		//emp는 아무것도 할당x -> null값
		//emp라는 지역변수는 Emp 클래스 객체의 주소를 받을 준비가 돼있음
		
		emp = new Emp(); //주소값을 가짐
		
		//캡슐화의 목적 -> "직접 할당을 막는 것" 
		//무엇을 통헤서? 간접 할당을 통해서! 예를 들면 setter
		
		emp.setEmpno(100);
		int empnodata = emp.getEmpno();
		
		System.out.println(emp); //kr.or.kosa.Emp@5e91993f
		
		Emp emp2 = emp; //emp가 주소값이므로 emp2도 주소값
		System.out.println(emp2==emp); //true
		
		//정리
		//Test도 타입
		//test도 변수
		//클래스 == 설계도 == 데이터 타입
		//메모리에 올리려면 new 사용
		
		int a, b, c; //같은 타입 나열 > 반복된 것이므로 > array를 사용하자 > int[] a;
		//이렇게 선언된 변수들은 초기화 되어있지 않음
		a = 100;
		b = 200;
		c = 300;
		
		//int age = 200; error, 같은 지역에 같은 변수명 x
		
		//result 초기화
		int result = a + b; 
		
		int k = 100;
		int y = k;
		y=200;
	}

}
//main함수x인 클래스 -> 독자적 실행 불가, 다른 클래스를 도와줌, 즉 이건 라이브러리라고 부름
//클래스 종류 2가지 -> main 존재 유무에 따라

/*
블럭주석

클래스 == 설계도 == 데이터 타입 명제는 ^^

클래스의 종류
1. class Car {} > main 함수를 가지고 있지 않은 클래스 > 독자적인 실행이 불가능 > 다른 클래스에 도움을 주는 클래스(lib)
2. class Car { public static void main(String[] args){} } > main함수를 가지고 있는 클래스 > 독자적인 실행 가능
3. 현재는 main함수를 가지고 있는 클래스가 있어야 결과를 확인 할 수 있다
4. public static void main(String[] args) >> static (new 없이도 메모리에 생성) >> 함수의 이름 (main) :시작점,진입점 >> 약속

TIP)
C# 코드 >> class Car { public static void Main(String[] args){} }

변수 : variable
데이터 (자료) 담을 수 있는 공간(메모리)의 이름
공간(크기) >> 데이터 타입(자료형) >> 메모리의 공간이 한정 >> 최소한의 공간 최대한 데이터 표현
int data =100;
-> byte형이 더 효율적일까? 지금은 별로.. 그냥 int 씁시다 ㅎ

변수가 선언되는 위치(scope : 유효범위)
1. instance variable : 객체변수(클래스안에)  >> class Car { public int door;}
2. local variable : 지역변수 (함수안에)     >> class Car { public void run(){ int data=0; } }
3. static variable : 공유자원 (객체간)      >> class Car {public static int num;}
num이라는 자원을 객체들 간 공유 가능
이 자원은 힙에 생성된 다른 객체들이 바라보겠다..?
예를 들면 자동차가 몇대 만들어졌는지 보고싶을 때,
기아 현대가 있다고 치자
그러면 기아랑 현대에 각각 1씩 추가하는 게 아니라
static num을 +1만 해주면 되겠지?
근데 단점은 num이 바뀌면 기아랑 현대가 모두 값이 바뀐다는 것

4. 함수안에 있는 제어블럭 안에 있는 변수 (if , for) 블럭변수 >> class Car {  void run(){ for(int i=0...  }  for(int i=0...  }   }
제어블럭 안에 있으니까 제어블럭이 끝나면 소멸되어버림
즉 4번은 가장 작은 scope을 가짐
*/
