
/**
 * 
 * @author dzy
 * @date 2020年4月18日
 */
public class Hotel {

	public static void main(String[] args) {
		roomRateMessage();
		Random r = new Random();
		System.out.print("门卡号：");r.Random();
		
	}
	
	 public static void roomRateMessage() {
		String[] hotelNames = {
				"格林豪泰苏州火车站南广场拙政园商务酒店","格雅苏州工业园区金鸡湖东方之门酒店","格林豪泰苏州漕湖工业园智选酒店"};
		String[] roomType = {"大床房","标间","豪华双床房"};
		String[] roomRate1 = {"门市价：189RMB","会员专享价：161RMB"};
		String[] roomRate2 = {"门市价：169RMB","会员专享价：149RMB"}; 
		String[] roomRate3 = {"门市价：209RMB","会员专享价：190RMB"};
		String[] roomRate4 = {"门市价：399RMB","会员专享价：339RMB"};
		String[] roomRate5 = {"门市价：189RMB","会员专享价：161RMB"};
		
		for (int i = 0; i < hotelNames.length; i++) {
			if (hotelNames[i].equals("格林豪泰苏州火车站南广场拙政园商务酒店")) {
				for (int j = 0; j < roomType.length; j++) {
					if (roomType[j].equals("大床房")) {
						for (String s : roomRate1) {
							System.out.println(
									hotelNames[i]+"\t"+"地址：江苏省苏州市姑苏区人民路2156号"+"\t"+roomType[j]+"\t"+s);
						}
					}
					if (roomType[j].equals("标间")) {
						for (String s : roomRate2) {
							System.out.println(
									hotelNames[i]+"\t"+"地址：江苏省苏州市姑苏区人民路2156号"+"\t"+roomType[j]+"\t"+s);
						}
					}
					if (roomType[j].equals("豪华双人房")) {
						for (String s : roomRate3) {
							System.out.println(
									hotelNames[i]+"\t"+"地址：江苏省苏州市姑苏区人民路2156号"+"\t"+roomType[j]+"\t"+s);
				}
			}
		}
	}
		if (hotelNames[i].equals("格雅苏州工业园区金鸡湖东方之门酒店")) {
			for (String s : roomRate4) {
				System.out.println(hotelNames[i]+"\t"+"地址：江苏省苏州工业园区星海街169号"+"\t"+"豪华双人房"+"\t"+s);
			}
		}
		if (hotelNames[i].equals("格林豪泰苏州漕湖工业园智选酒店")) {
			for (String s : roomRate5) {
				System.out.println(hotelNames[i]+"\t"+"地址：江苏省苏州市相城区黄畦路3号"+"\t"+"高级大床房"+"\t"+s);
			}
		}
			
		}	
}
	 }
