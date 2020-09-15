package accessModifiers;

public class AccessSpecifier2 {

	public static void main(String[] args) {
		
		//calling protected method within same package
		protectedAccessSpecifier protObj = new protectedAccessSpecifier();
		protObj.display();
		
		
	}

}
