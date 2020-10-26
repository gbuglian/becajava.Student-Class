package StudentClass;

public class Main {

	public static void main(String[] args) {
		Aluno pessoa = new Aluno(10.0, 9.0);
		pessoa.Nome = "Gabriel Bugliani da Silva";
		pessoa.Idade = 18;
		pessoa.RA = 327876219;
		pessoa.NotaModelagem = 8.5;
		pessoa.NotaAPI = 7.6;

		System.out.println(pessoa.Nome + " tem " + pessoa.Idade + " Anos de idade, seu RA é: " + pessoa.RA);
		System.out.println("As notas do aluno " + pessoa.Nome + " foram: \n" + pessoa.NotaAlgoritmo
				+ " na materia de algoritmo,\n" + pessoa.NotaPoo + " na materia de POO,\n" + pessoa.NotaModelagem
				+ " na materia de Modelagem de dados e\n" + pessoa.NotaAPI + " na materia de API.");

		pessoa.Media();
	}
}