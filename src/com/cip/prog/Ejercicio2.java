package com.cip.prog;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el radio");
		double radio = sc.nextDouble();

		//System.out.println("Introduzca altura ");
		//double altura = sc.nextDouble();
		double area = Math.PI*Math.pow(radio, 2.0);

		System.out.println("El area es " + area);
		sc.close();
	}

}
