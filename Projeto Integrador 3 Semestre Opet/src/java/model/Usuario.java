/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
SUARIO_ID NUMBER NOT NULL,
USUARIO_NOME VARCHAR2(50) NOT NULL,
USUARIO_APELIDO VARCHAR2(50) NOT NULL,
USUARIO_SENHA VARCHAR(10) NOT NULL,

CONSTRAINT USUARIO_PK PRIMARY KEY (USUARIO_ID));
 */
public class Usuario {
    private String id;
    private String nome;
    private String apelido;
    private String senha;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nome=" + nome + ", apelido=" + apelido + ", senha=" + senha + '}';
    }
    
    
}
