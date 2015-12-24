/*
 * �ڷ���
 *  ������
 *    byte  (1byte)  -128 ~ 127 (����, ��Ʈ��ũ�󿡼� �̿�)
 *    short (2byte)  -32768 ~ 32767 (���󵵰� ����)
 *    int	(4byte)  -21��4õ ~ 21��4õ
 *      => �Ϲ� ���� (default=> int)
 *    long  (8byte)  -2^63 ~ 2^62
 *      ******* int vs. long => 100L(l)
 *  �Ǽ���
 *    float (4byte) : �Ҽ������� 6�ڸ�
 *    double(8byte) : �Ҽ������� 15�ڸ�
 *      => �Ϲ� �Ǽ� (default=> double)
 *      ******* float vs. double => 10.5F(f), 10.5D(d)
 *        D(d)�� ���� ����
 *  ������
 *    char  (2byte) : ���� �� ���� ǥ�� 'A','ȫ'
 *      0~65535 => ������ �� ǥ���� �� �ֵ�. (UNICODE)
 *  ����
 *    boolean (1byte) : true, false
 *      ==> ���ǻ��
 * ===============================> ������ ����� �޸� ũ�⸦ ������ �� ���
 * 
 * ==> ������ ���� ���
 *  1) ���� ������ �����ϴ� �޸��� ��Ī : ����
 *     ���� : ���ϴ� ��(�������� �ʿ�ø��� �����ؼ� ����� ����)
 *     ��� : ������ �ʴ� ��(final, �������� �ʿ��� ��)
 *     
 *     => ���� ����
 *        �޸� ũ�⼱��     ������ ����     =  ��
 *           int       a    =  10
 *           *** ���� ���󿡼�{} ���� �̸��� ������
 *               ����� �� ����.
 *               
 *        ���� �Ŀ� ���߿� ���� ����
 *        int a;
 *        a=10;
 *        int a,b,c;
 *        a=1, b=2, c=3;
 *        int a=10, b=20, c=30; (��, ���� ���̿��� �Ѵ�.)
 *     
 *      => ������ ����� (�ĺ���)
 *        1) ���ĺ��̳� �ѱ۷� ���� (��, ���ĺ��� ��ҹ��� ����)
 *        2) ���ڷ� ������ �Ұ��ϴ�.(�߰��� ���� ���ڴ� ����)
 *        3) Ư������ $, _ �ΰ����� ��밡��
 *        4) keyword(�����)�� ��� �Ұ�
 *           �ڹٿ��� �̹� ������� �ܾ� int, long, public, private, class..........
 *        5) ������ ���̴� ������ ���� (3~7��)
 *      ***** ������ �ƴѵ�..
 *        ��ӵ� �κ� (�ڹ� �����ڳ�����)
 *        1) Ŭ�������� �빮�� (ù����) ex) Main....
 *        2) ����, �޼ҵ� (ù����) �ҹ��ڷ�   ex) a, b, kor.....
 *  	  3) �ΰ��̻��� �ܾ �̿��� �� �ι�° ������ �빮��   ex)mainClass, fileName...... (��Ÿ���� ǥ����, camel)
 *     
 *     => �ڷ����� ��ȯ
 *        �ڷ����� ũ��
 *        
 *             byte < short < int < long < float < double
 *                    char
 *         *�ڷ����� �۰� �����. 
 *          (int)10.5 => (double => int)
 *                         8byte    4byte
 *           ��������ȯ(down-casting, explicit casting)
 *         
 *         **�ڷ����� ũ�� �����.
 *          (double)10 => (int => double)
 *                         4byte  8byte
 *          ===> �ڵ�����ȯ (���� ����ø���)
 *               'A' + 1
 *           1) 'A' => 65
 *           2) 65+1 => 66
 *      
 *       ==> int a = 10000000000
 *                   -----------
 *                    1��°�� �ν�
 *              ----
 *              2���� �ν� => ������ ������ �����Ƿ� ����. ����
 *              
 *           int a = 10000000000L �� ����
 *           �׷�. ������ ����� int ������ �ɸ�. long�� int�� �������!! long�� 8byte�ε� int 4byte�� �ְԵǸ� ������ �ս��� �߻��Ѵ�.
 *           ���� 
 *           int�� long���� ������
 *           long a = 10000000000L�� �´� ǥ���� �ȴ�.
 *      
 *      ==> int ���� (byte, short, char) => ���������� int
 *          byte+byte = int
 *          char+char = int
 *          short+short = int
 *      ==> �������� ū ���������� ���� ����.
 *          int+byte = int
 *          int + long = long
 *          double + int = double
 *          float + int = float
 *                             
 *  2) ���� ������ �����ϴ� �޸��� 
 */
public class �ڹ��ڷ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int a = 128;
		byte b = (byte)a;
		System.out.println(b);
		*/
		byte byteValue=127;
		short shortValue=32767;
		int intValue=2140000000;
		long longValue=3000000000000000000L;
		float floatValue=10.5F;
		double doubleValue=10.5D;
		char charValue='ȫ';
		boolean booleanValue=true;
		System.out.println("byteValue="+byteValue);
		System.out.println("shortValue="+shortValue);
		System.out.println("intValue="+intValue);
		System.out.println("longValue="+longValue);
		System.out.println("floatValue="+floatValue);
		System.out.println("doubleValue="+doubleValue);
		System.out.println("charValue="+charValue);
		System.out.println("booleanValue="+booleanValue);
		
		int a=10;
		int b=~a;
		System.out.println(b);
	}
}
