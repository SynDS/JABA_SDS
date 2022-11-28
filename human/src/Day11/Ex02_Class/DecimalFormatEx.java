package Day11.Ex02_Class;

import java.text.DecimalFormat;

public class DecimalFormatEx {

	public static void main(String[] args) {

		// 숫자 데이터 원하는 형시긍로 표현하는 클래스
		// 1,000,000
		// , 단위구분 . 소수점 % 100을 곱하고 %표기 \ㅕ00A4 원화표시
		
		Double num = 1234.5678;
		
		
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));
	
		df = new DecimalFormat("0.0");
		System.out.println(df.format(num));

		df = new DecimalFormat("00000.00000");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));

		df = new DecimalFormat("#####.######");
		System.out.println(df.format(num));

		double num2 = 1000000000;
		
		df = new DecimalFormat("#.###");
		System.out.println(df.format(num2));

		double num3 = 123;
		double num4 = -123;
		
		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num3));
		
		df = new DecimalFormat("-#.0");
		System.out.println(df.format(num4));
		
		
		double num5 = 0.2;
		df = new DecimalFormat("#.#%");
		System.out.println(df.format(num5));

		df = new DecimalFormat("\u00A4 #.###");
		System.out.println(df.format(num2));

		
		
		
		
		
		
		
		
		
		
		
	
		
		
	}

}
