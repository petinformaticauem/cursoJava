public class Aluno {
    protected String nome;
    protected int idade;

    public Aluno() {}

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentarSe() {
        System.out.println("Oi, me chamo " + nome + " e tenho " + idade + " anos");
    }
}

public class AlunoEnsinoMedio extends Aluno {
    private boolean jogaLol;
    private String colegio;

    public AlunoEnsinoMedio(String nome, int idade) {
        super(nome, idade);
        this.jogaLol = true;
        this.colegio = "CAP";
    }

    @Override
    public void apresentarSe() {
        System.out.println("Oi, me chamo " + nome + " e tenho " + idade + " anos");
        System.out.println("Estudo no colégio " + colegio);
    }
}

public class AlunoMestrado extends Aluno {
    private int anoFormacao;
    private String formadoEm;

    public AlunoMestrado() {
        this.formadoEm = "UEM";
        this.anoFormacao = 2023;
    }

    public String getFormadoEm() {return formadoEm;}
    public void setFormadoEm(String formadoEm) {this.formadoEm = formadoEm;}
    public int getAnoFormacao() {return this.anoFormacao;}
    public void setAnoFormacao(int ano) {anoFormacao = ano;}

    @Override
    public void apresentarSe() {
        System.out.println("Oi, me chamo " + nome + " e tenho " + idade + " anos");
        System.out.println("Me formei em " + anoFormacao + " lá na " + formadoEm);
    }
}

public class AlunoDoutorado extends AlunoMestrado {
    private String mestreEm;

    public AlunoDoutorado(String nome, int idade, int anoFormacao, String formadoEm) {
        super(nome, idade);
        setAnoFormacao(anoFormacao);
        setFormadoEm(formadoEm);
        this.mestreEm = "Robótica";
    }

    @Override
    public void apresentarSe() {
        System.out.println("Oi, me chamo " + nome + " e tenho " + idade + " anos");
        System.out.println("Me formei em " + getAnoFormacao() + " pela " + getFormadoEm());
        System.out.println("Fiz mestrado em " + mestreEm);
    }
}
