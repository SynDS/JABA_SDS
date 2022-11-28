package Day11.Ex02_Class;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		
		//구붐뉸자를 기준으로 문자열을 분리하는
		//
		String java = "클래스,생성자,상속,오버로딩,오버라이딩,추상클래스,인터페이스";
		StringTokenizer st1 = new StringTokenizer(java, ",");
		
		StringTokenizer st11 = new StringTokenizer(java, ",");
		
		System.out.println("토큰수의 개수 :" + st11.countTokens());
		while( st11.hasMoreElements()) {
			System.out.println(st11.nextElement());
			
		}}}
				

	
			
			
			
			
	
	

