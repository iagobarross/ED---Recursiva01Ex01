package view;

import controller.ControllerSomaNat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		ControllerSomaNat contSomaNat = new ControllerSomaNat();
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int resultado = contSomaNat.SomaNaturais(numero);
		System.out.println("A soma recursiva dos naturais é : " + resultado);
	}

}
