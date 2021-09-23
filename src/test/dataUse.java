package test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class dataUse {
	public static void main(String[] args) {
//	//取得指定時間的開頭與結束
//	Date dayStart = null;
//	Date dayLast = null;
//	Calendar calendar = Calendar.getInstance();
//	calendar.set(Calendar.HOUR_OF_DAY, 0);
//	calendar.set(Calendar.MINUTE, 0);
//	calendar.set(Calendar.SECOND, 0);
//	calendar.set(Calendar.MILLISECOND, 0);
//	calendar.set(a, b-1, c);
//	dayStart = calendar.getTime();
//	calendar.set(Calendar.HOUR_OF_DAY, 23);
//	calendar.set(Calendar.MINUTE, 59);
//	calendar.set(Calendar.SECOND, 59);
//	calendar.set(Calendar.MILLISECOND, 999);
//	calendar.set(a, b-1, c);
//	dayLast = calendar.getTime();
//	log.info(dayStart.getTime()+"");
//	log.info(dayLast.getTime()+"");

//	//時間差
//	long nd = 1000 * 24 * 60 * 60;// 一天的毫秒數  
//	long nh = 1000 * 60 * 60;// 一小時的毫秒數  
//	long nm = 1000 * 60;// 一分鐘的毫秒數  
//	long ns = 1000;// 一秒鐘的毫秒數  

//	Calendar c = Calendar.getInstance();              //得到當前日期和時間
//       c.set(Calendar.HOUR,  0 );                        //把當前時間小時變成０
//       c.set(Calendar.MINUTE,  0 );                      //把當前時間分鐘變成０
//       c.set(Calendar.SECOND,  0 );                      //把當前時間秒數變成０
//       c.set(Calendar.MILLISECOND,  0 );                 //把當前時間毫秒變成０

		/**
		 * 判斷日期符合當天
		 * 
		 * @param dgBet
		 * @return
		 */
//	public boolean checkDay(DGBet dgBet) {
//		boolean result = false;
//		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//		// 取得現在的年月日
//		int year = Calendar.getInstance().get(Calendar.YEAR);
//		int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
//		int day = Calendar.getInstance().get(Calendar.DATE);
//
//		// 傳送進來的日期進行拆分
//		Date date = dgBet.getCalTime();
//		String dateString = formatter.format(date);
//		String[] splitDateString = dateString.split("-");
//		int dgBetYear = Integer.parseInt(splitDateString[0]);
//		int dgBetMonth = Integer.parseInt(splitDateString[1]);
//		int dgBetDay = Integer.parseInt(splitDateString[2]);
//		if (year == dgBetYear) {
//			if (month - 1 <= dgBetMonth) {
//				if (day == dgBetDay) {
//					result = true;
//				}
//			}
//		}
//		return result;
//	}

//	/**
//	 * 判斷日期符合大於一天的條件
//	 * 
//	 * @param date
//	 * @return
//	 */
//	@Override
//	public boolean checkDay(Date date) {
//		boolean result = false;
//		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//		// 取得現在的年月日
//		int year = Calendar.getInstance().get(Calendar.YEAR);
//		int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
//		int day = Calendar.getInstance().get(Calendar.DATE);
//
//		// 傳送進來的日期進行拆分
//		String dateString = formatter.format(date);
//		String[] splitDateString = dateString.split("-");
//		int dgBetYear = Integer.parseInt(splitDateString[0]);
//		int dgBetMonth = Integer.parseInt(splitDateString[1]);
//		int dgBetDay = Integer.parseInt(splitDateString[2]);
//		if (year == dgBetYear) {
//			if (month - 1 <= dgBetMonth) {
//				if (day > dgBetDay) {
//
//					result = true;
//				}
//			}
//		}
//		return result;
//	}

//	/**
//	 * 判斷月份符合兩個月內
//	 * 
//	 * @param dgBet
//	 * @return
//	 */
//	public boolean checkMonth(Date dgbetDate) {
//		boolean result = false;
//		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM");
//		// 取得現在的年月
//		int year = Calendar.getInstance().get(Calendar.YEAR);
//		int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
//
//		// 傳送進來的日期進行拆分
//		Date date = dgbetDate;
//		String dateString = formatter.format(date);
//		String[] splitDateString = dateString.split("-");
//		int dgBetYear = Integer.parseInt(splitDateString[0]);
//		int dgBetMonth = Integer.parseInt(splitDateString[1]);
//		if (year == dgBetYear) {
//			if (month - 1 <= dgBetMonth) {
//				result = true;
//			}
//		}
//		return result;
//	}

		/**
		 * 判斷時間相差一分鐘
		 */
//	 Date date=new Date();
//	 long a = date.getTime();
//	 long b = date.getTime()+60000;
//     System.out.println(a);
//     System.out.println(b);
//     SimpleDateFormat df = new SimpleDateFormat();
//     System.out.println(df.format(new Date(a)));
//     System.out.println(df.format(new Date(b)));
//     boolean c = a<b;
//    
//     System.out.println(c);

		// -4小時 前後5分鐘
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		Calendar calendar = Calendar.getInstance();
////		calendar.add(Calendar.HOUR, -4);
//		calendar.add(Calendar.MINUTE, -5);
//		String dateStr = sdf.format(calendar.getTime());
//		calendar.add(Calendar.MINUTE, 10);
//		String dateEnd = sdf.format(calendar.getTime());
//	
//		System.out.println(" "+dateStr +" "+dateEnd);

//		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//		Date a = new Date();
//		String b =format.format(a);
//		
////		String a = format.format("2021-04-21");
//		System.out.println(b);

//		String str = " fadasf$";
//		String regEx="^[A-z0-9!\\\\\\\"#$%&'()*+,\\\\\\\\-./:;<=>?@^_`{|}~]*$";
//		Pattern p=Pattern.compile(regEx);
//		Matcher m=p.matcher(str);
//		if(!m.matches()) {
//			System.out.println("含有特殊字元 ");
//		}else {
//			System.out.println("沒有特殊字元 ");
//		}

//		String one = null;
//		String two = null;
//		String three = "";
//		String four = "";
//		String five = "";
//		int count = 0;
//		for (int a = 1; a <= 3; a++) {
//			one = "" + a;
//			for (int b = 1; b <= 3; b++) {
//				two = "" + b;
//				
//				System.out.println(one+" "+two);
//			}
//		}
//		System.out.println(count);
//
//		//获取当前月第一天：
//		Calendar c = Calendar.getInstance();
//		c.setTime(d);
//		c.add(Calendar.MONTH, 0);
//		c.set(Calendar.DAY_OF_MONTH, 1);//设置为1号,当前日期既为本月第一天
//		String monthfirst = format.format(c.getTime());
//		System.out.println("===============nowfirst:" + monthfirst);
//
//		//获取当前月最后一天
//		Calendar ca = Calendar.getInstance();
//
//		ca.setTime(d);
//		ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
//		String monthlast = format.format(ca.getTime());
//		System.out.println("===============last:" + monthlast);
//		} catch (ParseException e) {
//			System.out.println("err");
//		}.
//		
//		
//		//時間timeZone 設置
//		TimeZone timeZone = TimeZone.getTimeZone("UTC");
//		Calendar calendar = Calendar.getInstance(timeZone);
//		SimpleDateFormat simpleDateFormat = 
//		       new SimpleDateFormat("EE MMM dd HH:mm:ss zzz yyyy",Locale.US);
//		simpleDateFormat.setTimeZone(timeZone);
//
//		System.out.println("Time zone: " + timeZone.getID());
//		System.out.println("default time zone: " + TimeZone.getDefault().getID());
//		System.out.println();
//
//		System.out.println("UTC:     " + simpleDateFormat.format(calendar.getTime()));
//		System.out.println("Default: " + calendar.getTime());
//		Random random = new Random();
//		List<String> s = new ArrayList<String>();
//		s.add("0");
//			System.out.println(s.get(0));
//			for(int i = 0;i<520;i++) {
//			int dealerNumber = random.nextInt(51);
//			System.out.println(dealerNumber);
//	}
		int i2 = 0 ;
		do {
			for(i2 = 0 ; i2 < 10 ; i2++)
			System.out.println(i2);
		    while (i2<4);
			System.out.println("*");
		   }while(i2<10);
	}
}
