package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		
		MainClass04.showSum(10,20);
		
		//같은 클래스 멤버 이므로 클래스명 생략 가능!
		showSum(1,2);
		
	}
	
	public static void showSum(int num1, int num2) {
		// 두 수의 합 구하기
		int result= num1 + num2;
		// 콘솔에 출력하기
		System.out.println("두 수의 합 : " + result);
	}
	
	/*
	 * 	메소드 명 : showSum
	 * 	전달 받는 인자의 개수 : 2 개
	 *  전달 받는 인자의 데이터 type : 2 개 모두 int type
	 *  메소드 내 에서의 동작 : 전달 받은 2 개 정수의 합을 출력
	 */
}
