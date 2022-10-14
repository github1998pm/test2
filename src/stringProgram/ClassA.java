package stringProgram;

public class ClassA {
	
	public static void main(String[] args) {
		
		//With using new keyword ----------> non-constant pool area
		
		String a = new String("Velocity");
		String b = new String("Velocity"); 

		//Without using new keyword --------> constant pool area
		
		String c =  "Velocity";
		String d = "Velocity";
		
		System.out.println(a == b);       //--->checking memory address
		System.out.println(a == c);
		System.out.println(a == d);
		System.out.println(b == c);
		System.out.println(b == d);
		System.out.println(c == d);
		
		
		System.out.println(" == ===== ==== ==== ==== ==== ");
		
		System.out.println(a.equals(b));   //----> comparing actual data
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(a.equals(c));
		System.out.println(a.equals(c));
		System.out.println(a.equals(c));
	}


}
