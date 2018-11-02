package saudeecia.curso.java;

import java.util.Scanner;

public class Secretaria {
    String nome;
    String cpf;
    String email;
    String dataNasc;
    String endereco;

    Secretaria(String nome, String cpf, String email, String dataNasc, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
    } 
    
    void criarPaciente(){
        Scanner entrada = new Scanner(System.in);
        String nomePaciente, enderecoPaciente, cpfPaciente, emailPaciente, dataNascPaciente;

        System.out.print("Digite o CPF do paciente: ");
        cpfPaciente = entrada.nextLine();

        System.out.print("Digite o nome do paciente: ");
        nomePaciente = entrada.nextLine();

        System.out.print("Digite a data de nascimento do paciente: ");
        dataNascPaciente = entrada.nextLine();

        System.out.print("Digite o email do paciente: ");
        emailPaciente = entrada.nextLine();
        
        System.out.print("Digite a rua do paciente: ");
        enderecoPaciente = entrada.nextLine();
        
        Paciente paciente = new Paciente(nomePaciente, cpfPaciente, emailPaciente, dataNascPaciente, enderecoPaciente);
    }
    
    void criarConsulta(Medico medico, Paciente paciente, String data, String hora){
        Consulta consulta = new Consulta(data, hora, medico, paciente);
    }
}
