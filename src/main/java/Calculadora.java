public class Calculadora {

	/**
	 * 
	 * @param dado1
	 * @param dado2
	 */
	public int sumarCaras(Dado dado1, Dado dado2) {
		int suma = dado1.obtenerCaraSuperior() + dado2.obtenerCaraSuperior();
		return suma;
	}
}