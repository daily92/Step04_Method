package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		
		MainClass04.showSum(10,20);
		
		//���� Ŭ���� ��� �̹Ƿ� Ŭ������ ���� ����!
		showSum(1,2);
		
	}
	
	public static void showSum(int num1, int num2) {
		// �� ���� �� ���ϱ�
		int result= num1 + num2;
		// �ֿܼ� ����ϱ�
		System.out.println("�� ���� �� : " + result);
	}
	
	/*
	 * 	�޼ҵ� �� : showSum
	 * 	���� �޴� ������ ���� : 2 ��
	 *  ���� �޴� ������ ������ type : 2 �� ��� int type
	 *  �޼ҵ� �� ������ ���� : ���� ���� 2 �� ������ ���� ���
	 */
}
