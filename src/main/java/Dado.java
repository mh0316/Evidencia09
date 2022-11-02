public class Dado {
	private int caraSuperior;

	public int obtenerCaraSuperior() {
		int caraSuperior = (int)(Math.random()*6 + 1);
		return caraSuperior;
	}
}
