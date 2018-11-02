package saudeecia.curso.java;

public class Paciente {
    String nome;
    String cpf;
    String email;
    String dataNasc;
    String endereco;
    
    Paciente(String nome, String cpf, String email, String dataNasc, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
    }
    
    Paciente(){}
}
