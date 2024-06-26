package kr.s08.object.method;

public class MethodArgMain02 {
	// 인자 전달 방식 : 참조 호출 (Call by reference) 
	// 객체의 주소를 인자로 전달하는 방식
	// 주소(reference)를 복사하여 전달
	
	public void increase(int[] n) { // 배열도 객체 n으로 주소 전달됨
		for(int i=0; i<n.length; i++) {
			n[i]++;
		}
	}
	
	public static void main(String[] args) {
		// 배열 선언 및 생성, 초기화
		int[] ref1 = {100, 200, 300};
		System.out.println("===데이터 변경 전===");
		for(int i=0; i<ref1.length; i++) {
			System.out.println("ref1[" + i + "]: " +ref1[i]);
		}
		
		System.out.println("-------------");
		
		MethodArgMain02 ma = new MethodArgMain02();
		ma.increase(ref1);
		System.out.println("===데이터 변경 후===");
		for(int i=0; i<ref1.length; i++) {
			System.out.println("ref1[" + i + "]: " +ref1[i]);
		}
	}
}
