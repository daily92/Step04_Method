package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		//showMsg() method �� ȣ���� ������~
		MainClass02.showMsg("hi~~");
		
			//�̹� ���� ������ ���� �������� �Լ��� ����
		String str= "�ȳ�";
		MainClass02.showMsg(str);
		
		// ��Ȳ�� ���� null �� �����ϴ� ��쵵 �ִ�.
		MainClass02.showMsg(null);
	}
	
	// static member method
		//msg <= ���޵Ǵ� ���� ���� ���� 
		//String msg <= ���޵Ǵ� ���� ���� ������ data type
		//<=> function showMsg(msg){
		//	  }
		//<=> var showMsg= function(msg){
		//	  }
	public static void showMsg(String msg) {
		System.out.println("msg:" + msg);
	}
}
