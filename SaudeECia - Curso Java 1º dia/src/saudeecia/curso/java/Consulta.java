package saudeecia.curso.java;

public class Consulta {
    private String data;
    private String hora;
    private Medico medico;
    private Paciente paciente;
    private static int nroConsultas = 0;
    private static Consulta[] consultas = new Consulta[100];

    public Consulta(String data, String hora, Medico medico, Paciente paciente) {
        this.data = data;
        this.hora = hora;
        this.medico = medico;
        this.paciente = paciente;
        Consulta.consultas[Consulta.nroConsultas] = this;
        Consulta.nroConsultas++;
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
    
}
