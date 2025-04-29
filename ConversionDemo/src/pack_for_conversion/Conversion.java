package pack_for_conversion;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b;
		int i = 323;
		double d = 323.142;
		
		//converting int to byte
		
		System.out.println("Converting from Int to Byte");
		
		b = (byte)i;
		
		System.out.println(" i and b"+i+" "+b);
		
		System.out.println("Conversion from double to int");
		
		i = (int)d;
		
		System.out.println("d and i"+d+" "+i);
		
		System.out.println("Conversion from double to byte");
		
		b = (byte)d;
		
		System.out.println("d and b"+d+" "+b);
		
		
		
	}

}
