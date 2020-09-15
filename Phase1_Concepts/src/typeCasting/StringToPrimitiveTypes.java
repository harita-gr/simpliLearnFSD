/*
 * WAP which takes string as input and converts it to other primitive datatypes
 * 
 * */


package typeCasting;

import java.util.Scanner;


public class StringToPrimitiveTypes {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String input="";
		
		//receiving input string
		
		System.out.println("enter the string: ");
		input=s.nextLine();
		
		//converting
		int i=Integer.parseInt(input);
		System.out.println("Int value = "+i);
		
		float l=Float.parseFloat(input);
		System.out.println("Float value = "+l);
		
		double d=Double.parseDouble(input);
		System.out.println("Double value = "+d);

	}

}
