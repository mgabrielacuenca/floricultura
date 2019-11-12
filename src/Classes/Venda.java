package Classes;

import Classes.Produtos;

public class Venda extends Produtos {
	
	private int qtd;
	private double desc = 1;
	private double total;


	
	public Venda(){}

	
	public Venda(String nome, String codigo, double valor, int qtd, double desc, double total) {
		super(nome, codigo, valor);
		this.qtd = qtd;
		this.desc = desc;
		this.total = total;
	}

	
	public Venda(int qtd, double desc, double total) {
		super();
		this.qtd = qtd;
		this.desc = desc;
		this.total = total;

	}




	public int getQtd() {
		return qtd;
	}


	public void setQtd(int qtd) {
		this.qtd = qtd;
	}


	public double getDesc() {
		return desc;
	}


	public void setDesc(double desc) {
		this.desc = desc;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}




	public void vendeu(){
		
		total = 0;
		desc = 0;
                
		if(qtd > 5){
			desc = 0.10;
		}
					
		total = valor * qtd;
		desc = valor * qtd * desc;
		total = total - desc;
                setTotal(total);
                
		System.out.println(" ----------- PRODUTO ------------- \n:"+nome);
		
		
	}

	
}
