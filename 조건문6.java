/*
 * �������ǹ�
 *  ����)
 *    if (���ǹ�)
 *     ����1
 *    else if(���ǹ�)
 *     ����2
 *    else if(���ǹ�)
 *     ����3
 *    else
 *     ����4
 * 
 *  ���⼭ else�� ��� ���� ���� if���� �ȴ�.
 *  ���� if�� ���� ��� �������� ���� ��ȯ�� �� �ִ�
 *  ��� if���� �����Ѵ�
 *  but!!
 *  ���� ���ǹ��� �ϳ��� ������ ��ȯ�Ѵ�.
 * 
 */
public class ���ǹ�6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����if��
		int jumsu=85;
		char hak;
		if(jumsu>=90)
			hak='A';
		else if(jumsu>=80)
			hak='B';
		else if(jumsu>=70)
			hak='C';
		else if(jumsu>=60)
			hak='D';
		else
			hak='F';
		System.out.println("����: "+hak);
	}

}
