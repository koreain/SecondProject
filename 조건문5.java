/*
 *  ���� IF
 *   ����)
 *     if(���ǹ�)  ���ǹ�(true/false)
 *      ����1 ==> true�� �� ����
 *     else
 *      ����2 ==> false�� �� ����
 * 
 *     if(���ǹ�)
 *     {
 *      ����1
 *      ����2
 *     }
 *     else
 *     {
 *      ����3
 *      ����4
 *     }
 *  
 */
import java.util.Scanner;

public class ���ǹ�5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("1~100������ ���� �Է�:");
		int num=scan.nextInt();

		if(num>100 || num<1){
			
			System.out.println("1~100������ ������ �ٽ� �Է����ֽñ� �ٶ��ϴ�.");
		}
		else // ���� �Է��̸�
		{
			//System.out.println("���������� �ԷµǾ����ϴ�.");
	
			
	if(num%2==0){
		System.out.println(num+"��(��) ¦����");
	}
	else{
		System.out.println(num+"��(��) Ȧ����");
	}
	
		}
 }
}
