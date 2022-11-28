package Day11.Ex02_Class;

import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateTimeOperationTime {

	public static void main(String[] args) {

		LocalDateTime now = LocalDateTime.now();
		
		System.out.println( " 현재 시간 : " + now);
		
		LocalDateTime targeTime = now.plusYears(1);
		
		System.out.println("변경시간 :" + targeTime);
		
		targeTime = now.withYear(1972);
				targeTime = now.withMonth(10);
				targeTime = now.withDayOfMonth(29);
				targeTime = now.withHour(06);
				targeTime = now.withMinute(00);
				targeTime = now.withSecond(00);

				
		targeTime = now.with(TemporalAdjusters.firstDayOfMonth());
		
		
		targeTime = now.with(TemporalAdjusters.dayOfWeekInMonth());

				
		targeTime = now.with(TemporalAdjusters.firstDayOfNextMonth());

				
		targeTime = now.with(TemporalAdjusters.firstDayOfNextYear());
		
				
		targeTime = now.with(TemporalAdjusters.firstInMonth());
		
		
		targeTime = now.with(TemporalAdjusters.firstDayOfMonth());
		
		
		
		
		
	}

}
