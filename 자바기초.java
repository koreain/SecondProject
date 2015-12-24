/*
 *  �ּ�
 *   1) �ڹٽ���
 *     A.java ========> A.class =========> ����
 *         javac(����� ��ȯ)        java(����������)
 *                              ================
 *                                   JVM
 *   2) �ڹٿ��� ����ϴ� ������ ǥ����
 *     1. ����
 *         = 10���� : 100 , 200 . . .
 *         = 8���� : 0(����)
 *         = 16���� : 0x(����)
 *     2. ����
 *         = 'A' , 'ȫ', '0'
 *           'A' : 65  'A'+1 ==> 66
 *           'a' : 97
 *           '0' : 48
 *        ** �� ���ڸ��� ���� ��ȣ�� ������ �ִµ� �̸� ASCII�ڵ�� �Ѵ�.
 *     3. ���ڿ�
 *         = "ABC", "ȫ�浿"
 *     4. �Ǽ�
 *         = 10.5D (8byte), 10.5F(4byte)
 *         = 10.5 (8byte)
 *     5. ��
 *         = true, false
 */
public class �ڹٱ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������
		System.out.println(10);
		// 8����
		System.out.println(011); // 8*1 + 1 = 9
		// 16����
		System.out.println(0x55); // 16*5 + 5 = 85
		// ����ǥ��
		System.out.println('A');
		System.out.println('ȫ');
		// ���ڿ�
		System.out.println("ȫ�浿");
		// �Ǽ�
		System.out.println(10.5); //8byte
		System.out.println(10.5F); //4byte
		// ���� 
		System.out.println(true);
		System.out.println(false);
		
		//���ڿ� ���� (+)
		System.out.println("7"+7+"7"+7+7); //77777
		System.out.println("7"+7+"7"+(7+7)); //777+14 = 77714
		System.out.println(7+7+7+"7"); //217
		
		// ASCII �ڵ� ��
		System.out.println((int)'0'); //49
	}
}
