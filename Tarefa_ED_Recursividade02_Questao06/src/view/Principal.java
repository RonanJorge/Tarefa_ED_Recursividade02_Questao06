/* Nome: Ronan Jorge
 * Data: 28/02/2023
 * Objetivo: 03) Criar uma aplica��o em Java que tenha uma fun��o recursiva que,
 * recebendo um n�mero inteiro (N), apresente a sa�da da somat�ria
 * S = 1 + 1/2! + 1/3! + 1/4! + � + 1/N!*/

package view;

import javax.swing.JOptionPane;
import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		OperacoesController op = new OperacoesController();
		double n = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor de n:"));
		System.out.println("1 + 1/2! + 1/3! + 1/4! + � + 1/n! = "+ op.sum(n));
	}

}
