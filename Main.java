import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GerenciadorGraficos gerenciador = new GerenciadorGraficos();

        boolean continuar = true;

        while (continuar) {
            // Menu principal
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Registro");
            System.out.println("2 - Criar gráfico");
            System.out.println("3 - Ver gráficos");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpar o buffer

            // Opções com if
            if (opcao == 1) {
                System.out.println("Você escolheu REGISTRO.");
            
                UsuarioSet usuario = new UsuarioSet(); // Iniciando Classe usuario
    
                System.out.print(" \n Qual seu primeiro nome? "); // Pegando o Nome
                usuario.setNome(scanner.nextLine()); // Setando Nome do usario na classe
        
                System.out.print("Qual seu sobre nome? "); // Pegando o SobreNome
                usuario.setSobrenome(scanner.nextLine()); // Setando SobreNome do usario na classe
        
                System.out.print("Digite o CEP de sua casa: "); // Pegando o CEP
                usuario.setCep(scanner.nextLine()); // Setando cep do usario na classe
        
                System.out.print("Endereço onde mora: (Rua / N da casa)"); // Pegando o endereço 
                usuario.setEndereco(scanner.nextLine()); // Setando Endereco do usario na classe
        
                System.out.print("Cidade onde mora: "); // Pegando a Cidade 
                usuario.setCidade(scanner.nextLine()); // Setando Cidade do usario na classe
        
                System.out.print("Estado onde mora: "); // Pegando o Estado 
                usuario.setEstado(scanner.nextLine()); // Setando Estado do usario na classe
        
                System.out.print("Quantas pessoas vivem na casa: "); // Pegando quantas pessoa vivem na casa
                usuario.setPessoasNaCasa(scanner.nextInt()); // Setando Quantidade de pessoas na casa do usario na classe
        
                System.out.print("Digite sua senha: "); // Pegando a senha
                usuario.setPassword(scanner.nextLine()); // Setando a senha do usuario
        
                UsuarioGet usuarioGet = usuario.gerarUsuarioGet(); // Gerando usuario na classe Get
                // Parar ser possível o uso do Get dados
        
                usuarioGet.mostrarTabela(); // PrintIn com os dados dos usuarios
            } else if (opcao == 2) {
                System.out.println("Você escolheu CRIAR GRÁFICO.");
                

                System.out.print("Digite o ano do gráfico que deseja criar: ");
    
                GraficoAnual CriandoGrafico = new GraficoAnual(scanner.nextInt());

                System.out.print("Digite o valor do mês Janeiro: ");
                CriandoGrafico.setValorMes("Jan", scanner.nextInt());
                
                System.out.print("Digite o valor do mês Fevereiro: ");
                CriandoGrafico.setValorMes("Fev", scanner.nextInt());
                
                System.out.print("Digite o valor do mês Março: ");
                CriandoGrafico.setValorMes("Mar", scanner.nextInt());
                
                System.out.print("Digite o valor do mês Abril: ");
                CriandoGrafico.setValorMes("Abr", scanner.nextInt());
                
                System.out.print("Digite o valor do mês Maio: ");
                CriandoGrafico.setValorMes("Mai", scanner.nextInt());
                
                System.out.print("Digite o valor do mês Junho: ");
                CriandoGrafico.setValorMes("Jun", scanner.nextInt());
                
                System.out.print("Digite o valor do mês Julho: ");
                CriandoGrafico.setValorMes("Jul", scanner.nextInt());
                
                System.out.print("Digite o valor do mês Agosto: ");
                CriandoGrafico.setValorMes("Ago", scanner.nextInt());
                
                System.out.print("Digite o valor do mês Setembro: ");
                CriandoGrafico.setValorMes("Set", scanner.nextInt());
                
                System.out.print("Digite o valor do mês Outubro: ");
                CriandoGrafico.setValorMes("Out", scanner.nextInt());
                
                System.out.print("Digite o valor do mês Novembro: ");
                CriandoGrafico.setValorMes("Nov", scanner.nextInt());
                
                System.out.print("Digite o valor do mês Dezembro: ");
                CriandoGrafico.setValorMes("Dez", scanner.nextInt());
    
                gerenciador.adicionarGrafico(CriandoGrafico);
    
                System.out.println(CriandoGrafico);
    
            } else if (opcao == 3) {
                System.out.println("Você escolheu VER GRÁFICOS.");

                System.out.print("Digite o ano do gráfico que deseja ver: ");
                int anoEscolhido = scanner.nextInt();

                if (gerenciador.existeGrafico(anoEscolhido)) {
                    GraficoAnual grafico = gerenciador.getGrafico(anoEscolhido);
                    System.out.println("Gráfico encontrado para o ano " + anoEscolhido);
                    System.out.println(grafico); // ou acessar os dados como quiser
                } else {
                    System.out.println("Nenhum gráfico encontrado para o ano " + anoEscolhido);
                }
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.print("\nDeseja voltar ao menu? (s/n): ");
            scanner.nextLine(); // limpa o buffer depois do nextInt()
            String resposta = scanner.nextLine();

            if (!resposta.equalsIgnoreCase("s")) {
                continuar = false;
                System.out.println("Encerrando o programa. Até mais!");
            }
        }


        scanner.close();
    }
}
