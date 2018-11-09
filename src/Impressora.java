
public class Impressora {

	public static void imprimir(String texto) {
		if (texto == null) {
			throw new IllegalArgumentException("texto == null");
		}
		System.out.println(texto);
	}
}
