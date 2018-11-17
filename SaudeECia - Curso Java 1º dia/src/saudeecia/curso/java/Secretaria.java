package saudeecia.curso.java;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner;

public class Secretaria extends Pessoa {

  public static HashMap<String, Paciente> pacientes = new HashMap();

  public Secretaria(String nome, String cpf, String email, String dataNasc, String endereco) {
    super(nome, cpf, email, dataNasc, endereco);
  }

  public static HashMap<String, Paciente> getPacientes() {
    return pacientes;
  }

  public static void setPacientes(HashMap<String, Paciente> pacientes) {
    Secretaria.pacientes = pacientes;
  }

  public void criarPaciente() {
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
    Secretaria.pacientes.put(cpfPaciente, paciente);
  }

  public void criarConsulta(Medico medico, Paciente paciente, String data, String hora) {
    Consulta consulta = new Consulta(data, hora, medico, paciente);
    Consulta.consultas.add(consulta);
  }

  public void gerarRelatorioConsulta() {
    String dia;
    Calendar dataHoje = Calendar.getInstance();
    dia = dataHoje.getTime().toString();

    int numDia = Integer.parseInt(dia.substring(8, 10));
    int diaCom;

    for (int i = 0; i < Consulta.getConsultas().size(); i++) {
      diaCom = Integer.parseInt(Consulta.getConsultas().get(i).getData().substring(0, 2));
      if (numDia + 1 == diaCom) {
        System.out.println("Consulta = " + Consulta.getConsultas().get(i).toString());
      }
    }
  }
}
