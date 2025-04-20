public class UsuarioSet {
    private String nome;
    private String sobrenome;
    private String email;
    private String cep;
    private String endereco;
    private String cidade;
    private String estado;
    private String password;
    private int pessoasNaCasa;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPessoasNaCasa(int pessoasNaCasa) {
        this.pessoasNaCasa = pessoasNaCasa;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Método para transferir dados para um UsuarioGet e salvar no bd
    public UsuarioGet gerarUsuarioGet() {
        return new UsuarioGet(nome, email, sobrenome, cep, endereco, cidade, estado, pessoasNaCasa, password);
    
        // SALVAR NO BANCO DE DADOS
    }
}
