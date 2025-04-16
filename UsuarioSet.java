public class UsuarioSet {
    private String nome;
    private String sobrenome;
    private String cep;
    private String endereco;
    private String cidade;
    private String estado;
    private int pessoasNaCasa;

    public void Nome(String nome) {
        this.nome = nome;
    }

    public void Sobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void Cep(String cep) {
        this.cep = cep;
    }

    public void Endereco(String endereco) {
        this.endereco = endereco;
    }

    public void Cidade(String cidade) {
        this.cidade = cidade;
    }

    public void Estado(String estado) {
        this.estado = estado;
    }

    public void PessoasNaCasa(int pessoasNaCasa) {
        this.pessoasNaCasa = pessoasNaCasa;
    }

    // Método para transferir dados para um UsuarioGet
    public UsuarioGet gerarUsuarioGet() {
        return new UsuarioGet(nome, sobrenome, cep, endereco, cidade, estado, pessoasNaCasa);
    }
}
