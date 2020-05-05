package com.dzy.test;

import com.dzy.model.Car;


public class RemainOil {

	public static void main(String[] args) {
		Car c = new Car("宝马", "M8", 1968000, 13.6, 248.5, 68, 58.6);
		System.out.println(c.getBrand()+c.getMotorcycleType()+"行驶"+c.getOdometer()+"公里后的剩余油量是："+remainOil(c)+"L");
	}

	public static int remainOil(Car car) {
		Car car2 =car;
		double d = (car2.getOdometer()/100)*car2.getOilConsumption();
		int ro =(int)(car2.getInnage()-d);
		return ro;
	}
}
