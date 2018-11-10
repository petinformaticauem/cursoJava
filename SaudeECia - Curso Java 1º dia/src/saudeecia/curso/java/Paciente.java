package saudeecia.curso.java;

public class Paciente extends Pessoa{
    
    public Paciente(String nome, String cpf, String email, String dataNasc, String endereco) {
        super(nome, cpf, email, dataNasc, endereco);
    }
    
    public Paciente(){
        super();
    }
}
