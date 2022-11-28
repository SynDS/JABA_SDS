package Day11.Ex01_Wrapper;

public class WrapperClass {


		public static void main(String[] args) {
			char a = 'a';
			char A = 'A';
			
			System.out.println( Character.toLowerCase(A));
			System.out.println( Character.toUpperCase(a));
						
			char c1 = '7', c2 = 'K';
			if (Character.isDigit(c2)) {
				System.out.println(c2 + "(은/는) 영문자");
			}
							
			System.out.println( Integer.parseInt("28"));	
			System.out.println( Integer.toString(28 + 2));	
			System.out.println( Integer.toBinaryString(28));
									
			Integer i = 28;
			System.out.println(i.doubleValue());
			
			Double d = 3.14;
			System.out.println(d.toString() + 0.06);
			System.out.println( Double.parseDouble("3.14") + 0.06);
			
			Boolean b = (i < 40);
			System.out.println(Boolean.toString(b) );
			System.out.println( Boolean.parseBoolean("false"));
						
			}			
						
			}
		
		
	

