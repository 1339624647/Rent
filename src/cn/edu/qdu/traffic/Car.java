package cn.edu.qdu.traffic;

import java.util.Scanner;

public class Car extends Moto {
   	public void show(){
		System.out.println("轎車車型：       別克商務           林蔭大道          寶馬");	
		System.out.println("日租費(元/天)：       800     600     1000 ");	
		}     
	public void choice() {
		 Scanner input=new Scanner(System.in);
		 int c=input.nextInt();
		 String[] kinds={"別克商務","林蔭大道","寶馬"};
		 int[] prices={800,800,1000};
		 setKind(kinds[c-1]);
		 setPrice(prices[c-1]);
}
}
