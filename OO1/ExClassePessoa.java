public class Pessoa {
    String nome;
    int idade;
    char genero;
    boolean fazFaculdade;

    void dizerOi() {
        System.out.println("Oi. O Hexa é realidade!");
    }
    String darONome() {
        return nome;
    }
    void comecarFaculdade() {
        fazFaculdade = true;
    }
    void fazerAniversario() {
        idade++;
    }
    boolean gostaDe(Pessoa p) {
        if (p.nome == "Rafael") return true;
        else return false;
    }

public static void main(String[] args) {
    Pessoa p1, p2, p3;
    p1 = new Pessoa();
    p2 = new Pessoa();

    p1.nome = "Rafael";
    p1.idade = 21;
    p1.genero = 'M';
    p1.fazFaculdade = true;
    p1.dizerOi();
    p3 = p1;
    p2.gostaDe(p3);
    System.out.println(p3.darONome());
    p3.fazerAniversario();
    System.out.println(p1.idade);
    p2.nome = "Maria";
    p2.comecarFaculdade();
    System.out.println(p2.darONome());
    System.out.println(p2.fazFaculdade);
}
}

