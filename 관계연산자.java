/*
 * ���迬���� ==> ����� (true/false) boolean
 *   == ���� (*********)
 *   != ���� �ʴ�
 *   < �۴�
 *   > ũ��
 *   <= �۰ų� ����
 *   >= ũ�ų� ����
 */
public class ���迬���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=9;
	/*	boolean result=(a== ++b); //a=10, b=10
		System.out.println("result = "+result);
		result=(a== b++); //a=10, b=10
		System.out.println("result = "+result);
		result=(a== b); //a=10, b=11
		System.out.println("b = "+b);
		System.out.println("result = "+result);
		*/
		boolean result=(a!=b); //true
		System.out.println("result = "+result);
		
		System.out.println("b = "+b);		
		int c=b++;
		System.out.println("b = "+b);		
		/*
		 * int a=10;
		 * int c = ++a ==> c:11
		 * 
		 * int c = a++ ==> c:10
		 */
		result=(a!=c);
		System.out.println("c = "+c);
		System.out.println("result = "+result);

	}

}
