package fuli;

import java.util.Scanner;

public class fui {
	public static void main(String[] args){ 
		double money,r;
		int years;
		double sum = 0;  //����ܶ� 
		@SuppressWarnings("resource")
		Scanner key=new Scanner(System.in);
		System.out.print("����:");
        money = key.nextDouble();  //����
        System.out.print("����:");
        r = key.nextDouble();   //���� 
        System.out.print("����:");
        years = key.nextInt();    //��Ǯ���� 
        for(int i = 1 ; i<=years; i++)
             sum = (1+ r) * i *money;  
        System.out.println("�����"+years+"���Ĵ���ܶ�Ϊ��"+sum); 
   } 
}
