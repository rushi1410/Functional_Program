package com.bridgelabz;
import java.util.Scanner;
public class Quadratic {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Input a: ");
		double a = input.nextDouble();
		System.out.print("Input b: ");
		double b = input.nextDouble();
		System.out.print("Input c: ");
		double c = input.nextDouble();

		double delta = b * b - 4.0 * a * c;

		if (delta > 0.0) {
			double r1 = (-b + Math.pow(delta, 0.5)) / (2.0 * a);
			double r2 = (-b - Math.pow(delta, 0.5)) / (2.0 * a);
			System.out.println("The First roots is " + r1 + " and Second root is " + r2);
		} else if (delta == 0.0) {
			double r1 = -b / (2.0 * a);
			System.out.println("The root is " + r1);
		} else {
			System.out.println("The equation has no real roots.");
		}

	}
}
