
package view;

import dao.ProdutoDao;
import javax.swing.JOptionPane;
import model.Produto;
import table.ProdutoTableModel;


public class ProdutoView extends javax.swing.JFrame {

    /**
     * Creates new form ProdutoView
     */
    Produto produto = new Produto();
    ProdutoDao produtoDao = new ProdutoDao();
    public ProdutoView() {
        initComponents();
        setLocationRelativeTo(null);
        tbProduto.setModel(new ProdutoTableModel(new ProdutoDao().mostrarTodos()));
        btnexcluir.setEnabled(false);
        
        
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtdescricao = new javax.swing.JTextField();
        txtpreco = new javax.swing.JTextField();
        btnlimpar = new javax.swing.JButton();
        btnexcluir = new javax.swing.JButton();
        btnsalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProduto = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtpesquisa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estoque");
        setResizable(false);

        jLabel1.setText("Código:");

        jLabel2.setText("Descrição:");

        jLabel3.setText("Preço:");

        txtcodigo.setEditable(false);
        txtcodigo.setBackground(new java.awt.Color(255, 204, 204));

        txtpreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecoActionPerformed(evt);
            }
        });
        txtpreco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprecoKeyTyped(evt);
            }
        });

        btnlimpar.setText("limpar");
        btnlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimparActionPerformed(evt);
            }
        });

        btnexcluir.setText("Excluir");
        btnexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirActionPerformed(evt);
            }
        });

        btnsalvar.setText("salvar");
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });

        tbProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbProduto);

        jLabel4.setText("Pesquisar (Descriçao/nome):");

        txtpesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpesquisaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtdescricao)
                                    .addComponent(txtpreco)
                                    .addComponent(txtcodigo)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnexcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnlimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnsalvar))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpesquisa)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addComponent(txtdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtpreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlimpar)
                    .addComponent(btnexcluir)
                    .addComponent(btnsalvar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtprecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecoActionPerformed

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        if(txtdescricao.getText().equals("")||txtpreco.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Campos nao podem estar em branco","Produto Aviso",JOptionPane.WARNING_MESSAGE);
            
        }else{
            if (txtcodigo.getText().equals("")) {
                produto.setDescricao(txtdescricao.getText());
                produto.setPreco(Double.parseDouble(txtpreco.getText()));
                produtoDao.inserir(produto);
            } else {
                //altera o id que voi infirmado
                produto.setDescricao(txtdescricao.getText());
                produto.setPreco(Double.parseDouble(txtpreco.getText()));
                produto.setCodigo(Integer.parseInt(txtcodigo.getText()));
                produtoDao.alterar(produto);
            }
          
        }    
            tbProduto.setModel(new ProdutoTableModel(new ProdutoDao().mostrarTodos()));
            txtcodigo.setText("");
            txtdescricao.setText("");
            txtpreco.setText("");
            txtpesquisa.setText("");
            btnexcluir.setEnabled(false);
    }//GEN-LAST:event_btnsalvarActionPerformed

    private void btnlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimparActionPerformed
        tbProduto.setModel(new ProdutoTableModel(new ProdutoDao().mostrarTodos()));
        txtcodigo.setText("");
        txtdescricao.setText("");
        txtpreco.setText("");
        txtpesquisa.setText("");
    }//GEN-LAST:event_btnlimparActionPerformed

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
        //escolha =JOptionPane.showConfirmDialog(null,"QUESTAO","TITULO DA JANELA",JOptionPane.YES_NO_OPTION);
        int escolha =JOptionPane.showConfirmDialog(null,"Tem certeza?","Produto Excluir",JOptionPane.YES_NO_OPTION);
        // sim = 0 nao =1
        if(escolha ==0){
            int codigo = Integer.parseInt(txtcodigo.getText());
            produtoDao.excluir(codigo);
            tbProduto.setModel(new ProdutoTableModel(new ProdutoDao().mostrarTodos()));
            txtcodigo.setText("");
            txtdescricao.setText("");
            txtpreco.setText("");
            txtpesquisa.setText("");
            btnexcluir.setEnabled(false);
           
        } 
        
    }//GEN-LAST:event_btnexcluirActionPerformed

    private void tbProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProdutoMouseClicked
        txtcodigo.setText(tbProduto.getValueAt(tbProduto.getSelectedRow(),ProdutoTableModel.COL_CODIGO).toString());
        txtdescricao.setText(tbProduto.getValueAt(tbProduto.getSelectedRow(),ProdutoTableModel.COL_DESCRICAO).toString());
        txtpreco.setText(tbProduto.getValueAt(tbProduto.getSelectedRow(),ProdutoTableModel.COL_PRECO).toString());
        btnexcluir.setEnabled(true);
    }//GEN-LAST:event_tbProdutoMouseClicked

    private void txtpesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesquisaKeyPressed
        String consulta = txtpesquisa.getText();
        tbProduto.setModel(new ProdutoTableModel(new ProdutoDao().mostrarProduto(consulta)));
    }//GEN-LAST:event_txtpesquisaKeyPressed
    //EVET CRIADO PARA ACEITAR SOMENTE NUMEROS NO JTextField COMO VISTO NO SITE
    //https://www.devmedia.com.br/como-alterar-o-componente-jtextfield-para-aceitar-apenas-numeros/26152
    private void txtprecoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecoKeyTyped
        String numeros="0987654321.";
        if(!numeros.contains(evt.getKeyChar()+"")){
        evt.consume();
}
    }//GEN-LAST:event_txtprecoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexcluir;
    private javax.swing.JButton btnlimpar;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbProduto;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdescricao;
    private javax.swing.JTextField txtpesquisa;
    private javax.swing.JTextField txtpreco;
    // End of variables declaration//GEN-END:variables
}
