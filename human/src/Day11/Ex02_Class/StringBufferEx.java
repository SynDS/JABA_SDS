package Day11.Ex02_Class;

public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		
		sb.append(" is java");
		System.out.println(sb);
						
		sb.insert(7, " real ");
		System.out.println(sb);
		
		sb.indexOf("real");
		System.out.println();
				
		sb.replace(8, 12, "good");
		System.out.println(sb);
		
		sb.delete(8, 13);
		System.out.println(sb);
		
		sb.setLength(4);
		System.out.println(sb);
		
		
	}

}
