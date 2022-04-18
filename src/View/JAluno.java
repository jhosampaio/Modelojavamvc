/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ControllerTextoAluno;
import Model.Aluno;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jhona
 */
public class JAluno extends javax.swing.JFrame {
    
    ControllerTextoAluno controle = new ControllerTextoAluno();    
    String modoInterface;
    
    public void LoadTable (){
        DefaultTableModel modelo = new DefaultTableModel (new Object[]{"RA","Nome"},0);
        
        for (int i=0 ; i<controle.lista.size();i++){
            Object linha[] = new Object []{controle.lista.get(i).getRA(),controle.lista.get(i).getNome()};
            modelo.addRow(linha);
        
        }
        tblAluno.setModel(modelo);
        tblAluno.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblAluno.getColumnModel().getColumn(1).setPreferredWidth(200);        
        tblAluno.setModel(modelo);
    
    }
    /**
     * Creates new form JAluno
     */
    public JAluno() {
        initComponents();
        setLocationRelativeTo(null);
        modoInterface = "Navegar";
        ManipulaInterface();
    }
    
    public void ManipulaInterface(){
        switch(modoInterface){
            case "Navegar":
                btnAluno_Salvar.setEnabled(false);
                btnAluno_Cancelar.setEnabled(false);
                textAluno_RA.setEnabled(false);
                textAluno_Nome.setEnabled(false);
                btnAluno_Novo.setEnabled(true);
                btnAluno_Editar.setEnabled(false);
                btnAluno_Excluir.setEnabled(false);
                btnAluno_Gravar.setEnabled(false);
                btnAluno_Ler.setEnabled(true);
                break;
            case "Novo":
                btnAluno_Salvar.setEnabled(true);
                btnAluno_Cancelar.setEnabled(true);
                textAluno_RA.setEnabled(true);
                textAluno_Nome.setEnabled(true);
                btnAluno_Novo.setEnabled(false);
                btnAluno_Editar.setEnabled(false);
                btnAluno_Excluir.setEnabled(false);
                btnAluno_Gravar.setEnabled(false);
                btnAluno_Ler.setEnabled(true);
                break;
                
            case "Editar":
                btnAluno_Salvar.setEnabled(true);
                btnAluno_Cancelar.setEnabled(true);
                textAluno_RA.setEnabled(true);
                textAluno_Nome.setEnabled(true);
                btnAluno_Novo.setEnabled(true);
                btnAluno_Editar.setEnabled(false);
                btnAluno_Excluir.setEnabled(false);
                btnAluno_Gravar.setEnabled(false);
                btnAluno_Ler.setEnabled(true);
                break;
                
            case "Gravar":
                btnAluno_Salvar.setEnabled(false);
                btnAluno_Cancelar.setEnabled(false);
                textAluno_RA.setEnabled(false);
                textAluno_Nome.setEnabled(false);
                btnAluno_Novo.setEnabled(true);
                btnAluno_Editar.setEnabled(false);
                btnAluno_Excluir.setEnabled(false);
                btnAluno_Gravar.setEnabled(false);
                btnAluno_Ler.setEnabled(true);
                break;
                
            case "Ler":
                btnAluno_Salvar.setEnabled(false);
                btnAluno_Cancelar.setEnabled(false);
                textAluno_RA.setEnabled(false);
                textAluno_Nome.setEnabled(false);
                btnAluno_Novo.setEnabled(true);
                btnAluno_Editar.setEnabled(true);
                btnAluno_Excluir.setEnabled(true);
                btnAluno_Gravar.setEnabled(true);
                btnAluno_Ler.setEnabled(true);
                break;
                
            case "Excluir":
                btnAluno_Salvar.setEnabled(false);
                btnAluno_Cancelar.setEnabled(false);
                textAluno_RA.setEnabled(false);
                textAluno_Nome.setEnabled(false);
                btnAluno_Novo.setEnabled(true);
                btnAluno_Editar.setEnabled(false);
                btnAluno_Excluir.setEnabled(false);
                btnAluno_Gravar.setEnabled(false);
                btnAluno_Ler.setEnabled(true);
                break;
                
            case "Selecao":
                btnAluno_Salvar.setEnabled(false);
                btnAluno_Cancelar.setEnabled(false);
                textAluno_RA.setEnabled(false);
                textAluno_Nome.setEnabled(false);
                btnAluno_Novo.setEnabled(true);
                btnAluno_Editar.setEnabled(true);
                btnAluno_Excluir.setEnabled(true);
                btnAluno_Gravar.setEnabled(true);
                btnAluno_Ler.setEnabled(true);
                break;
            default: System.out.println("Modo inválido");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAluno_Editar = new javax.swing.JButton();
        TabelaAluno = new javax.swing.JScrollPane();
        tblAluno = new javax.swing.JTable();
        btnAluno_Excluir = new javax.swing.JButton();
        btnAluno_Voltar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblRA = new javax.swing.JLabel();
        textAluno_RA = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        textAluno_Nome = new javax.swing.JTextField();
        btnAluno_Salvar = new javax.swing.JButton();
        btnAluno_Cancelar = new javax.swing.JButton();
        btnAluno_Novo = new javax.swing.JButton();
        btnAluno_Gravar = new javax.swing.JButton();
        btnAluno_Ler = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aluno");

        btnAluno_Editar.setText("Editar");
        btnAluno_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAluno_EditarActionPerformed(evt);
            }
        });

        tblAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "RA", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAluno.setRequestFocusEnabled(false);
        tblAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAlunoMouseClicked(evt);
            }
        });
        TabelaAluno.setViewportView(tblAluno);
        if (tblAluno.getColumnModel().getColumnCount() > 0) {
            tblAluno.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblAluno.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        btnAluno_Excluir.setText("Excluir");
        btnAluno_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAluno_ExcluirActionPerformed(evt);
            }
        });

        btnAluno_Voltar.setText("Voltar");
        btnAluno_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAluno_VoltarActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Inserir/Editar Aluno"));

        lblRA.setText("RA:");

        lblNome.setText("Nome:");

        btnAluno_Salvar.setText("Salvar");
        btnAluno_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAluno_SalvarActionPerformed(evt);
            }
        });

        btnAluno_Cancelar.setText("Cancelar");
        btnAluno_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAluno_CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblRA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textAluno_RA, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnAluno_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAluno_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 3, Short.MAX_VALUE))
                            .addComponent(textAluno_Nome))))
                .addGap(2, 2, 2))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRA)
                    .addComponent(textAluno_RA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addComponent(textAluno_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAluno_Salvar)
                    .addComponent(btnAluno_Cancelar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnAluno_Novo.setText("Novo");
        btnAluno_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAluno_NovoActionPerformed(evt);
            }
        });

        btnAluno_Gravar.setText("Gravar");
        btnAluno_Gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAluno_GravarActionPerformed(evt);
            }
        });

        btnAluno_Ler.setText("Ler");
        btnAluno_Ler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAluno_LerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAluno_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(btnAluno_Novo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnAluno_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAluno_Gravar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnAluno_Ler, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btnAluno_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(TabelaAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TabelaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAluno_Novo)
                    .addComponent(btnAluno_Editar)
                    .addComponent(btnAluno_Excluir)
                    .addComponent(btnAluno_Gravar)
                    .addComponent(btnAluno_Ler))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnAluno_Voltar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAluno_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAluno_EditarActionPerformed
        int ra = Integer.parseInt(textAluno_RA.getText());
        controle.editarAluno(ra,textAluno_Nome.getText());
        LoadTable();
        modoInterface = "Editar";
        ManipulaInterface();
        textAluno_RA.setText("");
        textAluno_Nome.setText("");;
    }//GEN-LAST:event_btnAluno_EditarActionPerformed

    private void tblAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlunoMouseClicked
        int index = tblAluno.getSelectedRow();
        if(index >= 0 && index<controle.lista.size()){
            Aluno c = controle.lista.get(index);
            textAluno_RA.setText(Integer.toString(c.getRA()));
            textAluno_Nome.setText(c.getNome());
              
        }
           
        
    }//GEN-LAST:event_tblAlunoMouseClicked

    private void btnAluno_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAluno_ExcluirActionPerformed
        String Nome = textAluno_Nome.getText();
        controle.excluirAluno(Nome);
        LoadTable();
        modoInterface = "Excluir";
        ManipulaInterface();
        textAluno_RA.setText("");
        textAluno_Nome.setText("");
        
            
        
       
    }//GEN-LAST:event_btnAluno_ExcluirActionPerformed

    private void btnAluno_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAluno_VoltarActionPerformed
        new JMenuInicial().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAluno_VoltarActionPerformed

    private void btnAluno_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAluno_SalvarActionPerformed
        
        int RA = Integer.parseInt(textAluno_RA.getText());
        controle.addAluno(RA, textAluno_Nome.getText());    
                
        LoadTable();
        modoInterface = "Navegar";
        ManipulaInterface();
        textAluno_RA.setText("");
        textAluno_Nome.setText("");
    }//GEN-LAST:event_btnAluno_SalvarActionPerformed

    private void btnAluno_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAluno_CancelarActionPerformed
        textAluno_RA.setText("");
        textAluno_Nome.setText("");
        modoInterface = "Selecao";
        ManipulaInterface();
    }//GEN-LAST:event_btnAluno_CancelarActionPerformed

    private void btnAluno_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAluno_NovoActionPerformed
        textAluno_RA.setText("");
        textAluno_Nome.setText("");
        
        modoInterface = "Novo";
        ManipulaInterface();
        
    }//GEN-LAST:event_btnAluno_NovoActionPerformed

    private void btnAluno_GravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAluno_GravarActionPerformed
        controle.gravarAluno();
    }//GEN-LAST:event_btnAluno_GravarActionPerformed

    private void btnAluno_LerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAluno_LerActionPerformed
        controle.lerAluno();
        LoadTable();
        modoInterface = "Ler";
        ManipulaInterface();
    }//GEN-LAST:event_btnAluno_LerActionPerformed

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
            java.util.logging.Logger.getLogger(JAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane TabelaAluno;
    private javax.swing.JButton btnAluno_Cancelar;
    private javax.swing.JButton btnAluno_Editar;
    private javax.swing.JButton btnAluno_Excluir;
    private javax.swing.JButton btnAluno_Gravar;
    private javax.swing.JButton btnAluno_Ler;
    private javax.swing.JButton btnAluno_Novo;
    private javax.swing.JButton btnAluno_Salvar;
    private javax.swing.JButton btnAluno_Voltar;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRA;
    private javax.swing.JTable tblAluno;
    private javax.swing.JTextField textAluno_Nome;
    private javax.swing.JTextField textAluno_RA;
    // End of variables declaration//GEN-END:variables
}
