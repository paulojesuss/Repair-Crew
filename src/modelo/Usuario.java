
package modelo;

import java.util.ArrayList;

public class Usuario {
    private int codigo;
    private String nome;
    private String senha;
    private String cpf;

    public int getCodigo() {
        return codigo;
    }

    public Usuario(int codigo, String nome, String senha, String cpf) {
        this.codigo = codigo;
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
