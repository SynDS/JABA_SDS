package Day11.Ex01_Wrapper;

public class ValueCompare {

	public static void main(String[] args) {
		
		Integer intobj1 = 10;
		Integer intobj2 = 10;
		
		System.out.println("intobj1 == intobj2");
		System.out.println("결과 : " + (intobj1 == intobj2));
		System.out.println("언박싱하여 비교");
		System.out.println("equals(   )로 비교");
		System.out.println("결과 : " + intobj1.equals(intobj2));
		
		
		System.out.println("--------------------");
		
		Integer intobj3 = 200;
		Integer intobj4 = 200;
		
		System.out.println("intobj3 == intobj4");
		System.out.println("결과 : " + (intobj3 == intobj4));
		System.out.println("언박싱하여 비교");
		System.out.println("equals(   )로 비교");
		System.out.println("결과 : " + intobj3.equals(intobj4));
	}
	
	
	
	}


