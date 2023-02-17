import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaGerenciadorDeFilmes {

	public static void main(String[] args) {

		MetodosDeValidacao metodos = new MetodosDeValidacao();

		System.out.println("-------SISTEMA GERENCIADOR DE FILMES-------");
		System.out.println("1 - Cadastrar filme");
		System.out.println("2 - Listar filmes cadastrados");
		System.out.println("3 - Sair");
		System.out.println("Sua opção:");
		Scanner opcao = new Scanner(System.in);

		List<Filmes> listaFilmes = new ArrayList<Filmes>();

		int opcaoEscolhida = opcao.nextInt();
		int id = 0;

		do {
			metodos.validaOpcao(opcaoEscolhida);
			if (opcaoEscolhida == 1) {

				Filmes filme = new Filmes();
				id += 1;
				System.out.println("O ID do filme é: " + id);
				filme.setId(id);
				System.out.println("Digite o título do filme: ");
				filme.setTitulo(opcao.next());
				System.out.println("Digite a duração do filme: ");
				filme.setDuracao(opcao.next());
				System.out.println("Digite o gênero do filme: ");
				filme.setGenero(opcao.next());
				listaFilmes.add(filme);
				System.out.println("Filme cadastrado!");
				System.out.println();
			}

			if (opcaoEscolhida == 2) {
				if (listaFilmes.isEmpty()) {
					System.out.println("Não há nenhum filme cadastrado!");
				} else {
					System.out.println(listaFilmes.toString());
				}
			}
			System.out.println("");
			System.out.println("-------SISTEMA GERENCIADOR DE FILMES-------");
			System.out.println("1 - Cadastrar filme");
			System.out.println("2 - Listar filmes cadastrados");
			System.out.println("3 - Sair");
			System.out.println("Sua opção:");
			opcaoEscolhida = opcao.nextInt();
		} while (opcaoEscolhida != 3);
		System.out.println("Obrigado! Volte sempre.");
		opcao.close();
	}
}
