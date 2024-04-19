package kr.s26.exception;

public class ExceptionMain04 {
	// 멀티 catch
	// 하나의 catch 블럭에서 여러 개의 예외를 처리할 수 있도록
	// 예상되는 예외 클래스를 여러 개 명시하는 방식
	
	public static void main(String[] args) {
		try {
			int value1 = Integer.parseInt(args[0]);
			int value2 = Integer.parseInt(args[1]);
			int result = value1 + value2;
			System.out.println(value1 + "+" + value2 + "=" + result);
		} catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			// System.out.println("실행 매개값의 수가 부족하거나 숫자를 변환할 수 없습니다.");
			// 예외 정보 제공
			// System.out.println(e.toString());
			// e.printStackTrace();

			// 오류 따로따로 명시하고 싶다면
			if (e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("입력한 데이터가 없습니다.");
			} else if(e instanceof NumberFormatException) {
				System.out.println("숫자가 아닙니다.");
			}
		} catch(Exception e) {
			System.out.println("알 수 없는 예외 발생");
		}
	}
}
