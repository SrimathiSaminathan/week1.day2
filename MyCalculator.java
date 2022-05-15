package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator1 calObj = new Calculator1();
		System.out.println("Addition = "+calObj.add(10,10,10));
		System.out.println("Subtraction = "+calObj.sub(20,10));
		System.out.println("Multiplication = "+calObj.mul(10.5,10));
		System.out.println("Division = "+calObj.div(100,10));
	}
}
