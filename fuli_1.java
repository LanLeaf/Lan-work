package fuli;

import java.util.Scanner;

public class fui {
	public static void main(String[] args){ 
		double money,r;
		int years;
		double sum = 0;  //存款总额 
		@SuppressWarnings("resource")
		Scanner key=new Scanner(System.in);
		System.out.print("本金:");
        money = key.nextDouble();  //本金
        System.out.print("利率:");
        r = key.nextDouble();   //利率 
        System.out.print("年数:");
        years = key.nextInt();    //存钱年数 
        for(int i = 1 ; i<=years; i++)
             sum = (1+ r) * i *money;  
        System.out.println("存入第"+years+"年后的存款总额为："+sum); 
   } 
}
