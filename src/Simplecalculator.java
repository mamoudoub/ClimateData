import java.io.IOException;

public class Simplecalculator {
	public int add(int numberA, int numberB) {
		return numberA + numberB;
	}
	public static void main(String[] args) throws IOException {
		Simplecalculator cal = new Simplecalculator();
		System.out.println(" 2 + 3 = " + cal.add(2, 3));
	}
}
