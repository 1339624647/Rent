package cn.edu.qdu.traffic;

import java.util.Scanner;

public class Bus extends Moto {
	public void show(){
		System.out.println("�I܇܇�ͣ�                    16��           32��  ");	
		System.out.println("�����M(Ԫ/��)��     300    600");	
		}     
	     public void choice() {
	     Scanner input=new Scanner(System.in);
	     int c=input.nextInt();
		 String[] kinds={" 16��","32��"};
		 int[] prices={300,600};
		 setKind(kinds[c-1]);
	     setPrice(prices[c-1]);
}
	     }
