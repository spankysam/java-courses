public class Calculate {

	public static void main(String[] arg) {
		System.out.println("Calculate...");
		int x = Integer.valueOf(arg[0]);
		int y = Integer.valueOf(arg[1]);
		System.out.println("Sum " + (x + y));
		System.out.println("Difference " + (x - y));
		System.out.println("Multiplication " + (x * y));
		System.out.println("Division " + (x / y));
		System.out.println("Power " + (Math.pow(x,y)));

	}

}