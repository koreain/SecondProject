/*
 *  �������� ==> ����� (true, false) => boolean
 *  ���� && ����
 *  
 * =======================================
 *           			&&        ||        
 * =======================================
 * true true		   true		 true
 * =======================================
 * true false		   false	 true
 * =======================================
 * false true		   false	 true
 * =======================================
 * false false		   false	 false
 * =======================================
 * *** ����ȭ ����ó��
 * && �� ������ false�� �ڿ� �ִ� ������ ó������ �ʴ´�.
 * ||�� �տ� �ִ� ������ true�� �ڿ� �ִ� ������ ó������ �ʴ´�.
 * 
 */
public class �������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10; //���� ����� i�ڿ� j�ڴ� ���ÿ� ���� �ʴ� ���� �򰥸��� �ʴ´�.
		int b=9;
		boolean result=(a<b || ++b==a);
		System.out.println("result = "+result);
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}

}
