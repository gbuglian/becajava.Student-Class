package StudentClass;

import java.util.Scanner;

public class Aluno {
	public String Nome;
	public int Idade;
	public int RA;

	public double NotaAlgoritmo;
	public double NotaPoo;
	public double NotaModelagem;
	public double NotaAPI;

	public Aluno(double notaAlgoritmo, double notaPoo) {
		NotaAlgoritmo = notaAlgoritmo;
		NotaPoo = notaPoo;
	}

	public void Media() {
		double media = (NotaAlgoritmo + NotaPoo + NotaModelagem + NotaAPI) / 4;
		System.out.println("A média do aluno é: " + media);
	}
}