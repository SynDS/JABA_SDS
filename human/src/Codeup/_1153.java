package Codeup;

import java.util.Scanner;

public class _1153 {

	public static void main(String[] args) {
		/*
		 * 두정수입력
		 * 정수 크기 비교
		 * 왼쪽수가 크면 >
		 * 오른쪽       < 
		 * 같으면 = 을 출력하시오 
		 * code up 제출방법체크 회원가입, 
		 * 프로그래밍 언어 JAVA 선택, 
		 * class명 Main으로
		 */
		
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		if ( a > b) {
			System.out.println(">");}
		
		if ( a < b) {
			System.out.println("<");}
						
		if ( a == b) {
			System.out.println("=");
			
		}
		
		
		sc.close();
	}
}
