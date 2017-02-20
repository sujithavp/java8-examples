package com.sample;

public class LamdaExpressionsSample {

	public static void main(String[] args) {
		LamdaExpressionsSample tester = new LamdaExpressionsSample();

		// With type declaration
		MathOperation addition = (int a, int b) -> a + b;

		// Without type declaration
		MathOperation subtraction = (a, b) -> a - b;

		// With return statement along with curly braces
		MathOperation multiplication = (int a, int b) -> {
			return a * b;
		};

		// Without return statement and without curly braces
		MathOperation division = (int a, int b) -> a / b;

		System.out.println("10+5" + tester.operate(10, 5, addition));
		System.out.println("10-5" + tester.operate(10, 5, subtraction));
		System.out.println("10*5" + tester.operate(10, 5, multiplication));
		System.out.println("10/5" + tester.operate(10, 5, division));

		// With parenthesis
		GreetingService greetingService1 = (message) -> System.out.println("Hello" + message);

		// Without parenthesis
		GreetingService greetingService2 = message -> System.out.println("Hello" + message);

		greetingService1.sayMessage("Good Morning");
		greetingService2.sayMessage("Good Evening");
	}

	interface MathOperation {
		int operation(int a, int b);
	}

	interface GreetingService {
		void sayMessage(String message);
	}

	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}

}
