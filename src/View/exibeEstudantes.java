package View;

import Model.Clientes;
import Model.Estudante; //importa a classe Estudante
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList; //importa "biblioteca" para utilização de ArrayList
import java.util.List; //importa "biblioteca" para utilização de List
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane; //importa swing do JOptionPane (janela de notificação)
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel; //importa a classe DefaultTableModel para criação da tabela
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class exibeEstudantes extends javax.swing.JFrame {

    PreparedStatement stmt = null; //query do banco de dados 
    cadEstudante cadestudante = new cadEstudante(); //cria o objeto 'cadestudante' da classe cadEstudante
    DefaultTableModel tabela; //cria o objeto 'tabela' da coleção DefaultTableModel
    private String antiga;
    
    public exibeEstudantes() { //construtor
        initComponents();
        preencherTabela(); //preenche a tabela quando a tela é aberta
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        edtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Exibe Estudantes");
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Data de Nascimento", "Sexo", "CPF", "RG", "Celular", "Telefone", "Email", "Endereço", "CEP", "Nº", "Bairro", "Cidade", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, true, true, true, true, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("ID do estudante:");

        jLabel2.setText("Nome do estudante:");

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/lupa.png"))); // NOI18N
        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(edtId))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))
                        .addGap(0, 224, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/edtt.png"))); // NOI18N
        jMenu1.setText("Editar");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/minus-4-xxl.png"))); // NOI18N
        jMenu2.setText("Excluir");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //quando a tela é ativa
        limparTabela(); //limpa a tabela 
        preencherTabela(); //chama função para preencher a tabela
    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //botão PESQUISAR
        String nome = edtNome.getText(); //variavel 'titulo' recebe o que estiver escrito no campo edtTitulo
        String id = edtId.getText(); //variavel 'titulo' recebe o que estiver escrito no campo edtTitulo   
        
        procuraEstudante(id, nome); //chama o metodo que procura exemplar
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        //botão DELETAR
        int linhaSel; //variavel que recebera a linha(revista) da tabela selecionada
       
        try{
            linhaSel = jTable1.getSelectedRow();  //variavel 'linhaSel' recebera a linha da tabela selecionada 
            String id = (String) jTable1.getValueAt(linhaSel,0); //variavel 'id' recebera o valor das coordenadas selecionada(linhaSel e coluna zero para receber o id do estudante) 

            Clientes cliente = new Clientes();
            if (JOptionPane.showConfirmDialog(null,"Deseja realmente apagar o registro deste estudante?")==JOptionPane.OK_OPTION){ //notificação que pergunta se o usuario realmente quer excluir o estudante selecionado
                try{
                    if(cliente.deletaEstudante(id)==true){ //envia a variavel 'id' para o metodo deletaEstudante na classe Controle)
                        JOptionPane.showMessageDialog(null,"Estudante deletado com sucesso!"); //abrirá uma janela informando que o estudate foi deletado com sucesso
                    }
                } catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Erro ao deletar estudante!\nERRO:"+e.getMessage()); //caso ocorra algum erro, abrirá uma janela informando que aconteceu algo de errado e o erro que ocorreu  
                }    
            }
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Nenhum estudante selecionado!"); //caso nao seja selecionada nenhuma linha da tabela, abrira uma tela de notificação infromando que o usuário não selecionou nenhum estudante (linha)
        }
    }//GEN-LAST:event_jMenu2MouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
 
    }//GEN-LAST:event_formWindowClosed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
        limparTabela(); //limpa a tabela
        preencherTabela(); //chama função para preencher a tabela
    }//GEN-LAST:event_formWindowDeactivated

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        //botão EDITAR
        int linhaSel; //variavel que recebera a linha(estudante) da tabela selecionada
        
        linhaSel = jTable1.getSelectedRow();  //variavel 'linhaSel' recebera o numedo da linha da tabela selecionada 
        String id = (String) jTable1.getValueAt(linhaSel,0); //variavel 'id' recebera o valor das coordenadas selecionada(linhaSel e coluna zero para receber o id do estudante) 
        String nome = (String) jTable1.getValueAt(linhaSel,1); //variavel 'id' recebera o valor das coordenadas selecionada(linhaSel e coluna zero para receber o id do estudante) 
        String data = (String) jTable1.getValueAt(linhaSel,2); //variavel 'id' recebera o valor das coordenadas selecionada(linhaSel e coluna zero para receber o id do estudante) 
        String cpf = (String) jTable1.getValueAt(linhaSel,4); //variavel 'id' recebera o valor das coordenadas selecionada(linhaSel e coluna zero para receber o id do estudante)
        String rg = (String) jTable1.getValueAt(linhaSel,5); //variavel 'id' recebera o valor das coordenadas selecionada(linhaSel e coluna zero para receber o id do estudante) 
        String cel = (String) jTable1.getValueAt(linhaSel,6); //variavel 'id' recebera o valor das coordenadas selecionada(linhaSel e coluna zero para receber o id do estudante) 
        String tel = (String) jTable1.getValueAt(linhaSel,7); //variavel 'id' recebera o valor das coordenadas selecionada(linhaSel e coluna zero para receber o id do estudante) 
        String email = (String) jTable1.getValueAt(linhaSel,8); //variavel 'id' recebera o valor das coordenadas selecionada(linhaSel e coluna zero para receber o id do estudante) 
        String end = (String) jTable1.getValueAt(linhaSel,9); //variavel 'id' recebera o valor das coordenadas selecionada(linhaSel e coluna zero para receber o id do estudante) 
        String num = (String) jTable1.getValueAt(linhaSel,11); //variavel 'id' recebera o valor das coordenadas selecionada(linhaSel e coluna zero para receber o id do estudante) 
        String bairro = (String) jTable1.getValueAt(linhaSel,12); //variavel 'id' recebera o valor das coordenadas selecionada(linhaSel e coluna zero para receber o id do estudante) 
        String cidade = (String) jTable1.getValueAt(linhaSel,13); //variavel 'id' recebera o valor das coordenadas selecionada(linhaSel e coluna zero para receber o id do estudante) 
        String estado = (String) jTable1.getValueAt(linhaSel,14); //variavel 'id' recebera o valor das coordenadas selecionada(linhaSel e coluna zero para receber o id do estudante) 
        String cep = (String) jTable1.getValueAt(linhaSel,10); //variavel 'id' recebera o valor das coordenadas selecionada(linhaSel e coluna zero para receber o id do estudante) 
        String sexo = (String) jTable1.getValueAt(linhaSel,3); //variavel 'id' recebera o valor das coordenadas selecionada(linhaSel e coluna zero para receber o id do estudante) 
        //antiga = id+";"+nome+";"+data+";"+sexo+";"+cpf+";"+rg+";"+cel+";"+tel+";"+email+";"+end+";"+cep+";"+num+";"+bairro+";"+cidade+";"+estado;
        
        cadestudante.setTitle("Editar Estudante"); //muda o titulo do formulario
        cadestudante.preencheFormulario(id, nome, data, rg, cpf, tel, cel, email, end, num, bairro, cidade, estado, 1, cep, sexo); //chama o metodo 'preencheFormulario' passando o numero um como parametro e o id do estudante selecionado
        cadestudante.setLocationRelativeTo(null); //centraliza tela de cadastro de estudante
        cadestudante.setVisible(true); //abre tela de cadastro de estudante
    }//GEN-LAST:event_jMenu1MouseClicked

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
            java.util.logging.Logger.getLogger(exibeEstudantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(exibeEstudantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(exibeEstudantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(exibeEstudantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new exibeEstudantes().setVisible(true);
            }
        });
    }
    
    /**Método para preencher a tabela.
     * @return void.
     */
    public void preencherTabela(){ //metodo que preenche a tabela
        try {
            JTable tabela = new JTable();
            DefaultTableModel estudante = (DefaultTableModel) jTable1.getModel();
            estudante.setNumRows(0);
            tabela.setModel(estudante);
            
            File arquivos[];
            File diretorio = new File("Estudantes");
            arquivos = diretorio.listFiles();
            for(int i = 0; i < arquivos.length; i++){
                FileInputStream in = new FileInputStream(arquivos[i]);
                ObjectInputStream ois = new ObjectInputStream(in);
                Estudante e = (Estudante)ois.readObject();
                estudante.addRow(new Object[]{e.getId(), e.getNome(), e.getDataNasc(), e.getSexo(), e.getCpf(), e.getRg(),
                e.getCelular(), e.getTelefone(), e.getEmail(), e.getEnd(), e.getCep(), e.getNum(), e.getBairro(), e.getCidade(), e.getUf()});
                
                in.close();
                ois.close();
            }    
        } catch (IOException e) {
            Logger.getLogger(exibeEstudantes.class.getName()).log(Level.SEVERE, null, e);
	} catch (ClassNotFoundException ex) {
            Logger.getLogger(exibeEstudantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setAntiga(String antiga){
        this.antiga = antiga;
    }
    
    public String getAntiga(){
        return antiga;
    }
    
    /**Método para limpar a tabela.
     * @return void.
     */
    public void limparTabela(){ //método para limpar a tabela
        //tabela.setNumRows(0); //faz a coluna ficar com zero linhas (limpa tabela)
        
        edtId.setText(""); //apaga o campo de texto Edit
        edtNome.setText(""); //apaga o campo de texto Edit
    }
    
    /**Método para procurar um estudante na tabela.
     * @param  nome String - nome do estudante.
     * @param  id String - id do estudante.
     * @return void.
     */
    public void procuraEstudante(String id, String nome){ 
        TableRowSorter sorter = null;  
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();  
        sorter = new TableRowSorter<TableModel>(model);  
        jTable1.setRowSorter(sorter); 
         
        if (id.length() == 0) {  
            sorter.setRowFilter(null);  
        } else {  
            sorter.setRowFilter(RowFilter.regexFilter(id));  
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField edtId;
    private javax.swing.JTextField edtNome;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
