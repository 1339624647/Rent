package cn.edu.qdu.traffic;

import java.util.Scanner;

public class Rent {
   private int totalPrice;
   private Car car=new Car();
   private Bus bus=new Bus();
   int key;
   int day;
   Scanner input=new Scanner(System.in);
public static void showMenu(){
	System.out.println("***************");
	System.out.println(" �gӭ�M���{����܇ϵ�y");
	System.out.println("***************");
}   
public void askKind(){
	System.out.println("Ո�x��Ҫ���܇ 1.�I܇2.��܇��ֻ��ݔ����̖��:");
	 key=input.nextInt();
	switch (key) {
	case 1:
		car.show();
		System.out.println("��ѡ��Ҫ��Ľγ�1.�e���̄�2.���a���3.���R��ֻ��ݔ����̖��:");
		car.choice();
		break;
	case 2:
		bus.show();
		System.out.println("��ѡ��Ҫ��Ŀͳ�1.16��2.32����ֻ��ݔ����̖��:");
		bus.choice();
		break;

	default:
		System.out.println("�������");
		break;
	}
}
public void count() {
	System.out.println("������Ҫ���������");
	day=input.nextInt();
	switch (key) {
	case 1:
		totalPrice=day*car.getPrice();
		break;
	case 2:
		totalPrice=day*bus.getPrice();
		break;

	default:
		break;
	}
}
public void finalShow() {
	switch (key) {
	case 1:
	System.out.println("����ѡ��"+car.getKind()+"�����Ϊ��"+car.getPrice()+"����"+day+"��"+"�ܷ���Ϊ��"+totalPrice);
	break;
	case 2:
		System.out.println("����ѡ��"+bus.getKind()+"�����Ϊ��"+bus.getPrice()+"����"+day+"��"+"�ܷ���Ϊ��"+totalPrice);
		break;
	default:
		break;
}
}
}
