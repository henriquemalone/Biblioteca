package View;

import Model.Acervo;
import Model.Clientes;
import Model.CtrEmprestimo;
import Model.Emprestimo;
import Model.Estudante;
import Model.Livro;
import Model.Revista;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class efetuarEmprestimo extends javax.swing.JFrame {
    
    public efetuarEmprestimo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        edtIdExemplar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        edtTitulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        edtCat = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        edtAutor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        edtEditora = new javax.swing.JTextField();
        btnBuscarEx = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        edtIdEstudante = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        edtEnd = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        edtNum = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        edtCpf = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        edtRg = new javax.swing.JFormattedTextField();
        edtBuscarEs = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        edtDataPrevisao = new javax.swing.JFormattedTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Efetuar Empréstimo");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("EFETUAR EMPRÉSTIMO");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Exemplar"));

        jLabel2.setText("ID do exemplar:");

        jLabel3.setText("Título:");

        edtTitulo.setEnabled(false);

        jLabel4.setText("Categoria:");

        edtCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Livro", "Revista" }));

        jLabel5.setText("Autor:");

        edtAutor.setEnabled(false);

        jLabel6.setText("Editora:");

        edtEditora.setEnabled(false);

        btnBuscarEx.setText("Buscar");
        btnBuscarEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarExActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(edtIdExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3))
                            .addComponent(edtCat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edtAutor)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edtEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBuscarEx)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtIdExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(edtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(edtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnBuscarEx)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Estudante"));

        jLabel7.setText("ID do estudante:");

        jLabel8.setText("Nome:");

        edtNome.setEnabled(false);

        jLabel9.setText("Endereço:");

        edtEnd.setEnabled(false);

        jLabel10.setText("Nº:");

        edtNum.setEnabled(false);

        jLabel11.setText("CPF:");

        try {
            edtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        edtCpf.setEnabled(false);

        jLabel12.setText("RG:");

        try {
            edtRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        edtRg.setEnabled(false);

        edtBuscarEs.setText("Buscar");
        edtBuscarEs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtBuscarEsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtIdEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(edtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtNum))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(edtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(edtBuscarEs)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(edtIdEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(edtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(edtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(edtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtBuscarEs))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Emprestar"));

        jLabel13.setText("Data de devolução:");

        try {
            edtDataPrevisao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtDataPrevisao, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(edtDataPrevisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(83, 83, 83))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/salv.png"))); // NOI18N
        jMenu1.setText("Efetuar empréstimo");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/+2.png"))); // NOI18N
        jMenu2.setText("Novo");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu2MouseEntered(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/close_red.png"))); // NOI18N
        jMenu3.setText("Cancelar");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        edtTitulo.setText(""); //Limpa o campo de texto Edit
        edtIdEstudante.setText(""); //Limpa o campo de texto Edit
        edtIdExemplar.setText(""); //Limpa o campo de texto Edit
        edtNome.setText(""); //Limpa o campo de texto Edit
        edtDataPrevisao.setText(""); //Limpa o campo de texto Edit
        edtCat.setSelectedIndex(0); //Limpa o campo de texto Edit
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        if (JOptionPane.showConfirmDialog(null,"Deseja realmente cancelar o cadastro?")==JOptionPane.OK_OPTION){ //abre uma notificação questionando se o usuário realmente quer cancelar o cadastro
            edtTitulo.setText(""); //Limpa o campo de texto Edit
            edtIdEstudante.setText(""); //Limpa o campo de texto Edit
            edtIdExemplar.setText(""); //Limpa o campo de texto Edit
            edtNome.setText(""); //Limpa o campo de texto Edit
            edtDataPrevisao.setText(""); //Limpa o campo de texto Edit 
            edtCat.setSelectedIndex(0); //Limpa o campo de texto Edit
            this.dispose(); //fecha a janela
        } 
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2MouseEntered

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        limparFormulario(); //limpa o formuláro quando a janela é fechada
    }//GEN-LAST:event_formWindowClosed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        String categoria = (String) edtCat.getSelectedItem();  //variavel recebe o valor do edit
        String idExemplar = edtIdExemplar.getText(); //variavel recebe o valor do edit
        String titulo = edtTitulo.getText(); //variavel recebe o valor do edit
        String idEstudante = edtIdEstudante.getText();//variavel recebe o valor do edit
        String nome = edtNome.getText();//variavel recebe o valor do edit
        String dataP = edtDataPrevisao.getText();    //variavel recebe o valor do edit
        String dataDevol = null;//variavel recebe o valor do edit
        String autor = edtAutor.getText();//variavel recebe o valor do edit
        String editora = edtEditora.getText();//variavel recebe o valor do edit
        CtrEmprestimo e = new CtrEmprestimo();//variavel recebe o valor do edit

        if(idExemplar.isEmpty() && idEstudante.isEmpty()){ //verifica se os campos não estao vazios
            JOptionPane.showMessageDialog(null, "Verifique se todos os campoes estão preenchidos!"); //janela de mensagem
        } else{
            if(e.verificaEmprestimo(idExemplar, categoria) == true){ //se o metodo verificaEmprestimo retorna true
                JOptionPane.showMessageDialog(null, "Exemplar já emprestado!"); //janea de mensagem
            } else {
                Emprestimo emprestimo = new Emprestimo(); //cria o objeto emprestimo
                String id = e.gerarId(); //variavel recebe o id gerado
                emprestimo.setId(id); //faz o respectivo set
                emprestimo.setExemplar(idExemplar);//faz o respectivo set
                emprestimo.setTitulo(titulo);//faz o respectivo set
                emprestimo.setEstudante(idEstudante);//faz o respectivo set
                emprestimo.setNomeEst(nome);//faz o respectivo set
                emprestimo.setDataPrevisao(dataP);//faz o respectivo set
                emprestimo.setCategoria(categoria);   //faz o respectivo set
                emprestimo.setDataDevolucao(dataDevol);//faz o respectivo set
            
                try {
                    if(e.efetuaEmprestimo(emprestimo)==true){ //se o metodo efetuaEmpreestimo retorna true
                        JOptionPane.showMessageDialog(null, "ID do empréstimo:"+id+"\nEmpréstimo realizado com sucesso!"); //janea de mensagem
                        if(categoria.equals("Livro")){ //se a categoria for igual a Livro
                            Livro livro = new Livro(); //cria o obejto livro
                            livro.setId(idExemplar); //faz o respectivo set
                            livro.setTitulo(titulo);//faz o respectivo set
                            livro.setAutor(autor);//faz o respectivo set
                            livro.setEditora(editora);//faz o respectivo set
                            livro.setEmprestimo("1");//faz o respectivo set
                        
                            e.alterarEmprestimoLivro(idExemplar, livro); //chama o metodo alterarEmprestimoLivro
                        } else {
                            Revista revista = new Revista(); //cria o objeto revista
                            revista.setId(idExemplar); //faz o respectivo set
                            revista.setTitulo(titulo);//faz o respectivo set
                            revista.setEmprestimo("1");//faz o respectivo set
                        
                            e.alterarEmprestimoRevista(idExemplar, revista);//chama o metodo alterarEmprestimoRevista
                        }  
                    }
                } catch (Exception ex) {
                    Logger.getLogger(efetuarEmprestimo.class.getName()).log(Level.SEVERE, null, ex); //se houver erro, retorna erro
                }
            }
        }
    }//GEN-LAST:event_jMenu1MouseClicked

    private void btnBuscarExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarExActionPerformed
        //BOTÂO BUSCAR EXEMPLAR
        String id = edtIdExemplar.getText(); //variavel recebe o valor do edit
        String categoria = (String) edtCat.getSelectedItem(); //variavel recebe o valor do edit
        
        if(categoria.equals("Revista")){ //se categoria for igual a Revista
            Acervo acervo = new Acervo(); //cria o objeto acervo
            acervo.buscarRevista(id); //chama o metodo buscarRevista
            if(acervo.buscarRevista(id)[0]==null){ //se o metodo retornar null
                JOptionPane.showMessageDialog(null, "Exemplar não encotrado!"); //janela de mensagem
            } else{
                edtTitulo.setText(acervo.buscarRevista(id)[0]); //edit recebe o valor retornado
            }
        } else{
            Acervo acervo = new Acervo(); //ria o objeto acervo
            acervo.buscarLivro(id); //chama o metodo buscarLivro
            if(acervo.buscarLivro(id)[0]==null){ //se o metodo retornar null
                JOptionPane.showMessageDialog(null, "Exemplar não encotrado!"); //janela de mensagem
            } else{
                edtTitulo.setText(acervo.buscarLivro(id)[0]); //edit recebe o valor retornado
                edtAutor.setText(acervo.buscarLivro(id)[1]);//edit recebe o valor retornado
                edtEditora.setText(acervo.buscarLivro(id)[2]);//edit recebe o valor retornado
            }        
        }
        
        
    }//GEN-LAST:event_btnBuscarExActionPerformed

    private void edtBuscarEsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtBuscarEsActionPerformed
        //BOTAO BUSCAR ESTUDANTE
        String id = edtIdEstudante.getText(); //variavel recebe o valor do edit
        
        Clientes cliente = new Clientes(); //cria o obejto cliente
        cliente.buscarEstudante(id); //chama o metodo buscarEstudante
        if(cliente.buscarEstudante(id)[0]==null){ //se o metodo retornar null
            JOptionPane.showMessageDialog(null, "Estudante não encotrado!"); //janela de mensagem
        } else {
            edtNome.setText(cliente.buscarEstudante(id)[0]); //edit recebe o valor retornado
            edtEnd.setText(cliente.buscarEstudante(id)[1]);//edit recebe o valor retornado
            edtNum.setText(cliente.buscarEstudante(id)[2]);//edit recebe o valor retornado
            edtCpf.setText(cliente.buscarEstudante(id)[3]);//edit recebe o valor retornado
            edtRg.setText(cliente.buscarEstudante(id)[4]);//edit recebe o valor retornado
        }
    }//GEN-LAST:event_edtBuscarEsActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(efetuarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(efetuarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(efetuarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(efetuarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new efetuarEmprestimo().setVisible(true);
            }
        });
    }
    
    /**Método para limpar todos os edits.
     * @return void.
     */
    public void limparFormulario(){
        edtIdExemplar.setText(""); //Limpa o campo de texto Edit
        edtTitulo.setText(""); //Limpa o campo de texto Edit
        edtIdEstudante.setText(""); //Limpa o campo de texto Edit
        edtNome.setText(""); //Limpa o campo de texto Edit  
        edtDataPrevisao.setText("");   //Limpa o campo de texto Edit
        edtAutor.setText("");   //Limpa o campo de texto Edit
        edtEditora.setText("");   //Limpa o campo de texto Edit
        edtEnd.setText("");   //Limpa o campo de texto Edit
        edtNum.setText("");   //Limpa o campo de texto Edit
        edtCpf.setText("");   //Limpa o campo de texto Edit
        edtRg.setText("");   //Limpa o campo de texto Edit
        edtCat.setSelectedIndex(0); //Limpa o campo de texto Edit
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarEx;
    private javax.swing.JTextField edtAutor;
    private javax.swing.JButton edtBuscarEs;
    private javax.swing.JComboBox<String> edtCat;
    private javax.swing.JFormattedTextField edtCpf;
    private javax.swing.JFormattedTextField edtDataPrevisao;
    private javax.swing.JTextField edtEditora;
    private javax.swing.JTextField edtEnd;
    private javax.swing.JTextField edtIdEstudante;
    private javax.swing.JTextField edtIdExemplar;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtNum;
    private javax.swing.JFormattedTextField edtRg;
    private javax.swing.JTextField edtTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
