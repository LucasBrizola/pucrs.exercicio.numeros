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
    	//TODO: Coletar os números a partir da linha de comando (CLI)
    	int tamanho = args.length;
    	for (int i = 0; i < tamanho; i++) {
			String s = args[i];
			System.out.println(s);
		}
    	
    	
    	int a = Integer.parseInt(args[0]);
    	int b = Integer.parseInt(args[1]);
        System.out.println( somar(a, b) );
    }

    /**
     * 
     * @param a
     * @param b
     * @return
     */
    
	static int somar(int a, int b) {
		return a + b;
	}
}
