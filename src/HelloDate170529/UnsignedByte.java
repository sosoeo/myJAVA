// filename:UnsignedByte.java
package HelloDate170529;
public class UnsignedByte{
    public static void usingExample(){
	byte a = (byte)200;
	byte b = (byte)0xF1;
	byte[] c = {(byte)0xF1,(byte)0xF2,(byte)0xF3};
	System.out.println("byte a" + a);
	System.out.println("byte hex" + Byte.toString(a));
	System.out.println("byte unsignedint" + Byte.toUnsignedInt(a));
	for(int i = 0;i < c.length;i++) {
	    System.out.println("hex:" + Integer.toHexString(c[i]));
	    System.out.println("hex:" + Integer.toHexString(0xFF&c[i]));
	    System.out.println("bin:" + Integer.toBinaryString(0xFF&c[i]));
	}
    }
}

