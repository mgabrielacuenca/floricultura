package Classes;

public class Produtos {

	public String nome, codigo;
	public double valor;
	
	
	public Produtos(String nome, String codigo, double valor) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.valor = valor;
	}
	
	public Produtos(){}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Produto cadastrado com sucesso: " +nome;
	}
	
	
}
