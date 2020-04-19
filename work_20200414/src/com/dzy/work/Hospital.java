package com.dzy.work;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


/**
 *  参照韩金腾、姚鑫     仍有问题，两个自定义时间相减不能作为if语句条件
 * @author dzy
 * @date 2020年4月14日
 */

public class Hospital {

	public static void main(String[] args) throws ParseException {
		Scanner Sc =new Scanner(System.in);
		System.out.println("您好！欢迎进入挂号系统,请输入已挂号次数");
		int num = Sc.nextInt();
		register(num);
	}
	
	public static void register(int num) throws ParseException {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date =new Date();
		//System.out.println(dateFormat.format(date));
		Calendar c = Calendar.getInstance();
		c.add(Calendar.MINUTE, 30);
		Date date2 = c.getTime();
		//System.out.println(dateFormat.format(date2));
		long time = date.getTime();
		long time2 = date2.getTime();
		Scanner s = new Scanner(System.in);
		long timeDiff;
		
		switch (num) {
		case 1:
			System.out.println("挂号成功");
			System.out.println(dateFormat.format(date));
		break;
		case 2:
			System.out.println("请预约第二次挂号时间：yyyy-MM-dd HH:mm:ss");
			Date date3 = dateFormat.parse(s.nextLine());
			long time3 = date3.getTime();
		if (time3>time2) {
			System.out.println("挂号成功");
		}else {
			System.out.println("挂号失败，请稍后再来挂号");
		}		
		break;
		case 3:
			System.out.println("请预约第三次挂号时间：yyyy-MM-dd HH:mm:ss");
			Date date4 = dateFormat.parse(s.nextLine());
			long time4 = date4.getTime();
			timeDiff = (time4-time3)/60000;
			if (timeDiff>30) {
				System.out.println("挂号成功");
			}else {
				System.out.println("挂号失败，请稍后再来挂号");
			}
			
		break;

		default:
			System.out.println("频繁挂号，您已被拉入黑名单");
		}
	}
}
