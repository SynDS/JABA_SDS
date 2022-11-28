package Day11.Ex02_Class;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateEx {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Date now = new Date();
		System.out.println("now : " now);
		
		
		//원하는 스타일로
		
		String dateFormat = "yyyy년 mm월/dd:mm:ss");
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		String nowStr = sdf.format(now);
		System.out.println(nowstr);
		
		String dateFormat2 = "yyyy년 mm월/dd:mm:ss");
		SimpleDateFormat2 sdf2 = new SimpleDateFormat(dateFormat2);;
		String nowStr2 = sdf2.format(now);
		System.out.println(nowstr2);
		
		String day1 = "2022/11/25";
		String day2 = "2022/12/05";
		
		Date date1 = new SimpleDateFormat("yyyy/MM/dd").parse(day1);
		Date date2 = new SimpleDateFormat("yyyy/MM/dd").parse(day2);
		
		date1.
		
		long gapDays = (date2.getTime() - date1.getTime()) / (1000*60*60*24);
		long gaphours = (date2.getTime() - date1.getTime()) / (1000*60);
		long gapMim = (date2.getTime() - date1.getTime()) / (1000*60);
		long gapSec = (date2.getTime() - date1.getTime()) / (1000);
		
		System.err.println(date1.getTime("1970/01/01 00:00:00 00ms ~ date1까지"));
		System.err.println(date1.getTime() );
		System.err.println(date1.getTime() / 1000);
		System.err.println(date1.getTime() / 1000 / 60);
		System.err.println(date1.getTime() / 1000 / 60 / 60);
		System.err.println(date1.getTime() / 1000 / 60 / 60 / 24);
		
		System.err.println(date2.getTime("1970/01/01 00:00:00 00ms ~ date2까지"));
		System.err.println(date1.getTime() );
		System.err.println(date2.getTime() / 1000);
		System.err.println(date2.getTime() / 1000 / 60);
		System.err.println(date2.getTime() / 1000 / 60 / 60);
		System.err.println(date2.getTime() / 1000 / 60 / 60 / 24);
		
		System.out.println("시험 D-day : " + gapDays);
		System.out.println("시험까지 남은 : " + gap);
		System.out.println("시험까지 남은 : " + gap);
		System.out.println("시험까지 남은 : " + gap);
		System.out.println("시험까지 남은 : " + gap);
		
		System.out.println("Today (년) : " + date1.getYear();
		System.out.println("Today (월) :"  + date1.getMonth();
		System.out.println("Today (일) : " + date1.getDate();
		
		
		
		Calendar calendar = new Calendar();
		calendar.setTime(date1);
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		
		System.out.println("Today (년) : " + year);
		System.out.println("Today (월) :"  + month();
		System.out.println("Today (일) : " + day();
		
				
		
		System.out.println(date1.getTime()):;
		
		int dayTime = (1000 * 60 * 60 * 60 *24);
		int day5TimeValue = 5 * daytime;
		int day10TimeValue = 10 * daytime;
		int day100TimeValue = 100 * daytime;
		
		java.util.Date after5days = new Date();
		after5days.setTime( date1.getTime() + day5TimeValue );
		String after5daysStr = sdf.format(after5days);
		System.out.println(after5daysStr);

		java.util.Date after10days = new Date();
		after10days.setTime( date1.getTime() + day10TimeValue );
		String after10daysStr = sdf.format(after10days);
		System.out.println(after10daysStr);
		
		java.util.Date after100days = new Date();
		after100days.setTime( date1.getTime() + day100TimeValue );
		String after100daysStr = sdf.format(after100days);
		System.out.println(after5daysStr);
		
		
		
		// Date 작업은 Calendar  에서 하자
		//lotto mission 15번 문제
		
		
		
		
			
		
		
		
		//parse
		//parsing 구문분석 구분문자나 형식을 가지는 데이터(문자열)을 분석하는것 
		//			구성성분을 분석하느 과정
		//		복잡한 구조의 데이터을 다루기 쉬운 형태로 바꾸는 과정
		//		데이터를 가공학기 쉬운 상태로 추출하는 과정
		// 		/, . ~ emdemd  피요한 데이터만 추출
		
		
		
		
		
		
		
		
				
				
				
				}

}
