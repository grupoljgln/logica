import java.util.Scanner;

public class PraticaLogica {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double medias[] = new double[10];

		// Q01
		String[] nomes = { "Alex", "Saulo", "Monica", "Isis", "Marina", "Luiz",
				"Helen", "Tiago", "Pedro", "Mara" };
		double[][] notas = { { 7.5, 8.9, 6.5 }, { 8.2, 7.3, 9.4 },
				{ 10.0, 9.6, 7.1 }, { 6.8, 7.5, 8.1 }, { 8.8, 7.4, 9.2 },
				{ 8.3, 7.9, 9.0 }, { 7.2, 8.7, 9.8 }, { 8.3, 7.7, 8.9 },
				{ 7.8, 7.7, 8.5 }, { 8.0, 7.0, 9.0 } };

		// Q02
		q02(nomes, notas);

		// Q03
		// Construa um vetor com a média de cada aluno.
		for (int i = 0; i < nomes.length; i++) {
			medias[i] = calcularMedia(notas[i][0], notas[i][1], notas[i][2]);
		}

		System.out.println();
		System.out.println("Média:");
		// Q04
		imprimirMedias(nomes, medias);
		
		
		// Q06
		System.out.println();
		matrizAprovados(nomes, medias);
	}

	static void q02(String[] vetor, double[][] matriz) {

		System.out.printf("Aluno\tTrabalho1\tTrabalho2\tTrabalho3\n");
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%s\t ", vetor[i]);
			for (int j = 0; j < 3; j++) {
				System.out.printf("%4.2f\t\t", matriz[i][j]);
			}
			System.out.println();
		}

	}

	//Q03 - Função que retorna a média de três notas.
	static double calcularMedia(double primeiroValor, double segundoValor,
			double terceiroValor) {

		double media = (primeiroValor + segundoValor + terceiroValor) / 3;

		return media;

	}

	//Q04 - Procedimento que imprime os vetores de nome e média.
	static void imprimirMedias(String[] nomes, double[] vetor) {
		for (int i = 0; i < nomes.length; i++) {
			System.out.printf("%s\t ", nomes[i]);
			for (int j = 0; j < 1; j++) {
				System.out.printf("%2.2f\n", vetor[i]);
			}
		}
	}
	
	// Q05.1 - Imprimir todos os elementos de um matriz Anxn
	//TODO - Aqui vai o seu código

/* Q06 - Criando uma matriz que possui 10x2, com o nome do aluno e
	 true/false referente a aprovação
	 após isso, imprimimos a matriz
	By grupoljgln (Nicolas)*/
	static void matrizAprovados(String[] nomes, double[] medias) {
		String[][] aprovado = new String[nomes.length][2];
		for (int i = 0; i < nomes.length; i++) {
			for (int j = 0; j < 2; j++) {
				if (j == 0) {
					aprovado[i][j] = nomes[i];
				} else {
					if (medias[i] >= 8) {
						aprovado[i][j] = "true";
					} else {
						aprovado[i][j] = "false";
					}
				}
			}
		}
		System.out.printf("Aluno\tAprovação \n");
		for (int i = 0; i < nomes.length; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.printf("%s \t", aprovado[i][j]);
			}
			System.out.println();
		}
	}
}
