package Day11.Ex02_Class;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarEx2 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println( cal.get(Calendar.YEAR));
		System.out.println( cal.get(Calendar.MONDAY));
		System.out.println( cal.get(Calendar.DAY_OF_MONTH));
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String today = sdf.format(cal.getTime());
		System.out.println();
		
		cal.add(Calendar.MINUTE, 10);
		String after10Min = sdf.format(cal.getTime());
		System.out.println(after10Min);
		
		cal.add(Calendar.HOUR, 1);
		String after1hour = sdf.format(cal.getTime());
		System.out.println(after1hour);
		
		cal.add(Calendar.DAY_OF_MONTH,1);
		String after1Day = sdf.format(cal.getTime());
		System.out.println(after1Day);
		
		// lotto 추첨일시
		// 매일 6시부터 24시 판매, 추첨일 토요일 다일 8시가까지 판매마감
		// 추첨일 오후 8시부터 다음날 일요일 오전 6시까지 판매정지
		//일요일 오전 6시 ~ 토요일 오후 8시 : 이번주 9시 추첨
		// 구입요일?, 구입시간?
		
		Calendar lottoCal = Calendar.getInstance();
		int 요일 = lottoCal.get(Calendar.DAY_OF_WEEK);
		int 시간 = lottoCal.get(Calendar.HOUR);
		int ampm = lottoCal.get(Calendar.AM_PM);
		
		String todayofWeek = "요일"
				switch (key) {
				case 1:	todayofWeek = "일" ;	break;
				case 2:	todayofWeek = "월" ;	break;
				case 3:	todayofWeek = "화" ;	break;
				case 4:	todayofWeek = "수" ;	break;
				case 5:	todayofWeek = "목" ;	break;
				case 6:	todayofWeek = "금" ;	break;
				case 7:	todayofWeek = "토" ;	break;

				System.out.println(요일); 
				System.out.println(시간); 
				System.out.println(ampm); 
				System.out.println(todayofWeek);
				
				if (todayofWeek.equals("토") && 시간) >= 8 && ampm == 1 ){
					System.out.println("구입불가");
				
					else if (todayofWeek.equals("일") && 시간) >= 8 && ampm == 6 ){
					System.out.println("구입불가");
						
					else if (todayofWeek.equals("토") && 시간) >= 8 && ampm == 1 ){
					System.out.println("구입불가");
							
				else if (todayofWeek.equals("일") && 시간) >= 8 && ampm == 0 ){
					
					
					
					lottoCal.add(Calendar.DATE, 6);	
					lottoCal.set(Calendar.HOUR, 9);	
					lottoCal.set(Calendar.MINUTE, 0);	
					lottoCal.set(Calendar.SECOND, 0);	
					
					
				
				} 
				
				else {
					lottoCal.add(Calendar.DATE, 7-요일 );
					buyin
				}

				}
				}
				
				
				
				
		
		
		
	}
}
