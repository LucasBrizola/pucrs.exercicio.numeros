package pucrs.java.maven.somar;

/**
 * @author Lucas Brizola
 *
 */
public class Soma {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length == 1 && args[0].equals("--versão")) {
			System.out.println("Programa Soma (C) 2019. Versão 0.02");
			return;
		}
		
		try {
			verificarNumeroDeParametros(args);
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println(somar(a, b));

		} catch (NumberFormatException e) {
			System.err.println("Valor inválido.");
			return;
		} catch (IllegalArgumentException e) {
			System.err.println("Número incorreto de argumentos.");
			return;
		}

	}

	/**
	 * 
	 * @param args
	 */
	static void verificarNumeroDeParametros(String[] args) {
		if (args.length != 2) {
			throw new IllegalArgumentException();
		}
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
