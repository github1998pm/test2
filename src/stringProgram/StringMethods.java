package stringProgram;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		
		String a = "I Love My Country";
	   
		//	1) equals
		   System.out.println(a.equals("I Love My Country"));        //compare all string 
		
		// 2) contains                                               // check the given input is in present declration or not
		   System.out.println(a.contains("y Count"));                

		// 3) length                                                 //  Calculate the length of complete string
		   System.out.println(a.length());
		         
		    //    for loop using
		       for(int i=0; i<a.length(); i++)
		       {
		    	   System.out.println(a.charAt(i));
		       }
		 
		 // 4) toUpperCase                                           // Convert all string in upper case
		       System.out.println(a.toUpperCase());
		       
		 // 5) toLowerCase                                           // convert all string in lower case
		       System.out.println(a.toLowerCase());
		       
		 // 6)indexOf                                               // It show index of character 
		       System.out.println(a.indexOf('I'));
		       
		 // 7)inderOF                                               // It show index of string
		       System.out.println(a.indexOf("My"));
		 // 8) indexof                                              // It show index of chracter to define numberin string
		       System.out.println(a.indexOf('y', 2));
		     
		 // 9) replace                                              // to replace the string  
		       System.out.println(a.replace("My","Our"));
		       
		 // 10) replace                                                 // to replace the character
		       System.out.println(a.replace('y', 'i'));
		
		 // 11) startWith                                           // to show the message string are start with correct letter or not
		       System.out.println(a.startsWith("I"));
		 
		 // 12)startWith                                            // to show the start string and its index are same or not 
		       System.out.println(a.startsWith("I", 0));
		       
		 // 13) endsWith                                            // to show the end character or string in proper formate
		       System.out.println(a.endsWith(" y"));
		
		 // 14) concat                                              // it combine the two string or sentences
		       System.out.println(a.concat(", I am from india"));
		 
		// 15) split                                                // it to sort the array first and the print
		                                                            //the string of given index
		       System.out.println(Arrays.toString(a.split(" ")));
		       System.out.println(a.split(" ")[1]);
		       
	    // 16) intern
		       
		       String p = new String("facebook");
		       
		       String y = "facebook";
		       
		       String k = p.intern();
	            
		       System.out.println(k);
		       System.out.println(p == k);
		       System.out.println( y == k);
	}
}
