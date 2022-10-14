package stringProgram;

public class StringBufferBuilder {

	public static void main(String[] args) {
		
		String s = "Velocity";
		System.out.println(s.concat(" Classes"));
		System.out.println(s);

		System.out.println("===============================");
		
		StringBuffer a = new StringBuffer("Velocity is");
	    System.out.println(a.append(" in Katraj"));
	    System.out.println(a);
	    
	    System.out.println("================================");
	    
	    StringBuilder a1 = new StringBuilder("velocity");
	    a1.reverse();
	    System.out.println(a1);
	    }

}
