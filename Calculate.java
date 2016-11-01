public class Calculate {

	public static void main(String[] arg) {
		System.out.println("Calculate...");
		int x = Integer.valueOf(arg[0]);
		int y = Integer.valueOf(arg[1]);
		System.out.println("Сумма " + (x + y));
		System.out.println("Разность " + (x - y));
		System.out.println("Умножение " + (x * y));
		System.out.println("Деление " + (x / y));
		System.out.println("Степень " + (Math.pow(x,y)));

	}

}