package entitis;

public abstract class  Animal {
	
	private String nome;
	private String doc;
	private double peso;
	
	
	public String getNome() {
		return nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDoc() {
		return doc;
	}
	public void setDoc(String doc) {
		this.doc = doc;
	}
	
   public double CalcularPeso(int pesoCobra) {
	return pesoCobra * 120.0 ;
	   
   }

}
