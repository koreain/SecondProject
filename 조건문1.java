/*
 *   ���  ���α׷��� �°� ��� �ϴ� ���α׷�
 *   ���ǹ�
 *    ���� if
 *     1) ����
 *        => if(���ǹ�)
 *              ����    ====> ���ǹ��� true�� ������ ����
 *              	====> ���ǹ��� false�� ������ �������� �ʴ´�.
 *        => �������� ������ ���ÿ� ����
 *           if(���ǹ�)
 *           {
 *             ����1
 *             ����2
 *           }
 *           ****** �ڹٿ��� ����� {}����� ���� ��쿡
 *           		�ٷ� �ؿ� �ִ� ���� 1���� ��� �Ѵ�.
 *           
 *        => ������ true, false�� ��, �ٸ� ������ ����
 *           if(���ǹ�)
 *             ����1
 *           else
 *             ����2   
 *             
 *             �ڹٿ��� Ŭ������ �����ö��� import!!
 */

import java.util.Scanner;
//Scanner : Ű���� �Է°��� �޴� ���

public class ���ǹ�1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����  Math.random() => 0.0~0.99
		//int rand=(int)(Math.random()*100)+1;
		//System.out.println("rand = "+rand);
		/*Scanner scan=new Scanner(System.in);
		System.out.print("�����Է�:");
		int num=scan.nextInt(); //nextInt!!�̱� ������ ������ �޾ƿ´�.
		System.out.println("num="+num);*/
		int com=(int)(Math.random()*3); //0,1,2 0�� �� ����, 1�϶� ����, 2�϶� ��
		Scanner scan=new Scanner(System.in);
		System.out.print("����(0), ����(1), ��(2) �Է�:");
		int user=scan.nextInt();
		
		if(user==0)
			System.out.println("�����:����");
		if(user==1)
			System.out.println("�����:����");
		if(user==2)
			System.out.println("�����:��");
		
		if(com==0)
			System.out.println("��ǻ��:����");
		if(com==1)
			System.out.println("��ǻ��:����");
		if(com==2)
			System.out.println("��ǻ��:��");
		
		// ���
		
/*		if(com==0) //��ǻ�� ����
		{if(user==0) 
			System.out.println("����");
		 if(user==1)
			System.out.println("����ڰ� �̰��");
		 if(user==2)
			System.out.println("��ǻ�Ͱ� �̰��");
		}
		
		if(com==1) //��ǻ�� ����
		{if(user==0) 
			System.out.println("��ǻ�Ͱ� �̰��");
		 if(user==1)
			System.out.println("����");
		 if(user==2)
			System.out.println("����ڰ� �̰��");
		}
		
		if(com==2) //��ǻ�� ��
		{if(user==0) 
			System.out.println("����ڰ� �̰��");
		 if(user==1)
			System.out.println("��ǻ�Ͱ� �̰��");
		 if(user==2)
			System.out.println("����ڰ� �̰��");
		}
	*/
		/*
		��ǻ��
		 0    ����� 
		     0==>0   	���
		     1==>-1		����
		     2==>-2		��
		��ǻ��
		 1      �����
		  	 0==>1		��
		  	 1==>0		���
		  	 2==>-1		����
		��ǻ��
		 2      �����
		     0==>2		����
		     1==>1		��
		     2==>0	  	���
		
		*  ==> user: -1, 2 
		*  ==> com: -2, 1
		*  ==> ���: 0
		*/	
		int res=com-user;
		if(res==-1 || res==2)
			System.out.println("������ �̰��");
		if(res==-2 || res==1)
			System.out.println("��ǻ�Ͱ� �̰��");
		if(res==0)
			System.out.println("����");
	}

}
