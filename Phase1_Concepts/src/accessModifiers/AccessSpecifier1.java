/*
 * 
 * Writing a program in Java to implement access modifiers
 * 
 */


package accessModifiers;

//class accessibility - default
class defaultAccessSpecifier{

	//method accessibility - default
	void display() {
	System.out.println("using default modifier");
   }
}

 public class AccessSpecifier1 {
	 public static void main(String[] args) {
		 
		//Accessing default method of another class
		 defaultAccessSpecifier dObj = new defaultAccessSpecifier();
		 dObj.display();
		 
		 //Trying to access private method of another class
		 privateAccessSpecifier privObj = new privateAccessSpecifier();
		 //privObj.display();
		
	}
	 
}


