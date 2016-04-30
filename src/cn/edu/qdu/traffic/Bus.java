package cn.edu.qdu.traffic;

import java.util.Scanner;

public class Bus extends Moto {
	public void show(){
		System.out.println("轎車車型：                    16座           32座  ");	
		System.out.println("日租費(元/天)：     300    600");	
		}     
	     public void choice() {
	     Scanner input=new Scanner(System.in);
	     int c=input.nextInt();
		 String[] kinds={" 16座","32座"};
		 int[] prices={300,600};
		 setKind(kinds[c-1]);
	     setPrice(prices[c-1]);
}
	     }
