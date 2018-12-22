package exception;

import java.util.Scanner;

public class Programm {
	
	private static Scanner in;

	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		
		Triangle triangle = new Triangle(in.nextDouble(), in.nextDouble(), in.nextDouble());
		
		try {
			triangle.findArea();
		} catch (ExistenceException e) {
			System.out.println(e.toString());
		} 
	}
	
}
