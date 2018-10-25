package exemplos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PessoaFisica {
	private String nome;
	private String CPF;
	private int idade;
	private Date dataDeNascimento;
	
	public PessoaFisica() {
		System.out.println("Construtor padrão"); 
	}
	
	public PessoaFisica(String nome) {
		this();
		this.nome = nome;
	}
	
	public PessoaFisica(String nome, String CPF) {
		this.nome = nome;
		this.CPF = CPF;
	}
	
	public PessoaFisica(String nome, String cPF, String dataDeNascimento) {
		this.nome = nome;
		CPF = cPF;
		setDataDeNascimento(dataDeNascimento);
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date data = null;
		try {
			data = formato.parse(dataDeNascimento);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		this.dataDeNascimento = data;
		calcularIdade();
	}
	
	private void calcularIdade() {
		Calendar calendario = Calendar.getInstance();
		int mesDeHoje = calendario.get(Calendar.MONTH);
		int anoDeHoje = calendario.get(Calendar.YEAR);
		
		calendario.setTime(dataDeNascimento);
		int mesDeNascimento = calendario.get(Calendar.MONTH);
		int anoDeNascimento = calendario.get(Calendar.YEAR);
		
		int idade = anoDeHoje - anoDeNascimento - ((mesDeHoje < mesDeNascimento) ? 0 : 1);
		setIdade(idade);
	}
	
	public String mostrarDataDeNascimento() {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		if (dataDeNascimento == null) {
			return "";
		}
		else {
			return formato.format(dataDeNascimento);
		}
	}
	
	public void apresentarSe() {
		System.out.print("Meu nome é ");
		System.out.println(nome);
		System.out.print("Meu CPF é ");
		System.out.println(CPF);
		System.out.print("Nasci em ");
		System.out.println(mostrarDataDeNascimento());
		System.out.printf("Tenho %d anos de idade\n\n", idade);
	}
}

