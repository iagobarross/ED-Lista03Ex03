package view;

import br.edu.fateczl.ILista;
import br.edu.fateczl.Lista;

public class Principal {

	public static void main(String[] args) {

		ILista<Integer> lista = new Lista<>();

		try {
			lista.addLast(3);
			lista.addLast(5);
			lista.addLast(8);
			lista.addLast(12);
			lista.addLast(9);
			lista.addLast(7);
			lista.addLast(6);
			lista.addLast(2);
			lista.addLast(3);
			lista.addLast(7);
			lista.addLast(16);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		try {
			int maior = lista.get(0);
			int segMaior = lista.get(1);

			int tamanho = lista.size();

			for (int i = 0; i < tamanho; i++) {
				if (lista.get(i) > maior) {
					segMaior = maior;
					maior = lista.get(i);
				} else if (lista.get(i) > segMaior) {
					segMaior = lista.get(i);
				}
			}

			System.out.println("Maior: " + maior + "\nSegundo Maior: " + segMaior);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}