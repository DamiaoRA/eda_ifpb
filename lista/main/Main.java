package main;


import lista.EDAListaEstatica;
import lista.EDAListaIF;
import lista.exception.ListaCheiaException;
import lista.exception.ListaVaziaException;

public class Main {
	
	public static void main(String[] args) throws ListaCheiaException, ListaVaziaException {
		EDAListaIF lista = new EDAListaEstatica(5);
		lista.inserirNoFinal(10);
		lista.inserirNoFinal(5);
		lista.inserirNoFinal(40);
		lista.inserirNoFinal(30);
		lista.imprimir();

		lista.inserirNoComeco(87);
		lista.imprimir();

		lista.removerDoFinal();
		lista.imprimir();

		lista.removerDoComeco();
		lista.imprimir();
		
		lista.remover(1);
		lista.imprimir();

		System.out.println( lista.buscar(40));
	}
}