public class PythagoreanTheorem {
	public double calculateHypotenuse (int legA, int legB) {
		double a = (double) legA;
		double b = (double) legB;
		double sideA = Math.pow(a, 2);
		double sideB = Math.pow(b, 2);
		double sideC = Math.sqrt(sideA + sideB);
		return sideC;
	}
}