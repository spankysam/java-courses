public class Calculate {

	public static void main(String[] arg) {
		System.out.println("Calculate...");
		int x = Integer.valueOf(arg[0]);
		int y = Integer.valueOf(arg[1]);
		System.out.println("����� " + (x + y));
		System.out.println("�������� " + (x - y));
		System.out.println("��������� " + (x * y));
		System.out.println("������� " + (x / y));
		System.out.println("������� " + (Math.pow(x,y)));

	}

}