package entitis;

public abstract class Correntista {
	
	private String nome;
	private String cpF;
	private String email;
	private int qtdTransacao;
	private double valorAnuidade;
	private Endereco endereco;

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpF() {
		return cpF;
	}

	public void setCpF(String cpF) {
		this.cpF = cpF;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getqtdTransacao() {
		return qtdTransacao;
	}

	public void setqtdTransacao(int qtd) {
		this.qtdTransacao = qtd;
	}

	public double getValorAnuidade() {
		return valorAnuidade;
	}

	public void setValorAnuidade(double valorAnuidade) {
		this.valorAnuidade = valorAnuidade;
	}
	


}
