package cn.edu.qdu.traffic;

import java.util.Scanner;

public class Car extends Moto {
   	public void show(){
		System.out.println("�I܇܇�ͣ�       �e���̄�           ���a���          ���R");	
		System.out.println("�����M(Ԫ/��)��       800     600     1000 ");	
		}     
	public void choice() {
		 Scanner input=new Scanner(System.in);
		 int c=input.nextInt();
		 String[] kinds={"�e���̄�","���a���","���R"};
		 int[] prices={800,800,1000};
		 setKind(kinds[c-1]);
		 setPrice(prices[c-1]);
}
}
