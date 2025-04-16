public class UsuarioGet {
    private String nome;
    private String sobrenome;
    private String cep;
    private String endereco;
    private String cidade;
    private String estado;
    private int pessoasNaCasa;

    // Construtor para receber os dados
    public UsuarioGet(String nome, String sobrenome, String cep, String endereco, String cidade, String estado, int pessoasNaCasa) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cep = cep;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.pessoasNaCasa = pessoasNaCasa;
    }

    // Getters normais
    public String Nome() { return nome; }
    public String Sobrenome() { return sobrenome; }
    public String Cep() { return cep; }
    public String Endereco() { return endereco; }
    public String Cidade() { return cidade; }
    public String Estado() { return estado; }
    public int PessoasNaCasa() { return pessoasNaCasa; }

    // Método para exibir os dados como uma "tabela"
    public void mostrarTabela() {
        System.out.println("======= DADOS DO USUÁRIO =======");
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("CEP: " + cep);
        System.out.println("Endereço: " + endereco);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("Pessoas na casa: " + pessoasNaCasa);
        System.out.println("================================");
    }
}
