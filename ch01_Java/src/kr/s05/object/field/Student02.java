package kr.s05.object.field;

public class Student02 {
	// 멤버 필드(속성)
	String name;
	int age;
	String hobby;
	
	public static void main(String[] args) {
		// 객체 선언 및 생성
		Student02 student = new Student02();
		// 참조 자료형  참조변수          생성자
		
		// 속성 초기값 -> 정수0 문자열 null임을 확인 가능
		System.out.println(student.name + "," + student.age + "," + student.hobby);
		
		System.out.println("-------------");
		
		// 객체의 멤버 변수에 값 할당
		student.name = "홍길동";
		student.age = 20;
		student.hobby = "축구";
		
		System.out.println(student.name + "," + student.age + "," + student.hobby);
		
	}
}
