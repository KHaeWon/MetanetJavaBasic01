import java.util.Scanner;

public class Ex04_Operation {
	public static void main(String[] args) {
		
		
		/*
		 for
		 while
		 do~while -> 일단 한 번은 강제적으로 수행하고 그 다음 조건을 보고 판단
		 	->주로 메뉴 구성할 때 do~while문 사용
		 	
		 메뉴 구성
		 do{실행 블럭} while(조건판단)
		 메뉴 구성
		 점심 메뉴를 선택하세요
		 1. 짜장
		 2. 짬뽕
		 3.....
		 입력...
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		int inputdata = 0;
		do {
			System.out.println("숫자 입력 (0~9)");
			inputdata = Integer.parseInt(sc.nextLine()); //되도록이면 nextLine() 쓰기. nextInt()는 가끔 버그있음
			//Integer라는 wrapper클래스 뿐만 아니라 parse계열 함수도 존재
		}while(inputdata >= 10);
		// while 조건이 true면 do를 계속 실행
		// 9 >= 10 -> false -> do 탈출
		System.out.println("당신이 입력한 숫자는 : "+inputdata);
		
		
		//문제
		//while + do~while + switch
		//종료 방법
		//return -> 함수 나오기
		//System.exit(0)
		//논리 종료
		//while(true){특정조건 break...}
		
		int menu = 0; //메뉴 번호
		int money = 0; //금액
		int balance = 0; //잔액
		do {
			System.out.println("1. 예금");
			System.out.println("2. 출금");
			System.out.println("3. 잔고");
			System.out.println("4. 종료");
			
			System.out.print("메뉴 번호를 선택하세요 : ");
			menu = Integer.parseInt(sc.nextLine());
			if(menu==1 || menu==2) {
				System.out.println("금액을 입력하세요 : ");
				money = Integer.parseInt(sc.nextLine());
			}
			
			
			switch(menu) {
			case 1:
				balance += money;
				System.out.println(balance);
				break;
			case 2:
				balance -= money;
				System.out.println(balance);
				break;
			case 3:
				System.out.println(balance);
				break;
	}
		
		}while(menu<4);
		
		
		
		System.out.println("==========================");
		
		/*
		 컴퓨터가 자동으로 나온 가위 , 바위 , 보 에 대해서 사용자가 값을 입력 해서 처리 하세요

		( 예를 들면 : 가위=> 1 , 바위 => 2 , 보 => 3)

​

       double random = Math.random();
		System.out.println(random); // 0<= random < 1
		random = (3*random+1); //1 <= random < 4;
		System.out.println((int)random);
		 */
		
		
		int random = 0;
		boolean auto = true;
		Scanner in = new Scanner(System.in);
		
		
		while(auto) {
			random = (int)(Math.random()*3)+1; //1 <= random < 4;
			//컴퓨터가 정하는 가위, 바위, 보
			
			System.out.println("*********************************");
			System.out.println("1. 가위 | 2. 바위 | 3. 보 | 4. 종료");
			System.out.println("*********************************");
			
			System.out.println("메뉴를 선택하세요");
			int game = Integer.parseInt(in.nextLine());
			
			System.out.println("random = "+random);
			System.out.println("game = "+game);
			
			if(random==game) {
				System.out.println("무승부");
			}else if(random==1) {
				switch(game) {
				case 2:
					System.out.println("승리");
					break;
				case 3:
					System.out.println("패배");
					break;
				}
			}else if(random==2) {
				switch(game) {
				case 1:
					System.out.println("패배");
					break;
				case 3:
					System.out.println("승리");
					break;
				}
			}else if(random==3) {
				switch(game) {
				case 1:
					System.out.println("승리");
					break;
				case 2:
					System.out.println("패배");
					break;
				}
			}
			if(game==4) {
				auto = false;
			}
			
		
		}
		
		
		
		
	}
}
