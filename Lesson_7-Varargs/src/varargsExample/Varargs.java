package varargsExample;

public class Varargs {

	//A new look for main:
	public static void main(String... args) {

		int a = 5, b = 9, sum;

		//Invokes the sum() method that receives 2 ints.
		sum = sum(a, b);

		System.out.println("sum is: " + sum);

		//Invokes the sum() method that receives only int varargs.
		sum = sum(2, 5, 7, a, b, 7, 6);
		System.out.println("sum is: " + sum);

		//Invokes the sum() method that receives a String type parameter and
		//int varargs.
		sum = sum("Eldar", 2, 5, 7, a, b, 7, 6);
		System.out.println("sum is: " + sum);

	}

	public static int sum(int a, int b) {
		System.out.println("sum(int a, int b) is invoked");
		return a + b;
	}

	//Using varargs (...) to state that the method receives an array of int 
	//of any size.
	public static int sum(int... num) {
		System.out.println("sum(int... num) is invoked");

		int sum = 0;

		for (int n : num) {
			sum += n;
		}

		return sum;
	}

	//The method receives a String type argument and then int varargs. If the
	//varargs are not the only parameters of the method, they must be the last
	//ones in the parameter list.
	public static int sum(String name, int... num) {
		System.out.println("sum(String name, int... num) is invoked");

		System.out.println("hello " + name);
		int sum = 0;

		for (int n : num) {
			sum += n;
		}

		return sum;
	}

}
