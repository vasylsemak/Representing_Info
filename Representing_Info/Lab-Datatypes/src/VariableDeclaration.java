public class VariableDeclaration {

	public static void main(String[] args) {
		boolean on = false;
		System.out.println("boolean " + on);
		
		short s = 16;
		System.out.println("short " + s + "  -> bits");
		
		int i = -32;
		System.out.println("int " + i  + "  -> bits");
		
		float f = 3839.3483f;
		System.out.println("float " + f + "  -> 32 bits");
		
		long l = 4294967296l;
		System.out.println("long " + l + "  -> 64 bits");
		
		char c = 'a';
		System.out.println("char " + c + "  -> 6 bit unicorne character");
		
	}
}
