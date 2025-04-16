import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seus dados abaixo: ");


        UsuarioSet usuarioSet = new UsuarioSet(); // Iniciando Classe usuario

        System.out.print("Qual seu primeiro nome? "); // Pegando o Nome
        usuarioSet.Nome(scanner.nextLine()); // Setando Nome do usario na classe
        System.out.print("Qual seu sobre nome? "); // Pegando o SobreNome
        usuarioSet.Sobrenome(scanner.nextLine()); // Setando SobreNome do usario na classe
        System.out.print("Digite o CEP de sua casa: "); // Pegando o CEP
        usuarioSet.Cep(scanner.nextLine()); // Setando cep do usario na classe
        System.out.print("Endereço onde mora: (Rua / N da casa)"); // Pegando o endereço 
        usuarioSet.Endereco(scanner.nextLine()); // Setando Endereco do usario na classe
        System.out.print("Cidade onde mora: "); // Pegando a Cidade 
        usuarioSet.Cidade(scanner.nextLine()); // Setando Cidade do usario na classe
        System.out.print("Estado onde mora: "); // Pegando o Estado 
        usuarioSet.Estado(scanner.nextLine()); // Setando Estado do usario na classe
        System.out.print("Quantas pessoas vivem na casa: "); // Pegando quantas pessoa vivem na casa
        usuarioSet.PessoasNaCasa(scanner.nextInt()); // Setando Quantidade de pessoas na casa do usario na classe

        UsuarioGet usuarioGet = usuarioSet.gerarUsuarioGet(); // Gerando usuario na classe Get
        // Parar ser possível o uso do Get dados

        usuarioGet.mostrarTabela(); // PrintIn com os dados dos usuarios

        scanner.close();
    }
}
