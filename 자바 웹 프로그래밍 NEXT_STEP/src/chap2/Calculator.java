package chap2;

public class Calculator {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int a = cal.add(3, 4);
		int b = cal.subtract(5, 4);
		int c = cal.multiply(2, 6);
		int d = cal.divide(8, 4);
		
		System.out.println("[" + " a :"+ a + "]"+ "[" + " b :"+ b + "]" + "[" + " c :"+ c + "]" + "[" + " d :"+ d + "]");
	}
	
	int add(int i, int j) {
		return i + j;
	}
	
	int subtract(int i, int j) {
		return i - j;
	}
	
	int multiply(int i, int j) {
		return i * j;
	}
	
	int divide(int i, int j) {
		return i / j;
	}
}
