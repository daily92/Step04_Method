package test.main;

public class MainClass01 {
		//�̸��� main �� static member method 
		//void => �����ϰ� ���� � ���� return ���� ���� �� �� �ھ� �δ� ��!!!!
	// ���� ������ ���۵Ǵ� main method
	public static void main(String[] args) {
		System.out.println("main �޼ҵ尡 ���۵�");
		
		// static member method white() ȣ���ϱ�
		/*
		 *  static �޼ҵ�� class ������ �����Ѵ�. <static �ϸ� �ٷ� ���ö�� ��!!!!>
		 *  	static ȣ��=> class �� . ���̸� �ڵ����� ��!
		 */
		MainClass01.white();
		
		System.out.println("main �޼ҵ尡 ���� �˴ϴ�.");
	}
	
	// static member method �߰�
		//�̸��� white �� static member method
	public static void white() {
		System.out.println("white �޼ҵ尡 ���۵�");
		
		System.out.println("white �޼ҵ尡 ���� �˴ϴ�.");
	}
}
