package Classes;

public class CadFor {
	
	private String cnpj;
	private String nome;
	private String endEmp;
	
	public CadFor(String cnpj, String nome, String endEmp) {
		super();
		this.cnpj = cnpj;
		this.nome = nome;
		this.endEmp = endEmp;
	}
	
	public CadFor(){}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndEmp() {
		return endEmp;
	}

	public void setEndEmp(String endEmp) {
		this.endEmp = endEmp;
	}

	@Override
	public String toString() {
		return "Cadastro de Fornecedor Realizado :"+nome +" :"+cnpj +" :" +endEmp ;
	}
	
	
	
	
	
	
}
