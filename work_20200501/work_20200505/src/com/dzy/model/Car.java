package com.dzy.model;
/**
 * 
 * @author dzy
 * @date 2020年5月5日
 */
public class Car {
	private String brand;
	private String motorcycleType;
	private double price;
	private double oilConsumption;
	private double odometer;
	private int carTankVolume;
	private double innage;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getMotorcycleType() {
		return motorcycleType;
	}
	public void setMotorcycleType(String motorcycleType) {
		this.motorcycleType = motorcycleType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getOilConsumption() {
		return oilConsumption;
	}
	public void setOilConsumption(double oilConsumption) {
		this.oilConsumption = oilConsumption;
	}
	public double getOdometer() {
		return odometer;
	}
	public void setOdometer(double odometer) {
		this.odometer = odometer;
	}
	public int getCarTankVolume() {
		return carTankVolume;
	}
	public void setCarTankVolume(int carTankVolume) {
		this.carTankVolume = carTankVolume;
	}
	public double getInnage() {
		return innage;
	}
	public void setInnage(double innage) {
		this.innage = innage;
	}
	public Car(String brand, String motorcycleType, double price, double oilConsumption, double odometer,
			int carTankVolume,double innage) {
		this.brand = brand;
		this.motorcycleType = motorcycleType;
		this.price = price;
		this.oilConsumption = oilConsumption;
		this.odometer = odometer;
		this.carTankVolume = carTankVolume;
		this.innage = innage;
	}
	
	public Car() {
	}

}
