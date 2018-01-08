package com.cip.prog;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el peso");
		double peso = sc.nextDouble();

		System.out.println("Introduzca altura ");
		double altura = sc.nextDouble();
		double ims = peso / Math.pow(altura, 2.0);

		System.out.println("Su IMC es " + ims);
		sc.close();
	}

}
