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
	System.out.println(" 歡迎進入藍橋租車系統");
	System.out.println("***************");
}   
public void askKind(){
	System.out.println("請選擇要租的車 1.轎車2.客車（只能輸入序號）:");
	 key=input.nextInt();
	switch (key) {
	case 1:
		car.show();
		System.out.println("请选择要租的轿车1.別克商務2.林蔭大道3.寶馬（只能輸入序號）:");
		car.choice();
		break;
	case 2:
		bus.show();
		System.out.println("请选择要租的客车1.16座2.32座（只能輸入序號）:");
		bus.choice();
		break;

	default:
		System.out.println("输入错误");
		break;
	}
}
public void count() {
	System.out.println("请输入要租的天数：");
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
	System.out.println("您已选择"+car.getKind()+"日租金为："+car.getPrice()+"共租"+day+"天"+"总费用为："+totalPrice);
	break;
	case 2:
		System.out.println("您已选择"+bus.getKind()+"日租金为："+bus.getPrice()+"共租"+day+"天"+"总费用为："+totalPrice);
		break;
	default:
		break;
}
}
}
