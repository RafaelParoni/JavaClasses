public class UsuarioGet {
    private String nome;
    private String email;
    private String sobrenome;
    private String cep;
    private String endereco;
    private String cidade;
    private String estado;
    private int pessoasNaCasa;
    private String password;

    // Construtor para receber os dados
    public UsuarioGet(String nome, String email, String sobrenome, String cep, String endereco, String cidade, String estado, int pessoasNaCasa, String password) {
        this.nome = nome;
        this.email = email;
        this.sobrenome = sobrenome;
        this.cep = cep;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.pessoasNaCasa = pessoasNaCasa;
        this.password = password;
    }


    // Getters normais
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getSobrenome() { return sobrenome; }
    public String getCep() { return cep; }
    public String getEndereco() { return endereco; }
    public String getCidade() { return cidade; }
    public String getEstado() { return estado; }
    public int getPessoasNaCasa() { return pessoasNaCasa; }
    public String getPassword() { return password; } 

    // Print dos dados 
    public void mostrarTabela() {
        System.out.println("======= DADOS DO USUÁRIO =======");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("CEP: " + cep);
        System.out.println("Endereço: " + endereco);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("Pessoas na casa: " + pessoasNaCasa);
        System.out.println("Senha: " + password); // NOVO
        System.out.println("================================");
    }
}
