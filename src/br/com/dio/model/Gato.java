package br.com.dio.model;

/* Alt+Insert para sair criando */

import java.util.Objects;

public class Gato {
    private String nome;
    private String cor;
    private Integer idade;

    /* Alt+Insert Comander vazio select none */
    public Gato() {}

    /* Alt+Insert Comander usa shift e direcionais
    * para selecionar todos e OK */
    public Gato(String nome, String cor, Integer idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    /* Alt+Insert Getter and Setter usa shift e
    * direcional para selecionar todos */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    /* Alt+Insert equals() and hashCode() */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(nome, gato.nome) && Objects.equals(cor, gato.cor) && Objects.equals(idade, gato.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cor, idade);
    }

    /* Alt+Insert toString() */
    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }
}
