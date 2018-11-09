
public class Impressora {

	public static void imprimir(String texto) {
		if (texto == null) {
			throw new IllegalArgumentException("texto == null");
		}
		if (texto.length() == 0) {
			throw new IllegalArgumentException("texto.length() == 0");
		}
		System.out.println(texto);
	}
}
