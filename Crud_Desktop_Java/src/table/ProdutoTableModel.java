/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Produto;

/**
 *
 * @author All user
 */
public class ProdutoTableModel extends AbstractTableModel{
    public static final int COL_CODIGO =0;
    public static final int COL_DESCRICAO =1;
    public static final int COL_PRECO =2;
    public ArrayList<Produto> lista;
    
    public ProdutoTableModel(ArrayList<Produto> l){
        lista =new ArrayList<Produto>(l);
    
    }
    @Override
    public int getRowCount() {
         return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Produto produto = lista.get(linhas);
        if(colunas == COL_CODIGO){
            return produto.getCodigo();
        }
        if(colunas == COL_DESCRICAO){
            return produto.getDescricao();
        }
        if(colunas == COL_PRECO){
            return produto.getPreco();
        }
        return "";
    }
    @Override
    public String getColumnName(int colunas){
        if(colunas == COL_CODIGO){
            return "Código";
        }
        if(colunas == COL_DESCRICAO){
            return "Descrição";
        }
        if(colunas == COL_PRECO){
            return "Preço";
        }
        return "";
    }
    
}
