package cn.edu.qdu.traffic;

import java.util.Scanner;

public abstract class Moto {
	
	private String kind;
	private int price;
	private String num;
	
	public abstract void show();
	public abstract void choice();
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	
}
