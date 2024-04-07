/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.projeto.view;

import br.com.projeto.dao.ClientesDAO;
import br.com.projeto.dao.FuncionariosDAO;
import br.com.projeto.model.Clientes;
import br.com.projeto.model.Funcionarios;
import br.com.projeto.model.Utilitarios;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Roberto Dantas
 */
public class FrmFuncionarios extends javax.swing.JFrame {

    //   Metodo listar na tabela
    public void listar() {

        FuncionariosDAO dao = new FuncionariosDAO();
        List<Funcionarios> lista = dao.listarFuncionarios();
        DefaultTableModel dados = (DefaultTableModel) tabelaFuncionarios.getModel();
        dados.setNumRows(0);

        for (Funcionarios f : lista) {
            dados.addRow(new Object[]{
                f.getId(),
                f.getNome(),
                f.getRg(),
                f.getCpf(),
                f.getEmail(),
                f.getSenha(),
                f.getCargo(),
                f.getNivel_acesso(),
                f.getTelefone(),
                f.getCelular(),
                f.getCep(),
                f.getEndereco(),
                f.getNumero(),
                f.getComplemento(),
                f.getBairro(),
                f.getCidade(),
                f.getUf()
            });

        }
    }

    public FrmFuncionarios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        painel_dados = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtcel = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txtfixo = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        txtcep = new javax.swing.JFormattedTextField();
        txtend = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtnumero = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtbairro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtcidade = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtcomplemento = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cbuf = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtcpf = new javax.swing.JFormattedTextField();
        txtrg = new javax.swing.JTextField();
        btnBusca = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        txtsenha = new javax.swing.JPasswordField();
        jLabel19 = new javax.swing.JLabel();
        txtcargo = new javax.swing.JTextField();
        cbnivel = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtpesquisa = new javax.swing.JTextField();
        btnpesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFuncionarios = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnsalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 167, 79));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de Funcionários");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        painel_dados.setPreferredSize(new java.awt.Dimension(1129, 370));
        painel_dados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Código:");
        painel_dados.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 32, -1, -1));

        txtcodigo.setEditable(false);
        txtcodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });
        painel_dados.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 29, 97, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Nome:");
        painel_dados.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 76, -1, -1));

        txtnome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeActionPerformed(evt);
            }
        });
        painel_dados.add(txtnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 73, 427, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Email:");
        painel_dados.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 121, -1, -1));

        txtemail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        painel_dados.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 118, 427, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Celular:");
        painel_dados.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 121, -1, -1));

        try {
            txtcel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)  # #### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtcel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        painel_dados.add(txtcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 118, 149, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Telefone: ");
        painel_dados.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(759, 121, -1, -1));

        try {
            txtfixo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)  ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtfixo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        painel_dados.add(txtfixo, new org.netbeans.lib.awtextra.AbsoluteConstraints(826, 118, 149, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("CEP:");
        painel_dados.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 165, -1, -1));

        try {
            txtcep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtcep.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtcep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcepKeyPressed(evt);
            }
        });
        painel_dados.add(txtcep, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 162, 163, -1));

        txtend.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtendActionPerformed(evt);
            }
        });
        painel_dados.add(txtend, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 162, 397, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Endereço:");
        painel_dados.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 165, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Nº");
        painel_dados.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 165, -1, -1));

        txtnumero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        painel_dados.add(txtnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(787, 162, 100, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Bairro:");
        painel_dados.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 209, -1, -1));

        txtbairro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        painel_dados.add(txtbairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 206, 163, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Cidade:");
        painel_dados.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 209, -1, -1));

        txtcidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        painel_dados.add(txtcidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 206, 260, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Complemento: ");
        painel_dados.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 209, -1, -1));

        txtcomplemento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtcomplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcomplementoActionPerformed(evt);
            }
        });
        painel_dados.add(txtcomplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 206, 260, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("UF:");
        painel_dados.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 210, -1, -1));

        cbuf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbuf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cbuf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbufActionPerformed(evt);
            }
        });
        painel_dados.add(cbuf, new org.netbeans.lib.awtextra.AbsoluteConstraints(975, 206, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("RG:");
        painel_dados.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 253, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("CPF:");
        painel_dados.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 253, -1, -1));

        try {
            txtcpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtcpf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcpfActionPerformed(evt);
            }
        });
        painel_dados.add(txtcpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 250, 134, -1));

        txtrg.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        painel_dados.add(txtrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 250, 163, -1));

        btnBusca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBusca.setText("Pesquisar");
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });
        painel_dados.add(btnBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 73, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Senha:");
        painel_dados.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 296, -1, -1));

        txtsenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtsenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsenhaActionPerformed(evt);
            }
        });
        painel_dados.add(txtsenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 296, 160, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Cargo:");
        painel_dados.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, -1, -1));

        txtcargo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        painel_dados.add(txtcargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 263, -1));

        cbnivel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbnivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuário", "Administrador", " " }));
        cbnivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbnivelActionPerformed(evt);
            }
        });
        painel_dados.add(cbnivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 130, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("Nível de acesso:");
        painel_dados.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, 30));

        jTabbedPane1.addTab("Dados Pessoais", painel_dados);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Nome:");

        txtpesquisa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtpesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpesquisaKeyPressed(evt);
            }
        });

        btnpesquisar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnpesquisar.setText("Pesquisar");
        btnpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesquisarActionPerformed(evt);
            }
        });

        tabelaFuncionarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabelaFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "RG", "CPF", "E-mail", "Senha", "Cargo", "Nível acesso", "Telefone", "Celular", "Cep", "Endereço", "Nº", "Comp", "Bairro", "Cidade", "UF"
            }
        ));
        tabelaFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaFuncionariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaFuncionarios);
        if (tabelaFuncionarios.getColumnModel().getColumnCount() > 0) {
            tabelaFuncionarios.getColumnModel().getColumn(13).setResizable(false);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(txtpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnpesquisar)
                        .addGap(0, 575, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta de Funcionários", jPanel4);

        btnNovo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNovo.setText("+ NOVO");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnsalvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnsalvar.setText("SALVAR");
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnEditar, btnExcluir, btnNovo, btnsalvar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsalvar)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnEditar, btnExcluir, btnNovo, btnsalvar});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeActionPerformed

    private void txtcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcpfActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        new Utilitarios().limpaTela(painel_dados);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        // botão salvar

        Funcionarios obj = new Funcionarios();

        obj.setNome(txtnome.getText());
        obj.setRg(txtrg.getText());
        obj.setCpf(txtcpf.getText());
        obj.setEmail(txtemail.getText());
        obj.setSenha(txtsenha.getText());
        obj.setCargo(txtcargo.getText());
        obj.setNivel_acesso(cbnivel.getSelectedItem().toString());
        obj.setTelefone(txtfixo.getText());
        obj.setCelular(txtcel.getText());
        obj.setCep(txtcep.getText());
        obj.setEndereco(txtend.getText());
        obj.setNumero(Integer.parseInt(txtnumero.getText()));
        obj.setComplemento(txtcomplemento.getText());
        obj.setBairro(txtbairro.getText());
        obj.setCidade(txtcidade.getText());
        obj.setUf(cbuf.getSelectedItem().toString());

        FuncionariosDAO dao = new FuncionariosDAO();
        dao.cadastrarFuncionarios(obj);

        new Utilitarios().limpaTela(painel_dados);
    }//GEN-LAST:event_btnsalvarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // botão Editar

        Clientes obj = new Clientes();

        obj.setNome(txtnome.getText());
        obj.setRg(txtrg.getText());
        obj.setCpf(txtcpf.getText());
        obj.setEmail(txtemail.getText());
        obj.setTelefone(txtfixo.getText());
        obj.setCelular(txtcel.getText());
        obj.setCep(txtcep.getText());
        obj.setEndereco(txtend.getText());
        obj.setNumero(Integer.parseInt(txtnumero.getText()));
        obj.setComplemento(txtcomplemento.getText());
        obj.setBairro(txtbairro.getText());
        obj.setCidade(txtcidade.getText());
        obj.setUf(cbuf.getSelectedItem().toString());

        obj.setId(Integer.parseInt(txtcodigo.getText()));

        ClientesDAO dao = new ClientesDAO();

        dao.alterarCliente(obj);

        new Utilitarios().limpaTela(painel_dados);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // botão Excluir

        Clientes obj = new Clientes();

        obj.setId(Integer.parseInt(txtcodigo.getText()));

        ClientesDAO dao = new ClientesDAO();
        dao.excluirCliente(obj);

        new Utilitarios().limpaTela(painel_dados);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void txtendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtendActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // Carrega a lista 
        listar();
    }//GEN-LAST:event_formWindowActivated

    private void tabelaFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaFuncionariosMouseClicked
        // Pega dados
        jTabbedPane1.setSelectedIndex(0);

        txtcodigo.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 0).toString());
        txtnome.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 1).toString());
        txtrg.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 2).toString());
        txtcpf.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 3).toString());
        txtemail.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 4).toString());
        txtfixo.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 5).toString());
        txtcel.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 6).toString());
        txtcep.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 7).toString());
        txtend.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 8).toString());
        txtnumero.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 9).toString());
        txtcomplemento.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 10).toString());
        txtbairro.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 11).toString());
        txtcidade.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 12).toString());
        cbuf.setSelectedItem(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 13).toString());
    }//GEN-LAST:event_tabelaFuncionariosMouseClicked

    private void cbufActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbufActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbufActionPerformed

    private void btnpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisarActionPerformed
        // Botão pesquisar

        String nome = "%" + txtpesquisa.getText() + "%";

        ClientesDAO dao = new ClientesDAO();
        List<Clientes> lista = dao.buscaClientePorNome(nome);
        DefaultTableModel dados = (DefaultTableModel) tabelaFuncionarios.getModel();
        dados.setNumRows(0);

        for (Clientes c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getRg(),
                c.getCpf(),
                c.getEmail(),
                c.getTelefone(),
                c.getCelular(),
                c.getCep(),
                c.getEndereco(),
                c.getNumero(),
                c.getComplemento(),
                c.getBairro(),
                c.getCidade(),
                c.getUf()
            });

        }
    }//GEN-LAST:event_btnpesquisarActionPerformed

    private void txtpesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesquisaKeyPressed
        // Enter form pesquisar

        String nome = "%" + txtpesquisa.getText() + "%";

        ClientesDAO dao = new ClientesDAO();
        List<Clientes> lista = dao.buscaClientePorNome(nome);
        DefaultTableModel dados = (DefaultTableModel) tabelaFuncionarios.getModel();
        dados.setNumRows(0);

        for (Clientes c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getRg(),
                c.getCpf(),
                c.getEmail(),
                c.getTelefone(),
                c.getCelular(),
                c.getCep(),
                c.getEndereco(),
                c.getNumero(),
                c.getComplemento(),
                c.getBairro(),
                c.getCidade(),
                c.getUf()
            });

        }
    }//GEN-LAST:event_txtpesquisaKeyPressed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
        // Botão Buscar cliente por nome

        String nome = txtnome.getText();
        Clientes obj = new Clientes();
        ClientesDAO dao = new ClientesDAO();

        obj = dao.consultaPorNome(nome);

        if (obj.getNome() != null) {

            // Exibir os dados de obj nos campos de texto
            txtcodigo.setText(String.valueOf(obj.getId()));
            txtnome.setText(obj.getNome());
            txtrg.setText(obj.getRg());
            txtcpf.setText(obj.getCpf());
            txtemail.setText(obj.getEmail());
            txtfixo.setText(obj.getTelefone());
            txtcel.setText(obj.getCelular());
            txtcep.setText(obj.getCep());
            txtend.setText(obj.getEndereco());
            txtnumero.setText(String.valueOf(obj.getNumero()));
            txtcomplemento.setText(obj.getComplemento());
            txtbairro.setText(obj.getBairro());
            txtcidade.setText(obj.getCidade());
            txtcidade.setText(obj.getCidade());
            cbuf.setSelectedItem(obj.getUf());

        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
        }


    }//GEN-LAST:event_btnBuscaActionPerformed

    private void txtcepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcepKeyPressed

        //Programacao do keypress
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Clientes obj = new Clientes();
            ClientesDAO dao = new ClientesDAO();
            obj = dao.buscaCep(txtcep.getText());

            txtend.setText(obj.getEndereco());
            txtbairro.setText(obj.getBairro());
            txtcidade.setText(obj.getCidade());
            cbuf.setSelectedItem(obj.getUf());
    

        }
    }//GEN-LAST:event_txtcepKeyPressed

    private void txtsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsenhaActionPerformed

    private void txtcomplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcomplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcomplementoActionPerformed

    private void cbnivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbnivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbnivelActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnpesquisar;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JComboBox<String> cbnivel;
    private javax.swing.JComboBox<String> cbuf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel painel_dados;
    private javax.swing.JTable tabelaFuncionarios;
    private javax.swing.JTextField txtbairro;
    private javax.swing.JTextField txtcargo;
    private javax.swing.JFormattedTextField txtcel;
    private javax.swing.JFormattedTextField txtcep;
    private javax.swing.JTextField txtcidade;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcomplemento;
    private javax.swing.JFormattedTextField txtcpf;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtend;
    private javax.swing.JFormattedTextField txtfixo;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txtpesquisa;
    private javax.swing.JTextField txtrg;
    private javax.swing.JPasswordField txtsenha;
    // End of variables declaration//GEN-END:variables
}
