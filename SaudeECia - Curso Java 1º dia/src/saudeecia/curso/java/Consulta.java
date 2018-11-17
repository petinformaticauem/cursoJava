package saudeecia.curso.java;

import java.util.ArrayList;

public class Consulta {

  private String data;
  private String hora;
  private Medico medico;
  private Paciente paciente;
  private static int nroConsultas = 0;
  public static ArrayList<Consulta> consultas = new ArrayList();

  public Consulta(String data, String hora, Medico medico, Paciente paciente) {
    this.data = data;
    this.hora = hora;
    this.medico = medico;
    this.paciente = paciente;
    Consulta.nroConsultas++;
  }

  public static ArrayList<Consulta> getConsultas() {
    return consultas;
  }

  public static void setConsultas(ArrayList<Consulta> consultas) {
    Consulta.consultas = consultas;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public String getHora() {
    return hora;
  }

  public void setHora(String hora) {
    this.hora = hora;
  }

  public Medico getMedico() {
    return medico;
  }

  public void setMedico(Medico medico) {
    this.medico = medico;
  }

  public Paciente getPaciente() {
    return paciente;
  }

  public void setPaciente(Paciente paciente) {
    this.paciente = paciente;
  }

  @Override
  public String toString() {
    return "Consulta{" + "data=" + data + ", hora=" + hora + ", medico=" + medico + ", paciente=" + paciente + '}';
  }

}
