
package View;

import Model.Clientes;
import Model.Estudante; //importa a classe Estudante
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.logging.Level; //importa exceções do try catch
import java.util.logging.Logger; //importa exceções do try catch
import javax.swing.JOptionPane; //importa swing do JOptionPane (janela de notificação)


public class cadEstudante extends javax.swing.JFrame {

    Estudante estudante = new Estudante(); //cria o objeto 'estudante' da classe Estudante
    String antiga;
    
    public cadEstudante() { //construtor 
        initComponents();
        btnEditar.setVisible(false); //ao iniciar a jaela, o botão não sera visivel
        jLabel18.setVisible(false); //ao iniciar a jaela, o label não sera visivel
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        edtdataNasc = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        edtSexo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        edtRg = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        edtCpf = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        edtId = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        edtTelefone = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        edtCelular = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        edtEmail = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        edtEnd = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        edtNum = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        edtBairro = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        edtCidade = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        edtUf = new javax.swing.JComboBox<>();
        edtCep = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        btnCadastrar = new javax.swing.JMenu();
        btnEditar = new javax.swing.JMenu();
        btnNovo = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu5.setText("jMenu5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Estudante");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados pessoais"));

        jLabel1.setText("Nome:");

        jLabel2.setText("Data de nascimento:");

        try {
            edtdataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setText("Sexo:");

        edtSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Masculino", "Feminino" }));

        jLabel4.setText("RG:");

        try {
            edtRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setText("CPF:");

        try {
            edtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel15.setText("ID do estudante:");

        edtId.setToolTipText("");
        edtId.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(edtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(edtdataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtId, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(edtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(edtdataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(edtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(edtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Contato"));

        jLabel6.setText("Telefone:");

        try {
            edtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        edtTelefone.setToolTipText("");

        jLabel7.setText("Celular:");

        try {
            edtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel8.setText("E-mail:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtEmail)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(edtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(edtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(edtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        jLabel9.setText("Rua:");

        jLabel10.setText("Número:");

        jLabel11.setText("CEP:");

        jLabel12.setText("Bairro:");

        jLabel13.setText("Cidade:");

        jLabel14.setText("Estado:");

        edtUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "AC\t ", "AL\t ", "AP\t ", "AM\t ", "BA\t ", "CE\t ", "DF", "ES\t ", "GO\t ", "MA\t ", "MT\t ", "MS\t ", "MG\t ", "PA\t ", "PB\t ", "PR\t ", "PE\t ", "PI\t ", "RJ\t ", "RN\t ", "RS\t ", "RO\t ", "RR\t ", "SC\t ", "SP\t ", "SE\t ", "TO" }));

        try {
            edtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(edtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(edtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtCidade)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(edtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11))
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edtUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(edtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(edtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(edtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(edtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(edtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(edtUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 102));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verd.png"))); // NOI18N
        jLabel17.setText("CADASTRO DE ESTUDANTE");

        jLabel18.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 102, 102));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verd.png"))); // NOI18N
        jLabel18.setText("EDITAÇÃO DE CADASTRO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel17))
                    .addComponent(jLabel18))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(19, 19, 19)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/salvar.png"))); // NOI18N
        btnCadastrar.setText("Salvar");
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseClicked(evt);
            }
        });
        jMenuBar2.add(btnCadastrar);

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/salvar.png"))); // NOI18N
        btnEditar.setText("Salvar");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });
        jMenuBar2.add(btnEditar);

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/+2.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNovoMouseClicked(evt);
            }
        });
        jMenuBar2.add(btnNovo);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/close_red.png"))); // NOI18N
        jMenu6.setText("Cancelar");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu6);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoMouseClicked
        //botão NOVO
        edtNome.setText(""); //Limpa o campo de texto Edit
        edtdataNasc.setText(""); //Limpa o campo de texto Edit
        edtSexo.setSelectedIndex(0); //Limpa o campo de texto Edit
        edtRg.setText(""); //Limpa o campo de texto Edit
        edtCpf.setText(""); //Limpa o campo de texto Edit
        edtTelefone.setText(""); //Limpa o campo de texto Edit
        edtCelular.setText(""); //Limpa o campo de texto Edit
        edtEmail.setText(""); //Limpa o campo de texto Edit
        edtEnd.setText(""); //Limpa o campo de texto Edit
        edtNum.setText(""); //Limpa o campo de texto Edit
        edtBairro.setText(""); //Limpa o campo de texto Edit
        edtCep.setText(""); //Limpa o campo de texto Edit
        edtCidade.setText(""); //Limpa o campo de texto Edit
        edtUf.setSelectedIndex(0); //Limpa o campo de texto Edit
    }//GEN-LAST:event_btnNovoMouseClicked

    private void btnCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseClicked
        //ao clicar em SALVAR, recebera todos os valores digitados e enviará para a classe Estudante
        Clientes cliente = new Clientes();
        String id = cliente.gerarId();

        try{
            String nome = edtNome.getText(); //variavel 'nome' recebe o que estiver no campo de texto Edit
            String sexo = (String) edtSexo.getSelectedItem(); //variavel 'sexo' recebe o que estiver no campo de texto Edit
            String dataNasc = edtdataNasc.getText(); //variavel 'dataNasc' recebe o que estiver no campo de texto Edit
            String cpf = edtCpf.getText(); //variavel 'cpf' recebe o que estiver no campo de texto Edit
            String rg = edtRg.getText(); //variavel 'rg' recebe o que estiver no campo de texto Edit
            String celular = edtCelular.getText(); //variavel 'celular' recebe o que estiver no campo de texto Edit
            String telefone = edtTelefone.getText(); //variavel 'telefone' recebe o que estiver no campo de texto Edit
            String email = edtEmail.getText(); //variavel 'email' recebe o que estiver no campo de texto Edit
            String end = edtEnd.getText(); //variavel 'end' recebe o que estiver no campo de texto Edit
            String bairro = edtBairro.getText(); //variavel 'bairro' recebe o que estiver no campo de texto Edit
            String cidade = edtCidade.getText(); //variavel 'cidade' recebe o que estiver no campo de texto Edit
            String cep = edtCep.getText(); //variavel 'cep' recebe o que estiver no campo de texto Edit
            String uf = (String) edtUf.getSelectedItem(); //variavel 'uf' recebe o que estiver no campo de texto Edit
            String num = edtNum.getText(); //variavel 'num' recebe o que estiver no campo de texto Edit
        
            estudante.setId(id);
            estudante.setBairro(bairro); //envia a variavel 'bairro' para o respectivo set da classe Estudante
            estudante.setCelular(celular); //envia a variavel 'celular' para o respectivo set da classe Estudante
            estudante.setCep(cep); //envia a variavel 'cep' para o respectivo set da classe Estudante
            estudante.setNome(nome); //envia a variavel 'nome' para o respectivo set da classe Estudante
            estudante.setSexo(sexo); //envia a variavel 'sexo' para o respectivo set da classe Estudante
            estudante.setCidade(cidade); //envia a variavel 'cidade' para o respectivo set da classe Estudante
            estudante.setDataNasc(dataNasc); //envia a variavel 'dataNasc' para o respectivo set da classe Estudante
            estudante.setCpf(cpf); //envia a variavel 'cpf' para o respectivo set da classe Estudante
            estudante.setEmail(email); //envia a variavel 'email' para o respectivo set da classe Estudante
            estudante.setRg(rg); //envia a variavel 'rg' para o respectivo set da classe Estudante
            estudante.setEnd(end); //envia a variavel 'end' para o respectivo set da classe Estudante
            estudante.setUf(uf); //envia a variavel 'uf' para o respectivo set da classe Estudante
            estudante.setTelefone(telefone); //envia a variavel 'telefone' para o respectivo set da classe Estudante
            estudante.setNum(num); //envia a variavel 'nm' para o respectivo set da classe Estudante

            if(cliente.adicionaEstudante(estudante)==true){ //chama o método addEstudante da classe Estudante
                JOptionPane.showMessageDialog(null,"Estudante cadastrado com sucesso!");
            }
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar o estudante!");
            Logger.getLogger(cadEstudante.class.getName()).log(Level.SEVERE, null, ex); //retorna erro
        }
    }//GEN-LAST:event_btnCadastrarMouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        //BOTÂO CANCELAR
        if (JOptionPane.showConfirmDialog(null,"Deseja realmente cancelar o cadastro?")==JOptionPane.OK_OPTION){ //abre uma notificação questionando se o usuário realmente quer cancelar o cadastro
            edtNome.setText(""); //Limpa o campo de texto Edit
            edtdataNasc.setText(""); //Limpa o campo de texto Edit
            edtSexo.setSelectedIndex(0); //Limpa o campo de texto Edit
            edtRg.setText(""); //Limpa o campo de texto Edit
            edtCpf.setText(""); //Limpa o campo de texto Edit
            edtTelefone.setText(""); //Limpa o campo de texto Edit
            edtCelular.setText(""); //Limpa o campo de texto Edit
            edtEmail.setText(""); //Limpa o campo de texto Edit
            edtEnd.setText(""); //Limpa o campo de texto Edit
            edtNum.setText(""); //Limpa o campo de texto Edit
            edtBairro.setText(""); //Limpa o campo de texto Edit
            edtCep.setText(""); //Limpa o campo de texto Edit
            edtCidade.setText(""); //Limpa o campo de texto Edit
            edtUf.setSelectedIndex(0); //Limpa o campo de texto Edit
            this.dispose(); //fecha a janela
        } 
    }//GEN-LAST:event_jMenu6MouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        edtNome.setText(""); //Limpa o campo de texto Edit
        edtdataNasc.setText(""); //Limpa o campo de texto Edit
        edtSexo.setSelectedIndex(0); //Limpa o campo de texto Edit
        edtRg.setText(""); //Limpa o campo de texto Edit
        edtCpf.setText(""); //Limpa o campo de texto Edit
        edtTelefone.setText(""); //Limpa o campo de texto Edit
        edtCelular.setText(""); //Limpa o campo de texto Edit
        edtEmail.setText(""); //Limpa o campo de texto Edit
        edtEnd.setText(""); //Limpa o campo de texto Edit
        edtNum.setText(""); //Limpa o campo de texto Edit
        edtBairro.setText(""); //Limpa o campo de texto Edit
        edtCep.setText(""); //Limpa o campo de texto Edit
        edtCidade.setText(""); //Limpa o campo de texto Edit
        edtUf.setSelectedIndex(0); //Limpa o campo de texto Edit
    }//GEN-LAST:event_formWindowClosed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        String id = edtId.getText();
        String nome = edtNome.getText(); //variavel 'nome' recebe o que estiver no campo de texto Edit
        String sexo = (String) edtSexo.getSelectedItem(); //variavel 'sexo' recebe o que estiver no campo de texto Edit
        String dataNasc = edtdataNasc.getText(); //variavel 'dataNasc' recebe o que estiver no campo de texto Edit
        String cpf = edtCpf.getText(); //variavel 'cpf' recebe o que estiver no campo de texto Edit
        String rg = edtRg.getText(); //variavel 'rg' recebe o que estiver no campo de texto Edit
        String celular = edtCelular.getText(); //variavel 'celular' recebe o que estiver no campo de texto Edit
        String telefone = edtTelefone.getText(); //variavel 'telefone' recebe o que estiver no campo de texto Edit
        String email = edtEmail.getText(); //variavel 'email' recebe o que estiver no campo de texto Edit
        String end = edtEnd.getText(); //variavel 'end' recebe o que estiver no campo de texto Edit
        String bairro = edtBairro.getText(); //variavel 'bairro' recebe o que estiver no campo de texto Edit
        String cidade = edtCidade.getText(); //variavel 'cidade' recebe o que estiver no campo de texto Edit
        String cep = edtCep.getText(); //variavel 'cep' recebe o que estiver no campo de texto Edit
        String uf = (String) edtUf.getSelectedItem(); //variavel 'uf' recebe o que estiver no campo de texto Edit
        String num = edtNum.getText(); //variavel 'num' recebe o que estiver no campo de texto Edit
        
    }//GEN-LAST:event_formWindowActivated

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        //botão SALVAR EDIÇÃO
        String id = edtId.getText();
        String nome = edtNome.getText(); //variavel 'nome' recebe o que estiver no campo de texto Edit
        String sexo = (String) edtSexo.getSelectedItem(); //variavel 'sexo' recebe o que estiver no campo de texto Edit
        String dataNasc = edtdataNasc.getText(); //variavel 'dataNasc' recebe o que estiver no campo de texto Edit
        String cpf = edtCpf.getText(); //variavel 'cpf' recebe o que estiver no campo de texto Edit
        String rg = edtRg.getText(); //variavel 'rg' recebe o que estiver no campo de texto Edit
        String celular = edtCelular.getText(); //variavel 'celular' recebe o que estiver no campo de texto Edit
        String telefone = edtTelefone.getText(); //variavel 'telefone' recebe o que estiver no campo de texto Edit
        String email = edtEmail.getText(); //variavel 'email' recebe o que estiver no campo de texto Edit
        String end = edtEnd.getText(); //variavel 'end' recebe o que estiver no campo de texto Edit
        String bairro = edtBairro.getText(); //variavel 'bairro' recebe o que estiver no campo de texto Edit
        String cidade = edtCidade.getText(); //variavel 'cidade' recebe o que estiver no campo de texto Edit
        String cep = edtCep.getText(); //variavel 'cep' recebe o que estiver no campo de texto Edit
        String uf = (String) edtUf.getSelectedItem(); //variavel 'uf' recebe o que estiver no campo de texto Edit
        String num = edtNum.getText(); //variavel 'num' recebe o que estiver no campo de texto Edit
        
        estudante.setId(id);
        estudante.setBairro(bairro); //envia a variavel 'bairro' para o respectivo set da classe Estudante
        estudante.setCelular(celular); //envia a variavel 'celular' para o respectivo set da classe Estudante
        estudante.setCep(cep); //envia a variavel 'cep' para o respectivo set da classe Estudante
        estudante.setNome(nome); //envia a variavel 'nome' para o respectivo set da classe Estudante
        estudante.setSexo(sexo); //envia a variavel 'sexo' para o respectivo set da classe Estudante
        estudante.setCidade(cidade); //envia a variavel 'cidade' para o respectivo set da classe Estudante
        estudante.setDataNasc(dataNasc); //envia a variavel 'dataNasc' para o respectivo set da classe Estudante
        estudante.setCpf(cpf); //envia a variavel 'cpf' para o respectivo set da classe Estudante
        estudante.setEmail(email); //envia a variavel 'email' para o respectivo set da classe Estudante
        estudante.setRg(rg); //envia a variavel 'rg' para o respectivo set da classe Estudante
        estudante.setEnd(end); //envia a variavel 'end' para o respectivo set da classe Estudante
        estudante.setUf(uf); //envia a variavel 'uf' para o respectivo set da classe Estudante
        estudante.setTelefone(telefone); //envia a variavel 'telefone' para o respectivo set da classe Estudante
        estudante.setNum(num); //envia a variavel 'nm' para o respectivo set da classe Estudante
        
        try {
            Clientes cliente = new Clientes(); //cria objeto cliente
            if(cliente.editaEstudante(id, estudante)==true){ //se o metodo de editar o estudante retornar true
                JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso!"); //janela de notificação exibindo que a alteração foi feita com sucesso
            }
        } catch (IOException ex) {
            Logger.getLogger(cadEstudante.class.getName()).log(Level.SEVERE, null, ex); //retorna erro
            JOptionPane.showMessageDialog(null, "Erro ao alterar o cadatro!\nERRO:"+ex.getMessage());//retorna erro
        }     
    }//GEN-LAST:event_btnEditarMouseClicked

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
            java.util.logging.Logger.getLogger(cadEstudante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadEstudante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadEstudante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadEstudante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadEstudante().setVisible(true);
            }
        });
    }
    
    public void preencheFormulario(String id, String nome, String dataNasc, String rg, String cpf, 
            String telefone, String celular, String email, String end, String num, String bairro,
            String cidade, String uf, int aux, String cep, String sexo){
        if(aux==1){ //indica se a anela de editar que est sendo solicitada
            btnNovo.setVisible(false); //caso o valor de 'aux' seja 1 o botão 'btnNovo' não sera visivel
            btnCadastrar.setVisible(false); //caso o valor de 'aux' seja 1 o botão 'btnCadastrar' não sera visivel
            btnEditar.setVisible(true); //caso o valor de 'aux' seja 1 o botão 'btnEditar' sera visivel
            
            edtdataNasc.setEnabled(false); //caso o valor de 'aux' seja 1 o campo de texto 'edtdataNasc' não sera editavel
            edtRg.setEnabled(false);  //caso o valor de 'aux' seja 1 o campo de texto 'edtRg' não sera editavel
            edtCpf.setEnabled(false);  //caso o valor de 'aux' seja 1 o campo de texto 'edtCpf' não sera editavel
            
            jLabel17.setVisible(false); //caso o valor de 'aux' seja 1 o label 'jLabel17' nao sera visivel
            jLabel18.setVisible(true); //caso o valor de 'aux' seja 1 o label 'jLabel18' sera visivel
        }  
        
        edtId.setText(id); //preenche o edit com a variavel convertida
        edtNome.setText(nome);  //preenche o edit com a variavel 'nome'
        edtdataNasc.setText(dataNasc); //preenche o edit com a variavel 'dataNasc'
        edtRg.setText(rg); //preenche o edit com a variavel 'rg'
        edtCpf.setText(cpf); //preenche o edit com a variavel 'cpf'            
        edtTelefone.setText(telefone); //preenche o edit com a variavel 'telefone'    
        edtCelular.setText(celular); //preenche o edit com a variavel 'celular'
        edtEmail.setText(email); //preenche o edit com a variavel 'email'  
        edtEnd.setText(end); //preenche o edit com a variavel 'end'
        edtNum.setText(num); //preenche o edit com a variavel 'num'
        edtBairro.setText(bairro); //preenche o edit com a variavel 'bairro'  
        edtCidade.setText(cidade); //preenche o edit com a variavel 'cidade'   
        edtUf.setSelectedItem(uf); //preenche o edit com a variavel 'uf'   
        edtSexo.setSelectedItem(sexo); //preenche o edit com a variavel 'uf'  
        edtCep.setText(cep); //preenche o edit com a variavel 'cidade'   
        
        antiga = id+";"+nome+";"+dataNasc+";"+sexo+";"+cpf+";"+rg+";"+celular+";"+telefone+";"+email+";"+end+";"+cep+";"+num+";"+bairro+";"+cidade+";"+uf;
        //JOptionPane.showMessageDialog(null, antiga);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnCadastrar;
    private javax.swing.JMenu btnEditar;
    private javax.swing.JMenu btnNovo;
    private javax.swing.JTextField edtBairro;
    private javax.swing.JFormattedTextField edtCelular;
    private javax.swing.JFormattedTextField edtCep;
    private javax.swing.JTextField edtCidade;
    private javax.swing.JFormattedTextField edtCpf;
    private javax.swing.JTextField edtEmail;
    private javax.swing.JTextField edtEnd;
    private javax.swing.JTextField edtId;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtNum;
    private javax.swing.JFormattedTextField edtRg;
    private javax.swing.JComboBox<String> edtSexo;
    private javax.swing.JFormattedTextField edtTelefone;
    private javax.swing.JComboBox<String> edtUf;
    private javax.swing.JFormattedTextField edtdataNasc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables


  
}
