package kr.s23.object.inter;

// 인터페이스
interface A1 {
	public static final int W = 10; // 원형
	int X = 20;
	static int Y = 30;
	final int Z = 40;
}

public class InterfaceMain01 {
	public static void main(String[] args) {
		// A1 ap = new A1(); // 인터페이스는 객체 생성 불가능
		
		// 상수는 변경 불가능
		// A1.X = 50;
		
		System.out.println("W : " + A1.W);
		System.out.println("X : " + A1.X);
		System.out.println("X : " + A1.Y);
		System.out.println("X : " + A1.Z);
	}
}
