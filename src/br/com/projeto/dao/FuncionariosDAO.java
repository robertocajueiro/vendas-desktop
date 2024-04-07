/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projeto.dao;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.model.Funcionarios;
import br.com.projeto.view.FrmMenu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Roberto Dantas
 */
public class FuncionariosDAO {
    
    // Conexao
     private Connection con;

    public FuncionariosDAO() {
        this.con = new ConnectionFactory().getConnection();
    }
    
    // Metodo cadastrar Funcionario
     public void cadastrarFuncionarios(Funcionarios obj) {

        try {

            //Primeiro passo: criar o comando sql
            String sql = "insert  into tb_funcionarios(nome,rg,cpf,email,senha,cargo,nivel_acesso,telefone,celular,cep,endereco,numero,complemento,bairro,cidade,estado) "
                    + "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            // Segundo passo: conectar o banco de dados e organizar o sql.
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getRg());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            stmt.setString(5, obj.getSenha());
            stmt.setString(6, obj.getCargo());
            stmt.setString(7, obj.getNivel_acesso());
            stmt.setString(8, obj.getTelefone());
            stmt.setString(9, obj.getCelular());
            stmt.setString(10, obj.getCep());
            stmt.setString(11, obj.getEndereco());
            stmt.setInt(12, obj.getNumero());
            stmt.setString(13, obj.getComplemento());
            stmt.setString(14, obj.getBairro());
            stmt.setString(15, obj.getCidade());
            stmt.setString(16, obj.getUf());

            // Terceiro passo: Executar comando SQL
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }

    }
     
         //Metodo alterar Funcionario
    public void alterarFuncionario(Funcionarios  obj) {

        try {

            //Primeiro passo: criar o comando sql
            String sql = "update  tb_funcionarios set nome=?,rg=?,cpf=?,email=?, senha=?, cargo=?, nivel_acesso=?,telefone=?,celular=?,cep=?,"
                    + "endereco=?,numero=?,complemento=?,bairro=?,cidade=?,estado=?  where id = ?";

            // Segundo passo: conectar o banco de dados e organizar o sql.
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getRg());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            stmt.setString(5, obj.getSenha());
            stmt.setString(6, obj.getCargo());
            stmt.setString(7, obj.getNivel_acesso());
            stmt.setString(8, obj.getTelefone());
            stmt.setString(9, obj.getCelular());
            stmt.setString(10, obj.getCep());
            stmt.setString(11, obj.getEndereco());
            stmt.setInt(12, obj.getNumero());
            stmt.setString(13, obj.getComplemento());
            stmt.setString(14, obj.getBairro());
            stmt.setString(15, obj.getCidade());
            stmt.setString(16, obj.getUf());

            stmt.setInt(17, obj.getId());

            // Terceiro passo: Executar comando SQL
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }

    }
     
     //Metodo excluir funcionario
    public void excluirFuncionario(Funcionarios obj) {

        try {

            //Primeiro passo: criar o comando sql
            String sql = "delete from tb_funcionarios where id = ?";

            // Segundo passo: conectar o banco de dados e organizar o sql.
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getId());

            // Terceiro passo: Executar comando SQL
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Excluido  com sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }

    }
     
     // Metodo listar todos os funcionarios
    public List<Funcionarios> listarFuncionarios() {
        try {
            // primeiro passo - criar a lista
            List<Funcionarios> lista = new ArrayList<>();

            // segundo passo - criar o sql, organizar e executar
            String sql = "select * from tb_funcionarios";
            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Funcionarios obj = new Funcionarios();

                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                obj.setSenha(rs.getString("senha"));
                obj.setCargo(rs.getString("cargo"));
                obj.setNivel_acesso(rs.getString("nivel_acesso"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setCelular(rs.getString("celular"));
                obj.setCep(rs.getString("cep"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getInt("numero"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setUf(rs.getString("estado"));

                lista.add(obj);
            }

            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return null;
        }

    }
    
        // Método buscar funcionarios por nome
    public List<Funcionarios> buscaFuncionariosPorNome(String nome) {
        try {
            // primeiro passo - criar a lista
            List<Funcionarios> lista = new ArrayList<>();

            // segundo passo - criar o sql, organizar e executar
            String sql = "select * from tb_funcionarios where nome like ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Funcionarios obj = new Funcionarios();

                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                
                obj.setSenha(rs.getString("senha"));
                obj.setCargo(rs.getString("cargo"));
                obj.setNivel_acesso(rs.getString("nivel_acesso"));  
                
                obj.setTelefone(rs.getString("telefone"));
                obj.setCelular(rs.getString("celular"));
                obj.setCep(rs.getString("cep"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getInt("numero"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setUf(rs.getString("estado"));

                lista.add(obj);
            }

            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return null;
        }

    }
    
     // Metodo consulta funcionario por nome
    public Funcionarios consultaPorNome(String nome) {
        try {
            //1 passo criar o sql, organizar e executar
            String sql = "select * from tb_funcionarios where nome = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);

            ResultSet rs = stmt.executeQuery();
            Funcionarios obj = new Funcionarios();

            if (rs.next()) {
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                obj.setSenha(rs.getString("senha"));
                obj.setCargo(rs.getString("cargo"));
                obj.setNivel_acesso(rs.getString("nivel_acesso"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setCelular(rs.getString("celular"));
                obj.setCep(rs.getString("cep"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getInt("numero"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setUf(rs.getString("estado"));
            }
            
            return obj;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado " + e);
            return null;
        }

    }
    
    // Metodo efetuaLogin
    public void efetuaLogin(String email, String senha) {
        try {
            
            // 1 passo - SQL
            String sql = "select * from tb_funcionarios where email=? and senha=?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, senha);
            
            ResultSet   rs = stmt.executeQuery();
            
            if(rs.next()) {
                // Usuario conectou
                 JOptionPane.showMessageDialog(null, "Seja bem vindo ao sistema");
                 FrmMenu tela = new FrmMenu();
                 tela.setVisible(true);
            } else {
                // Dados  incorretos 
                 JOptionPane.showMessageDialog(null, "Dados incorretos!");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR " + e);
        }
    }
    
}
