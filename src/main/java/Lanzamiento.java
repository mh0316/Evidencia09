public class Lanzamiento {
	public static void main(String[] args) {
		Dado dado1 = new Dado();
		Dado dado2 = new Dado();
		Calculadora calculadora = new Calculadora();

		System.out.println(lanzamiento(dado1,dado2,calculadora));
	}

	private static int lanzamiento(Dado dado1, Dado dado2, Calculadora calculadora){
		int resultadoLanzamiento = calculadora.sumarCaras(dado1,dado2);
		if(resultadoLanzamiento == 7){
			System.out.println("¡¡GANASTE!!");
		}else {
			System.out.println("Perdiste :(");
		}
		return resultadoLanzamiento;
	}
}