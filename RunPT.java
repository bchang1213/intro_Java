public class RunPT {
	public static void main (String[] args){
		PythagoreanTheorem hypo = new PythagoreanTheorem();
		double answer = hypo.calculateHypotenuse(3,5);
		System.out.println(answer);
	}
}