package com.dzy.model;
/**
 * 高铁票价
 * @author dzy
 * @date 2020年5月4日
 */
public class Price {

	private double fistClassPrice;
	private double secondClassPrice;
	private String city;
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getFistClassPrice() {
		return fistClassPrice;
	}
	public void setFistClassPrice(double fistClassPrice) {
		this.fistClassPrice = fistClassPrice;
	}
	public double getSecondClassPrice() {
		return secondClassPrice;
	}
	public void setSecondClassPrice(double secondClassPrice) {
		this.secondClassPrice = secondClassPrice;
	}
	
	public Price(String city,double fistClassPrice, double secondClassPrice) {
		this.fistClassPrice = fistClassPrice;
		this.secondClassPrice = secondClassPrice;
		this.city = city;
	}
	public Price() {	
	}
	
	
}
