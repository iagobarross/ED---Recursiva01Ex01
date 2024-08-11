/*1. Criar uma aplicação em Java que tenha uma função recursiva que calcule o somatório do N primeiros
número NATURAIS (a função deve retornar zero para números nega�vos)
O Código deve apresentar, em formato de comentário, como foi definida a condição de parada;
O Código deve apresentar, em formato de comentário, como foi definida a relação de chamada dos passos;
*/
package controller;

public class ControllerSomaNat {
	
	public ControllerSomaNat() {
		super();
	}
	
	public int SomaNaturais(int numero) {
		if (numero < 1) {  
			return 0; //Quando numero for menor que 1, acabam-se os numeros naturais e retorna 0 para a soma.
		} else {
			return numero + SomaNaturais(numero - 1); //Enquanto numero for maior ou igual a 1, soma-se o numero com a funcao decrescendo o seu valor. 
		}
	}
}
