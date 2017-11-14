package test.main;

public class MainClass01 {
		//이름이 main 인 static member method 
		//void => 수행하고 나서 어떤 값도 return 하지 않음 을 못 박아 두는 것!!!!
	// 실행 순서가 시작되는 main method
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작됨");
		
		// static member method white() 호출하기
		/*
		 *  static 메소드는 class 명으로 접근한다. <static 하면 바로 떠올라야 해!!!!>
		 *  	static 호출=> class 명에 . 붙이면 자동으로 떠!
		 */
		MainClass01.white();
		
		System.out.println("main 메소드가 종료 됩니다.");
	}
	
	// static member method 추가
		//이름이 white 인 static member method
	public static void white() {
		System.out.println("white 메소드가 시작됨");
		
		System.out.println("white 메소드가 종료 됩니다.");
	}
}
