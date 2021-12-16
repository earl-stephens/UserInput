package application;

//keyboard shortcut to get this package is Cmd+Shift+o
//Scanner is in the java.util package
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		//Scanner is the class; scanner is an instance of the class
		//IOW, instantiating a new scanner object
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter value in Fahrenheit to convert > ");
		
		double fahrenheit = scanner.nextFloat();
		
		double celsius = (fahrenheit - 32) * 5.0 / 9.0;
		
		System.out.printf("%.2f degrees Fahrenheit is %.2f degrees celsius.\n", fahrenheit, celsius);

	}

}
