package kr.s03.operation;

public class ForMain01 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		// for 반복문
			// 초기식; 조건식; 증감식
		for(int i=1; i<=5; i++) {
			// syso 컨트롤 스페이스바 -> 프린트엘엔
			System.out.println(i);
		}
		
		System.out.println("============");

		// 수행문이 한 줄일 경우 {} 생략 가능
		for (int i=1; i<=5; i++)
			System.out.println(i);
		
		System.out.println("프로그램 끝");
		
		input.close();
	}
}
