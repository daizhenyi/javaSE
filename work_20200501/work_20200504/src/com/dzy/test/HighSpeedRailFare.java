package com.dzy.test;

import com.dzy.model.Price;
import com.dzy.uitls.Station;
/**
 * 
 * @author dzy
 * @date 2020年5月4日
 */
public class HighSpeedRailFare {

	public static void main(String[] args) {
		System.out.println("您好！欢迎乘坐沪宁高铁，您本次乘坐的班次是：G7029。");
		Price pr = new Price();
		pr.setCity(Station.SUZHOU.toString());
		System.out.println("您选择的站点是："+city(pr.getCity())+"\t一等座价格："+fare(pr).getFistClassPrice()+"\t二等座价格："+fare(pr).getSecondClassPrice());
	
	}
	
	public static String city(String cityName){
		Station s =Station.valueOf(cityName);
		String cityName1 ="此次高铁路线没有该站点";
		switch (s) {
		case NANJING:
			cityName1 = "南京";
			break;
		case ZHENJIANG:
			cityName1 = "镇江";
			break;
		case DANYANG:
			cityName1 = "丹阳";	
			break;
		case CHANGZHOU:
			cityName1 = "常州";		
			break;
		case WUXI:
			cityName1 = "无锡";			
			break;
		case SUZHOU:
			cityName1 = "苏州";
			break;
		case SHANGHAI:
			cityName1 = "上海";
			break;
		}
		return cityName1;
	}
	
	public static Price fare(Price price){
		Price p = price;
		if ((city(p.getCity())).equals("南京")) {
			p.setFistClassPrice(0);p.setSecondClassPrice(0);
		} else if((city(p.getCity())).equals("镇江")){
			p.setFistClassPrice(44.5);p.setSecondClassPrice(29.5);
		} else if((city(p.getCity())).equals("丹阳")){
			p.setFistClassPrice(64.5);p.setSecondClassPrice(39.5);
		} else if((city(p.getCity())).equals("常州")){
			p.setFistClassPrice(99.5);p.setSecondClassPrice(64.5);
		} else if((city(p.getCity())).equals("无锡")){
			p.setFistClassPrice(129.5);p.setSecondClassPrice(79.5);
		} else if((city(p.getCity())).equals("苏州")){
			p.setFistClassPrice(159.5);p.setSecondClassPrice(99.5);
		} else if((city(p.getCity())).equals("上海")){
			p.setFistClassPrice(219.5);p.setSecondClassPrice(139.5);
		}
		return p;
	}
	

}
