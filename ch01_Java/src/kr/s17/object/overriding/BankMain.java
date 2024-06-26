package kr.s17.object.overriding;

import java.util.Scanner;

public class BankMain  {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// 일반 계좌 생성
		BankAccount ba = new BankAccount("123-456", "1234", "김연아", 10000L); // L자 안 붙여도 자동 변환되긴 하지만 정확한 것을 권장
		
		// 계좌 정보 출력
		ba.printAccount();
		
		// 입금하기
		System.out.print("입금: ");
		long money = input.nextLong();
		ba.deposit(money);
		ba.printAccount();
		
		// 출금하기
		System.out.print("출금: ");
		money = input.nextLong();
		ba.withdraw(money);
		ba.printAccount();
		input.close();
	}
}
