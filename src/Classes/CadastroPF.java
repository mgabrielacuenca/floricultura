package Classes;

public class CadastroPF extends CadastroCliente {
	
	private String cpf;

	public CadastroPF(String nome, String end, String tel, String cpf) {
		super(nome, end, tel);
		this.cpf = cpf;
	}
	
	public CadastroPF(){}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
}
