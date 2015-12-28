/*
 * ���α׷� ���� ���
 * 	1) ���������� => ���� 
 * 	2) ������ ����ó�� => ������
 *  3) ó���� ��� ���	 => System.out.println()
 *     => System.out.println() : new Line
 *        System.out.println("abc");
 *        System.out.println("def");
 *        abc
 *        def
 *     	  System.out.print() : ���� ���
 *        System.out.print("abc");
 *     	  System.out.print("def");
 *        abcdef
 *        System.out.printf() : ������ ������ �ִ� ���
 *        System.out.printf("%d%d%d",10,20,30);
 *        102030 	
 *        System.out.printf("%5d%5d%5d",10,20,30);
 * 		  10 20 30
 * 
 *        �ڹ�: SUN ==> Oracle
 *            ===	  =======
 *            1.7		1.8  => pointer   <-���ٽ�, ����ȥ
 *                          c + ���̽�
 * 
 *  * ��Ʈ�̵� ������ (<< �ަU�̵�, >> �������̵�)
 * 10<<2 ==> ���������� ��ȯ�Ŀ� �ڿ� 0�� 2�� �ٿ���.
 * 10=> 1010 (1010 00) 
 * x << y ==> x*2^y
 * 
 * 10>>2 ==> ���������� ��ȯ�Ŀ� �ڿ��� 2�� ����
 * 10 => 10(10)�� == 10(2)
 * x>>2 ==> x/(2^y)
 *  * 
 */
public class ��Ʈ�̵������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		System.out.printf("%5d%5d%5d",10,20,30);
		System.out.printf("%-5d%-5d%-5d",10,20,30);*/
		
		int a=10;
		int b=2;
		int c=a<<b;
		int d=a>>b;
		System.out.println("c = "+c);
		System.out.println("d = "+d);
		//System.out.println(Integer.toBinaryString(a));
		//System.out.println(Integer.toBinaryString(c));
	}

}
