public class Pessoa {
    private String nome;
    private int idade;
    private char genero;
    private boolean fazFaculdade;

    public void dizerOi() {
        System.out.println("Oi. O Hexa é realidade!");
    }
    public String darONome() {
        return nome;
    }
    public void comecarFaculdade() {
        fazFaculdade = true;
    }
    public void fazerAniversario() {
        idade++;
    }
    public boolean gostaDe(Pessoa p) {
        if (p.nome == "Rafael") return true;
        else return false;
    }
    public void registrarSe(String nome, int idade, char genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.comecarFaculdade();
    }
}
