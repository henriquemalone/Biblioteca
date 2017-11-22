
package View;

import Model.Acervo;
import Model.Estudante;
import Model.Livro;
import Model.Revista;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class exibeExemplares extends javax.swing.JFrame {

    DefaultTableModel revista; //cria o objeto 'revista' da coleção DefaultTableModel
    DefaultTableModel livro; //cria o objeto 'livro' da coleção DefaultTableModel
    
    public exibeExemplares() {
        initComponents();
        preencherTabelaRevista(); //chama função para preencher a tabela
        preencherTabelaLivro(); //chama função para preencher a tabela
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        edtTitulo1 = new javax.swing.JTextField();
        edtAutor1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        edtEditora1 = new javax.swing.JTextField();
        btnProcurar1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnDeletaLivro = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        edtTitulo = new javax.swing.JTextField();
        btnProcurar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnExcluirRevista = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        edtId2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Exibe Exemplares");
        setExtendedState(6);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Tiítulo:");

        jLabel5.setText("Autor:");

        edtAutor1.setToolTipText("");
        edtAutor1.setEnabled(false);

        jLabel6.setText("Editora:");

        edtEditora1.setEnabled(false);

        btnProcurar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/lupa.png"))); // NOI18N
        btnProcurar1.setText("Pesquisar");
        btnProcurar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurar1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID do livro", "Título", "Autor", "Editora", "Categoria", "Situação de emprestimo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        btnDeletaLivro.setIcon(new javax.swing.ImageIcon("C:\\Users\\Henrique\\Desktop\\projetoJava - Copia\\img\\minus-4-xxl.png")); // NOI18N
        btnDeletaLivro.setText("Excluir");
        btnDeletaLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletaLivroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(edtTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtAutor1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(edtEditora1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnProcurar1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                                .addComponent(btnDeletaLivro)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtAutor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtEditora1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcurar1)
                    .addComponent(btnDeletaLivro))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Livros", jPanel3);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Tiítulo:");

        btnProcurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/lupa.png"))); // NOI18N
        btnProcurar.setText("Pesquisar");
        btnProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID da revista", "Título", "Categoria", "Situação de empréstimo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnExcluirRevista.setIcon(new javax.swing.ImageIcon("C:\\Users\\Henrique\\Desktop\\projetoJava - Copia\\img\\minus-4-xxl.png")); // NOI18N
        btnExcluirRevista.setText("Excluir");
        btnExcluirRevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirRevistaActionPerformed(evt);
            }
        });

        jLabel2.setText("ID:");

        edtId2.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(edtId2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(edtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnProcurar))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluirRevista)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcurar)
                    .addComponent(btnExcluirRevista)
                    .addComponent(edtId2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Revistas", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //quando a tela é ativa
        limparTabelaRevista(); //limpa a tabela 
        limparTabelaLivro(); //limpa a tabela 
        preencherTabelaRevista(); //chama função para preencher a tabela
        preencherTabelaLivro(); //chama função para preencher a tabela
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
        limparTabelaRevista(); //limpa a tabela 
        limparTabelaLivro(); //limpa a tabela 
        preencherTabelaRevista(); //chama função para preencher a tabela
        preencherTabelaLivro(); //chama função para preencher a tabela
    }//GEN-LAST:event_formWindowDeactivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void btnProcurar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurar1ActionPerformed
        String titulo = edtTitulo1.getText(); //variavel 'titulo' recebe o que estiver escrito no campo edtTitulo
        String id = edtId2.getText(); //variavel 'autor' recebe o que estiver escrito no campo edtAutor   

        procuraLivro(titulo); //chama o metodo que procura exemplar
    }//GEN-LAST:event_btnProcurar1ActionPerformed

    private void btnProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarActionPerformed
        String titulo = edtTitulo.getText(); //variavel 'titulo' recebe o que estiver escrito no campo edtTitulo
        String id = edtId2.getText(); //variavel 'titulo' recebe o que estiver escrito no campo edtTitulo   
        
        procuraRevista(id, titulo); //chama o metodo que procura exemplar
        
    }//GEN-LAST:event_btnProcurarActionPerformed

    private void btnExcluirRevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirRevistaActionPerformed
        //BOTÃO DELETAR
        int linhaSelRevista; //variavel que recebera a linha(revista) da tabela selecionada
       
        try{
            linhaSelRevista = jTable1.getSelectedRow();  //variavel 'linhaSel' recebera a linha da tabela selecionada 
            String id = (String) jTable1.getValueAt(linhaSelRevista, 0);
           
            if (JOptionPane.showConfirmDialog(null,"Deseja realmente apagar o registro desta revista?")==JOptionPane.OK_OPTION){ //notificação que pergunta se o usuario realmente quer excluir o estudante selecionado
                try{
                    Acervo acervo = new Acervo();
                    if(acervo.deletaRevista(id)==true){ //envia a variavel 'id' para o metodo deletaEstudante na classe Controle)
                        JOptionPane.showMessageDialog(null,"Revista deletada com sucesso!"); //abrirá uma janela informando que o estudate foi deletado com sucesso
                    }
                } catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Erro ao deletar revista!\nERRO:"+e.getMessage()); //caso ocorra algum erro, abrirá uma janela informando que aconteceu algo de errado e o erro que ocorreu  
                }    
            }
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Nenhuma revista selecionado!"); //caso nao seja selecionada nenhuma linha da tabela, abrira uma tela de notificação infromando que o usuário não selecionou nenhum estudante (linha)
        }
    }//GEN-LAST:event_btnExcluirRevistaActionPerformed

    private void btnDeletaLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletaLivroActionPerformed
        //BOTÃO DELETAR
        int linhaSelLivro; //variavel que recebera a linha(revista) da tabela selecionada
       
        try{
            linhaSelLivro = jTable2.getSelectedRow();  //variavel 'linhaSel' recebera a linha da tabela selecionada
            String id = (String) jTable2.getValueAt(linhaSelLivro, 0);    
           
            if (JOptionPane.showConfirmDialog(null,"Deseja realmente apagar o registro deste livro?")==JOptionPane.OK_OPTION){ //notificação que pergunta se o usuario realmente quer excluir o estudante selecionado
                try{
                    Acervo acervo = new Acervo();
                    if(acervo.deletaLivro(id)==true){ //envia a variavel 'id' para o metodo deletaEstudante na classe Controle)
                        JOptionPane.showMessageDialog(null,"Livro deletado com sucesso!"); //abrirá uma janela informando que o estudate foi deletado com sucesso
                    }
                } catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Erro ao deletar livro!\nERRO:"+e.getMessage()); //caso ocorra algum erro, abrirá uma janela informando que aconteceu algo de errado e o erro que ocorreu  
                }    
            }
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Nenhumo livro selecionado!"); //caso nao seja selecionada nenhuma linha da tabela, abrira uma tela de notificação infromando que o usuário não selecionou nenhum estudante (linha)
        }
    }//GEN-LAST:event_btnDeletaLivroActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(exibeExemplares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(exibeExemplares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(exibeExemplares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(exibeExemplares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new exibeExemplares().setVisible(true);
            }
        });
    }
    
    public void limparTabelaRevista(){ //método para limpar a tabela
        //livro.setNumRows(0); //faz a coluna ficar com zero linhas (limpa tabela)  tabela revista
        
        edtTitulo.setText(""); //apaga o campo de texto Edit
    }
    
    public void limparTabelaLivro(){ //método para limpar a tabela
        //revista.setNumRows(0); //faz a coluna ficar com zero linhas (limpa tabela)  tabela revista
        
        edtTitulo.setText(""); //apaga o campo de texto Edit
    }
    
    public void preencherTabelaRevista(){ //metodo para preencher a tabela com todos os dados ja salvos no banco de dados
        try {
            JTable tabela = new JTable();
            DefaultTableModel revista = (DefaultTableModel) jTable1.getModel();
            revista.setNumRows(0);
            tabela.setModel(revista);
            
            File arquivos[];
            File diretorio = new File("Revistas");
            arquivos = diretorio.listFiles();
            for(int i = 0; i < arquivos.length; i++){
                FileInputStream in = new FileInputStream(arquivos[i]);
                ObjectInputStream ois = new ObjectInputStream(in);
                Revista r = (Revista)ois.readObject();
                revista.addRow(new Object[]{r.getId(), r.getTitulo(), r.getCategoria(), r.getEmprestimo()});
                
                in.close();
                ois.close();
            }    
        } catch (IOException e) {
            Logger.getLogger(exibeExemplares.class.getName()).log(Level.SEVERE, null, e);
	} catch (ClassNotFoundException ex) {
            Logger.getLogger(exibeExemplares.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void preencherTabelaLivro(){ //metodo para preencher a tabela com todos os dados ja salvos no banco de dados
        try {
            JTable tabela = new JTable();
            DefaultTableModel livro = (DefaultTableModel) jTable2.getModel();
            livro.setNumRows(0);
            tabela.setModel(livro);
            
            File arquivos[];
            File diretorio = new File("Livros");
            arquivos = diretorio.listFiles();
            for(int i = 0; i < arquivos.length; i++){
                FileInputStream in = new FileInputStream(arquivos[i]);
                ObjectInputStream ois = new ObjectInputStream(in);
                Livro l = (Livro)ois.readObject();
                livro.addRow(new Object[]{l.getId(), l.getTitulo(), l.getAutor(), l.getEditora(), l.getCategoria(), l.getEmprestimo()});
                
                in.close();
                ois.close();
            }    
        } catch (IOException e) {
            Logger.getLogger(exibeExemplares.class.getName()).log(Level.SEVERE, null, e);
	} catch (ClassNotFoundException ex) {
            Logger.getLogger(exibeExemplares.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void procuraRevista(String id,String titulo ){ //meotdo para procurar um exemplar no banco de daodos
        TableRowSorter sorter = null;  
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();  
        sorter = new TableRowSorter<TableModel>(model);  
        jTable1.setRowSorter(sorter); 
         
        if (titulo.length() == 0) {  
            sorter.setRowFilter(null);  
        } else {  
            sorter.setRowFilter(RowFilter.regexFilter(titulo));  
        }      
    }
    
    public void procuraLivro(String titulo ){ //meotdo para procurar um exemplar no banco de daodos
        TableRowSorter sorter = null;  
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();  
        sorter = new TableRowSorter<TableModel>(model);  
        jTable2.setRowSorter(sorter); 
         
        if (titulo.length() == 0) {  
            sorter.setRowFilter(null);  
        } else {  
            sorter.setRowFilter(RowFilter.regexFilter(titulo));  
        }      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletaLivro;
    private javax.swing.JButton btnExcluirRevista;
    private javax.swing.JButton btnProcurar;
    private javax.swing.JButton btnProcurar1;
    private javax.swing.JTextField edtAutor1;
    private javax.swing.JTextField edtEditora1;
    private javax.swing.JTextField edtId2;
    private javax.swing.JTextField edtTitulo;
    private javax.swing.JTextField edtTitulo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
