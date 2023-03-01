package controller;

public class OperacoesController {
	public OperacoesController() {
		super();
	}
	public double sum(double n) {
		/* S(n) = 1 + 1/2! + 1/3! + 1/4! + � + 1/n!
		 * = 1/n! + S(n - 1)
		 * = 1/n! + 1/(n - 1)! + S(n - 2)
		 * = 1/n! + 1/(n - 1)! + ... + 1/2! + 1/S(1)
		 * 
		 * Para n maior que um, a fun��o deve retornar a fun��o para n - 1 
		 * acrescida da parcela 1/n!.
		 * O ponto de parada ser� quando n for um, retornando o valor 1.
		 */
		if(n == 1) return 1;
		else return 1/fat(n) + sum(n -1);  
	}
	public double fat(double n) {
		// Defini��o da fun��o fatorial
		if(n == 1) return 1;
		else return n * fat(n - 1);
	}
}