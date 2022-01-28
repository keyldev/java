package lab3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IBasicNumber number = new ComplexNumber();
		number.printNumber("something");
		number = new ExponentialNumber();
		number.printNumber("test");
	}

}
