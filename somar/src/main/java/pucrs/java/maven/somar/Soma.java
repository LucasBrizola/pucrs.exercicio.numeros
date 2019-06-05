package pucrs.java.maven.somar;

/**
 * @author Lucas Brizola
 *
 */
public class Soma 
{
	/**
	 * 
	 * @param args
	 */
    public static void main( String[] args )
    {
    	int a = 10;
    	int b = 20;
        System.out.println( somar(a, b) );
    }

	static int somar(int a, int b) {
		return a + b;
	}
}
