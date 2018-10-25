public class Pessoa {
    private String nome;
    private int idade;
    private char genero;
    private boolean fazFaculdade;

    public Pessoa() {
        // construtor padrão
        // se não tivesse outro construtor definido,
        // não precisaria definir esse aqui
    }
    public Pessoa(String nome) {
        this.nome = nome;
    }
    public Pessoa(String nome, int idade, char genero) {
        this(nome);
        this.idade = idade;
        this.genero = genero;
    }
    // outros métodos...
}

/*------------------------------------------------------------
Pessoa p1, p2, p3;
p1 = new Pessoa();
p2 = new Pessoa("Rafael");
p3 = new Pessoa("João", 19, 'M');*/
