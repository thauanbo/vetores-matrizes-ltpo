package org.example.vetores;

public class Aluno {
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade;
    }
}