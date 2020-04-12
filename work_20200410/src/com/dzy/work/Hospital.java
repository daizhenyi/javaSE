package com.dzy.work;

import java.util.Date;

/**
 * 
 * @author dzy
 * @date 2020年4月11日
 */

public class Hospital {

	public static void main(String[] args) {
		
		String userName = "李二吧";
		char sex = '男';
		int age = 18;
		String identityCard = "320525**********2x";
		String address = "江苏苏州*****";
		String medicalHistory = "*****扁桃体发炎*****";
		Date registrationTime = new Date();
		String medicalInsuranceCardNumber = "4855482******";
		
			
		System.out.println("姓名："+userName);
		System.out.println("性别："+sex);
		System.out.println("年龄："+age);
		System.out.println("身份证："+identityCard);
		System.out.println("家庭住址："+address);
		System.out.println("病史："+medicalHistory);
		System.out.println("挂号时间："+registrationTime);
		System.out.println("医保卡号："+medicalInsuranceCardNumber);
		

	}

}
