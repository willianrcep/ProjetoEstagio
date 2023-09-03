package uniderp.loo.estagio.dominio;

import java.time.LocalDate;

public abstract class BasePessoa {
    protected String nome;
    protected String registro;
    protected String usuario;
    protected String senha;
    protected LocalDate dataNascimento;
    protected String email;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public BasePessoa(String nome, String registro, String usuario, String senha, LocalDate dataNascimento,
            String email) {
        this.nome = nome;
        this.registro = registro;
        this.usuario = usuario;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }

    
}
