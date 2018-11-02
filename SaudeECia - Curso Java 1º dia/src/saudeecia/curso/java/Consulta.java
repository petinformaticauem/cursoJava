package saudeecia.curso.java;

public class Consulta {
    String data;
    String hora;
    Medico medico;
    Paciente paciente;

    public Consulta(String data, String hora, Medico medico, Paciente paciente) {
        this.data = data;
        this.hora = hora;
        this.medico = medico;
        this.paciente = paciente;
    }
}
