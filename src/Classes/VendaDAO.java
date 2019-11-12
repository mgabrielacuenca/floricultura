/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import ConexaoBanco.BancoDados;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author Tecnologia
 */
public class VendaDAO {

    // a conexão com o banco de dados
    private Connection con;
    private final com.mysql.jdbc.Connection connection;

    public VendaDAO() {
        this.connection = new BancoDados().getConnection();
    }

    public void adiciona(Venda venda) {
        String sql = "insert into venda "
                + "(codigo,nome,valor,qtd,total)"
                + " values (?,?,?,?,?)";
        try {
// prepared statement para inserção
            java.sql.PreparedStatement stmt = connection.prepareStatement(sql);

// seta os valores
            stmt.setString(1, venda.getCodigo());
            stmt.setString(2, venda.getNome());
            stmt.setDouble(3, venda.getValor());
            stmt.setInt(4, venda.getQtd());
            stmt.setDouble(5, venda.getTotal());
// executa
            stmt.execute();
            System.out.println("Dados Inseridos Com Sucesso No Banco!!!\n ---------------------------------\n Valor Total: "
                    +venda.getTotal()+"\n ---------------------------------");
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }
         
            
}

