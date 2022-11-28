package Day11.Ex02_Class;

import java.util.Random;

public class RamdomEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		//nextBoolean()
		//nextDouble()
		//nextint()
		
		Random randomTF = new.nextBoolean();
		System.out.println(randomTF);
		
		if (randomTF) {
			System.out.println("앞면");
			
			
		} else {
			System.out.println("뒷면");
						
		}
		
		int fourByteRandom = random.nextInt();
		System.out.println("4바이트 랜덤 정수 :" + fourByteRandom);
	
		int dice = random.nextInt(6) +1;
		System.out.println("주사위 : " + dice);

		int lotto = random.nextInt(45) +1;
		System.out.println("로또번호: " + lotto);
		
		Double randomDoule = random.nextDouble();
		System.out.println("실수 랜덤 수 : " + R );
		
		
	}

}
