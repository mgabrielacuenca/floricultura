package Classes;

public class CadastroCliente {

	private String nome,end,tel;

	
	public CadastroCliente(String nome, String end, String tel) {
		super();
		this.nome = nome;
		this.end = end;
		this.tel = tel;

	}
	
	public CadastroCliente() {

	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}


	@Override
	public String toString() {
		return "Cadastrado Com Sucesso: "+nome;
	}
	
	
	
	
}
