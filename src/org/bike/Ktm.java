package org.bike;

public class Ktm extends Bike {
	
	@Override
	public void cost() {
		System.out.println("Cosr: KTM starts from 1.5L INR");
//		super.cost();
	}
	
	@Override
	public void speed() {
		System.out.println("Speed: Speed ranges from 100 - 150 km/hr");

//		super.speed();
	}
	
	public static void main(String[] args) {
		Ktm k = new Ktm();
		k.cost();
		k.speed();
	}

}
