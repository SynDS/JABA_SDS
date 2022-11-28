package Day11.Ex02_Class;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TimeZone;

public class DateTimeCreateEx {

	public static void main(String[] args) {
		//날짜 얻기
		//
		LocalDate nowDate = LocalDate.now();
		System.out.println("현재 날짜 : " + nowDate);
	
		LocalDate endDate = LocalDate.now();
		System.out.println("종료 날짜 : " + endDate);

		LocalTime nowTime = LocalTime.now();
		System.out.println("현재 시간 : " + nowTime);
		
		
		LocalDate endTime = LocalDate.of(3, 30, 0, 0);
		System.out.println("종료 시간 : " + endTime);

		LocalDateTime nowDateTime = LocalDateTime.(now));
		System.out.println("종료 시간 : " + endTime);
		
		ZonedDateTime utcDateTime
		= ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println( "협정 세계시 : " + utcDateTime);
		
		ZonedDateTime seoulDateTime
		= ZonedDateTime.now(ZoneId.of("Asia/Seoul));
		System.out.println( "협정 세계시 : " + seoulDateTime);

					
		LocalDateTime Idt = LocalDateTime.now();
		System.out.println("년도 : " + Idt.getYear());
		
		
		
		
		LocalDate ld = LocalDate.now();
		if (ld.isLeapYear()) {
			System.out.println("올해는 윤년 : 2월 29일까지 " );
			
			
		String[] timeZoneId = TimeZone.getAvailableIDs();
		
		for (String string : timeZoneId) {
			
		}
				
				timeStrings	
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

}