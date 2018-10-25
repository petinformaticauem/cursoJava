package exemplos;

public class Exemplo1 {

	public static void main(String[] args) {
		PessoaFisica p1, p2, p3, p4;
		
		p1 = new PessoaFisica();
		p2 = new PessoaFisica("Rafael");
		p3 = new PessoaFisica("Fulano de Tal", "012.345.678-90");
		p4 = new PessoaFisica("Gás nobre", "987.654.321-00", "23/05/1997");
		
		p1.apresentarSe();
		p2.apresentarSe();
		p3.apresentarSe();
		p4.apresentarSe();
		
		p2.setDataDeNascimento("11/11/1996");
		p2.apresentarSe();
	}
}

