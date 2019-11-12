package Classes;

public class CadastroPJ extends CadastroCliente{
	
	private String cnpj;

	public CadastroPJ(String nome, String end, String tel, String cnpj) {
		super(nome, end, tel);
		this.cnpj = cnpj;
	}
	
	public CadastroPJ(){}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	

}
