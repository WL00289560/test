package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;

public class trydd {

	public static void main(String[] args) {

		/**
		 * 判斷是否全是數字
		 */
//		String s = "123456789h0";
//		
//        if(s.matches("\\d+") && s.length() == 10) {
//        	System.out.println("S長度"+s.length());
//        	Pattern a = Pattern.compile("^[0][9].*$");
//    		Matcher m = a.matcher(s);
//    		//判斷是否是09開頭
//    		if(m.matches()) {
//    			System.out.println(1);
//    		}else {
//    			System.out.println(0);
//    		}
//        } else {
//            System.out.println("不是全數或長度超過10");
//        }
//		List<String> a = new ArrayList<String>();
//		String s = "1";
//		String b = "2";
//		a.add(s);
//		a.add(b);
//		System.out.println(a);
//	}
//		// 產生流水碼
//		SimpleDateFormat sdfTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		System.out.println("時間戳：" + sdfTime.format(new Date()));
//		long b = Math.round(Math.random() * 1000000 - 1);
//		long a = new Date().getTime();
//		System.out.println(a);
//		System.out.println(b);
//		// 取得絕對值
//		double a = 100;
//		double b = Math.abs(a);
//		System.out.println(b);
//		int codeId = 9;
//		switch (codeId) {
//		case 0: {
//			System.out.println("1");
//			break;
//		}
//		case 97: {
//			System.out.println("2");
//			break;
//		}
//		}
//		String date = "2021-05";
//		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//		try {
//			Date d = format.parse(date+"-01");
//		
		// 建立樣本(對照表) array
				int[] array = new int [62];
				for (int i=0; i<array.length; i++)
					if (i<10) array[i] = 48+i;	// 將數字 0-9ASCII碼(Int)放入 array[0-9]
					else if (i<36) array[i] = 55+i;	// 將大寫英文 ASCII碼(Int)放入 array[10-35]
					else  array[i] = 61+i;		// 將小寫英文 ASCII碼(Int)放入 array[36-61]
		 
				int arryBsize = 12;			// 取8個
				int[] arrayB = new int[arryBsize];
				Random r = new Random();
				for (int i=0; i<arryBsize; i++)	
					arrayB[i] = array[r.nextInt(62)];	// 從array陣列中取亂數0-62位置的元素放入arrayB陣列中
					
				for (int i=0; i<arryBsize; i++)
					System.out.print((char)arrayB[i]);	// 將 int 強制轉型 char 印出相對應 ASCII 
				
			

	}

}
