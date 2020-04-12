package com.dzy.work;

import java.util.Date;

/**
 * 
 * @author dzy
 * @date 2020年4月11日
 */

public class Bus {

	public static void main(String[] args) {
		
		String userName = "戴振毅";
		char sex = '男';
		int age = 18;
		String identityCard = "320525***********x";
		String boardingStation = "前范村";
		String gettingOffStation = "宝带西路首末站北";
		Date boardingTime = new Date(); 
		Date alightingTime = new Date();
		int fare = 4;
		
		System.out.println("姓名："+userName);
		System.out.println("性别："+sex);
		System.out.println("年龄："+age);
		System.out.println("身份证："+identityCard);
		System.out.println("上车站："+boardingStation);
		System.out.println("上车时间："+boardingTime);
		System.out.println("下车站："+gettingOffStation);
		System.out.println("下车时间："+alightingTime);
		System.out.println("车费："+fare+"元");
		
		

	}

}
