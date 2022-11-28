package Day11.Ex02_Class;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeCmpareEx {

	public static void main(String[] args) {

		//
		LocalDateTime startDateTime = LocalDateTime.of(2022, 11, 10, 9, 0, 0);
		System.out.println("시작일 : " startDateTime);

		LocalDateTime endDateTime = LocalDateTime.of(2023, 6, 29, 9, 0, 0);
		System.out.println("시작일 : " startDateTime);
		
		
		LocalDateTime nowtime = LocalDateTime.now();
		
		if (nowtime.isBefore(endDateTime)) {
			System.out.println("훈련과정 진행중입니다");
			
		}
			
		else if (nowtime.isEqual(endDateTime)) {
			System.out.println(" 종강합니다");
			
		
			
		}
		
		if (nowtime.isBefore(startDateTime)) {
			System.out.println("훈련과정 개강전입니다");
			
		}
			
		else if (nowtime.isEqual(startDateTime)) {
			System.out.println(" 개강합니다");
		else if (nowtime.isEqual(startDateTime)) {
			System.out.println(" 개강합니다");
			
		else if (nowtime.isAfter(startDateTime)) {
				System.out.println(" 개강일이 지났습니다");
		
		
		long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
		long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
		long remainhour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
		long remainmin = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
		long remainsec = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
		
		System.out.println("남은 년도 " + remainYear);
		System.out.println("남은 개월 수 " + remainMonth);
		System.out.println("남은 일 수 " + remainDay);
		System.out.println("남은 시 " + remainhour);
		System.out.println("남은 분 " + remainmin);
		System.out.println("남은 초 " + remainsec);
		
		
		
		
		// between (), 시작일자 종료일자 상수단위에 맞게 반환
		
		remainYear = ChronoUnit.MONTHS.between(startDateTime, endDateTime);
		remainDay = ChronoUnit.DAYS.between(startDateTime, endDateTime)
		
		
				
				System.out.println("남은 년도 " + remainYear);
		System.out.println("남은 개월 수 " + remainMonth);
		System.out.println("남은 일 수 " + remainDay);
		System.out.println("남은 시 " + remainhour;
		System.out.println("남은 분 " + remainmin);
		System.out.println("남은 초 " + remainsec);
		
		//     
		
	}

}
