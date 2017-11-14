package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		//showMsg() method 를 호출해 보세요~
		MainClass02.showMsg("hi~~");
		
			//이미 만들어서 변수에 담은 참조값을 함수에 전달
		String str= "안녕";
		MainClass02.showMsg(str);
		
		// 상황에 따라 null 을 전달하는 경우도 있다.
		MainClass02.showMsg(null);
	}
	
	// static member method
		//msg <= 전달되는 값을 받을 변수 
		//String msg <= 전달되는 값을 받을 변수의 data type
		//<=> function showMsg(msg){
		//	  }
		//<=> var showMsg= function(msg){
		//	  }
	public static void showMsg(String msg) {
		System.out.println("msg:" + msg);
	}
}
