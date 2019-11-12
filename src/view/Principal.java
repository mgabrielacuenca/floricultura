package view;

import ConexaoBanco.BancoDados;
import Classes.Venda;
import java.sql.Connection;
import java.sql.SQLException;
import Classes.CadFor;
import Classes.CadastroPF;
import Classes.CadastroPJ;
import Classes.VendaDAO;

public class Principal {

    public static void main(String[] args) throws SQLException {
        // TODO Auto-generated method stub

        CadastroPF PF = new CadastroPF();

        PF.setNome("GABRIELA");
        PF.setCpf("0239912939231");
        PF.setEnd("RUA J");
        PF.setTel("34540099");
        System.out.println(PF.toString());

        CadastroPJ PJ = new CadastroPJ();

        PJ.setNome("EMPRESA ");
        PJ.setCnpj("12312312");
        PJ.setEnd("RUA SETOR");
        PJ.setTel("909929292");

        System.out.println(PJ.toString());

        CadFor cadfor = new CadFor();

        cadfor.setCnpj("023340002002");
        cadfor.setNome("FORNECEDOR");
        cadfor.setEndEmp("RUA B 10");

        System.out.println(cadfor.toString());
        
        
        Connection connection = new BancoDados().getConnection();
        System.out.println("Conexão aberta!"); 
        
        VendaDAO vdao = new VendaDAO();
        // VENDA
        Venda venda = new Venda();
        
        
        venda.setCodigo("CESTA DE CAFE");
        venda.setNome("CESTA DE CAFÉ DA MANHA");
        venda.setValor(102);
        venda.setQtd(6);
        venda.vendeu();
        
        vdao.adiciona(venda);


       
        connection.close();
        
        
        
        
        

    }

}
